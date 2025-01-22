#!/bin/bash

# This script will publish the aggregated javadocs found in the project's "target" directory.
# The javadocs are committed and pushed to the git repository's gh-pages branch.
# Be sure to customize this file to reflect your SDK project's settings (git url)

# Get latest tag if GITHUB_REF_NAME is not set
if [ -z "$GITHUB_REF_NAME" ]; then
    GITHUB_REF_NAME=$(git describe --tags `git rev-list --tags --max-count=1`)
fi

# Get repository name if not set
if [ -z "$GITHUB_REPOSITORY" ]; then
    GITHUB_REPOSITORY="IBM/event-notifications-java-admin-sdk"
fi

printf "\n>>>>> Publishing javadoc for release build: repo=%s tag=%s\n" ${GITHUB_REPOSITORY} ${GITHUB_REF_NAME}

printf "\n>>>>> Cloning repository's gh-pages branch into directory 'gh-pages'\n"
rm -fr ./gh-pages
git clone --branch=gh-pages https://${GH_TOKEN}@github.com/${GITHUB_REPOSITORY}.git gh-pages

printf "\n>>>>> Finished cloning...\n"

pushd gh-pages

# Create a new directory for this tag and copy the aggregated javadocs there.
printf "\n>>>>> Copying aggregated javadocs to new tagged-release directory: %s\n" ${GITHUB_REF_NAME}
rm -rf docs/${GITHUB_REF_NAME}
mkdir -p docs/${GITHUB_REF_NAME}
cp -rf ../target/site/apidocs/* docs/${GITHUB_REF_NAME}

printf "\n>>>>> Generating gh-pages index.html...\n"
../build/generateJavadocIndex.sh > index.html

# Update the 'latest' symlink to point to this tag
pushd docs
rm -f latest
ln -s ./${GITHUB_REF_NAME} latest
printf "\n>>>>> Updated 'docs/latest' symlink:\n"
ls -l latest
popd

printf "\n>>>>> Committing new javadoc...\n"
git config --global user.email "nitish.kulkarni3@ibm.com"
git config --global user.name "nitish-sudo"
git add -f .
git commit -m "Javadoc for release ${GITHUB_REF_NAME}"
git push -f origin gh-pages

popd

printf "\n>>>>> Published javadoc for release build: repo=%s tag=%s\n" ${GITHUB_REPOSITORY} ${GITHUB_REF_NAME}