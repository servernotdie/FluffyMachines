#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
JAR_PATH="${SCRIPT_DIR}/libs/Slimefun-Build-79809c0a.jar"

if [ ! -f "${JAR_PATH}" ]; then
    echo "File not found: ${JAR_PATH}"
    exit 1
fi

mvn install:install-file \
    -Dfile="${JAR_PATH}" \
    -DgroupId=com.github.servernotdie \
    -DartifactId=Slimefun4 \
    -Dversion=79809c0a \
    -Dpackaging=jar

echo "Installed com.github.servernotdie:Slimefun4:79809c0a into the local Maven repository."
echo "You can now run: mvn clean package"