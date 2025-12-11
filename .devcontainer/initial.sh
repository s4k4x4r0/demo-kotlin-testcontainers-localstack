#!/bin/bash

[ -f .extensions/kotlin.vsix ] && exit 0

mkdir -p .extensions/
curl -L -o .extensions/kotlin.vsix https://download-cdn.jetbrains.com/kotlin-lsp/261.13587.0/kotlin-lsp-261.13587.0-linux-aarch64.vsix
