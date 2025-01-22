#!/usr/bin/env bash
set -x

# This script is responsible for decrypting your encrypted signing key file
# and importing it into the gpg keystore.
# This is done so that your maven build will be able to properly sign your jars
# prior to publishing them on maven central.

echo "Importing signing key..."

# Create a temporary directory for secure operations
TEMP_DIR="$(mktemp -d)"
chmod 700 "${TEMP_DIR}"

# Cleanup function to ensure no sensitive files are left behind
cleanup() {
    rm -rf "${TEMP_DIR}"
    gpgconf --kill gpg-agent
}

# Set trap to ensure cleanup runs on exit
trap cleanup EXIT

# Decode and import the base64 encoded GPG key from GitHub secrets
echo "${GPG_PRIVATE_KEY}" | base64 -d > "${TEMP_DIR}/signing.key"
chmod 600 "${TEMP_DIR}/signing.key"

# Setup GPG configuration for maven signing
mkdir -p ~/.gnupg
chmod 700 ~/.gnupg
echo "use-agent" > ~/.gnupg/gpg.conf
echo "pinentry-mode loopback" >> ~/.gnupg/gpg.conf
echo "allow-loopback-pinentry" > ~/.gnupg/gpg-agent.conf
chmod 600 ~/.gnupg/*

# Import the key into gpg keystore
gpg --batch --import "${TEMP_DIR}/signing.key"

echo "Signing key import finished!"