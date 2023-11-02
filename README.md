# Spring Boot Starter Kit
てっとり早くSpring Bootを学習したい人のための環境構築済みのプロジェクトです。  
以下のモジュールが含まれています。

以下の機能が学べます
- spring boot 
- データベース(SQLiteを使用、サーバーレスのデータベースエンジン)
- テンプレートエンジン(thymeleaf)
- TypeScript
- 単体テスト
- もちろんHTML、CSS、JavaScriptも

## 目次

- [インストール](#install)
- [VSCode拡張機能](#vscode)
- [実行方法](#howtorun)
- [確認方法](#confirm)
- [単体テスト](#test)
- [ディレクトリ構成について](#dir)
- [TODO](#todo)


## インストール <a name="install"></a>
以下のツールを各サイトからダウンロードしてインストールしてください。

- JDK17

    Javaの開発キットです。

    https://www.oracle.com/jp/java/technologies/downloads/  
    ※ JDK17、Windowsを選択
    ※ 環境変数の設定もやってくれるので、zip版よりexe/msi版の方が楽でしょう。

- VSCode(統合開発環境)

    VSCodeは、シンプルで使いやすいインターフェースと高いカスタマイズ性を備えた人気のあるソースコードエディタです。  
    開発者にとって効率的なコーディング環境を提供するため、幅広いプログラミング言語やプロジェクトの開発に利用されています。

    https://code.visualstudio.com/download

- npm

    JavaScriptベースのプロジェクトで使用されるパッケージ管理システムです。npmを使用することで、他の開発者が共有しているJavaScriptライブラリやツールをプロジェクトに追加することができます。

    https://nodejs.org/en/download

    ※ 64bit版 Windows Installerを選択

- A5:SQL Mk-2
    A5:SQL Mk-2は複雑化するデータベース開発を支援するために開発されたフリーのSQLクライアントです。  
    SQLを実行したり、テーブルを編集するほかに、SQLの実行計画を取得したり、ER図を作成したりすることが出来ます。

    https://a5m2.mmatsubara.com/

## VSCode拡張機能 <a name="vscode"></a>

プロジェクトをVSCodeで開くとおすすめ拡張機能のインストール確認があると思いますので、インストールしてください。  
![インストール確認](images/extensions_install.png)

- Spring Boot Extension Pack

    Spring Boot アプリケーションを開発するための拡張機能のコレクション。

    - Spring Boot Tools

        Spring Boot の「application.properties」、「application.yml」プロパティ ファイルの検証とコンテンツ支援を提供します。ブート固有の「.java」ファイルのサポートも同様です。

    - Spring Initializr Java Support

        クイックスタート Spring Boot Java プロジェクトを生成するための Spring Initializr に基づく軽量の拡張機能。

- Gradle for Java

    Gradle プロジェクトを管理し、Gradle タスクを実行します。

### 便利な拡張機能
- Comment Translate

    このプラグインは、Google Translate API を使用して、ソースに記述されているコメントを翻訳します。  
    フレームワークの機能を理解するのに役立ちます。

    ※ 設定 > 拡張機能 > Comment Translate > Target Language で "ja" を指定しておく。

- Google Translate

    Google Translate API を使用してコードを翻訳します。
    こちらは選択文字列をCtrl+Shift+Tで翻訳してくれます。  
    ※ 設定 > 拡張機能 > Google Translate > Google Translate Ext: Languages で "ja" を追加。

## 実行方法  <a name="howtorun"></a>

アクティビティサイドバーGradleを選択してサイドバーを切り替えます。  
切り替えたらdemo > Tasks > application > bootRun から DebugTask を実行します。

![実行方法](images/springboot_debug.png)

## 確認方法  <a name="confirm"></a>

ブラウザで http://localhost:8080/hello を開いて、「Hello World!」と表示されれば成功です。

## 単体テスト <a name="test"></a>

単体テストは、テストクラスを開いてチェックアイコンをクリックするか、右クリックから「テストを実行する」を選択して実行できます。

![単体テスト](images/springboot_test.png)

## ディレクトリ構成について <a name="dir"></a>

| ディレクトリ             | 説明                             |
|--------------------------|----------------------------------|
| build                    | src配下のbuild結果を格納する場所 |
| src                      | ルート                           |
| src/main                 | 各種ソースの格納先               |
| src/main/java            | Javaソースコード                 |
| src/main/resources       | 様々なリソースを置く場所         |
| src/main/resources/static| 静的コンテンツ<br/> 画像ファイル/CSS/JavaScriptなどはここに配置します。  |
| src/main/resources/templates| thymeleafのテンプレート       |
| src/ts                   | TypeScriptのソースコード<br/>BuildするとJavaScriptにコンパイルされ、staticディレクトリに配置されます。 |
| src/test                 | テストコードの格納先             |

## TODO <a name="todo"></a>

このあたりも対応したいですね。

[ ] sass対応
[ ] vue対応
[ ] gulp対応
[ ] TypeScriptの単体テスト
