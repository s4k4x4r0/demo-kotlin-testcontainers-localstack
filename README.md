

## プロジェクト作成時のコマンド（記録）

プロジェクト作成時のみ実行する。

```bash
curl -s "https://get.sdkman.io" | bash
sdk install gradle 
gradle init \
--type kotlin-application \
--dsl kotlin \
--package com.example.demo \
--project-name demo-kotlin-lsp \
--no-split-project  \
--java-version 21
```