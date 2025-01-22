#!/bin/bash

# This script will check $GITHUB_REF to see if we need to run maven to
# set the artifact version #'s.

if [[ $GITHUB_REF == refs/tags/* ]]; then
    VERSION=${GITHUB_REF#refs/tags/}
    printf "\n>>>>> Setting artifact version #'s to: %s\n" ${VERSION}
    mvn versions:set -DnewVersion=${VERSION} -DgenerateBackupPoms=false
else
    printf "\n>>>>> Bypassing artifact version setting for non-tagged build\n"
fi