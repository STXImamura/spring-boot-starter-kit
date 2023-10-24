# Spring Boot Starter Kit
てっとり早くSpring Bootを学習したい人のための環境構築済みのプロジェクトです。  
以下のモジュールが含まれています。

以下の機能が学べます
- spring boot 
- データベース(SQLite サーバーレスのデータベースエンジン)
- テンプレートエンジン(thymeleaf)
- 単体テスト
- もちろんHTML、CSS、JavaScriptも

## 目次

- [インストール](#install)
- [VSCode拡張機能](#vscode)
- [実行方法](#howtorun)
- [確認方法](#confirm)


## インストール <a name="install"></a>
以下のツールを各サイトからダウンロードしてインストールしてください。

- VSCode(統合開発環境)

    VSCodeは、シンプルで使いやすいインターフェースと高いカスタマイズ性を備えた人気のあるソースコードエディタです。  
    開発者にとって効率的なコーディング環境を提供するため、幅広いプログラミング言語やプロジェクトの開発に利用されています。

    https://code.visualstudio.com/download

- JDK17  
    Javaの開発キットです。

    https://www.oracle.com/jp/java/technologies/downloads/  
    ※ JDK17、Windowsを選択
    ※ 環境変数の設定もやってくれるので、zip版よりexe/msi版の方が楽でしょう。

- A5:SQL Mk-2
    A5:SQL Mk-2は複雑化するデータベース開発を支援するために開発されたフリーのSQLクライアントです。  
    SQLを実行したり、テーブルを編集するほかに、SQLの実行計画を取得したり、ER図を作成したりすることが出来ます。

    https://a5m2.mmatsubara.com/

## VSCode拡張機能 <a name="vscode"></a>

VSCodeを起動して、Ctrl+Shift+Xで拡張機能を開き、以下を検索してインストールします。  
紛らわしい名前がある場合、評価が高いものをインストールしましょう。

お好みでインストール
- Japanese Language Pack for VS Code

必須
- Extension Pack for Java
- Debugger for Java

その他便利な拡張
- Comment Translate

    メソッドなどにマウスカーソルを合わせるとコメントがポップアップするのですが、  
    これはそのポップアップしたコメントを自動的に翻訳してくれます。  
    フレームワークの機能を知るのに便利です。

    ※ 設定 > 拡張機能 > Comment Translate > Target Language で "ja" を指定しておく。

- Google Translate

    こちらは選択文字列をCtrl+Shift+Tで翻訳してくれます。  
    ※ 設定 > 拡張機能 > Google Translate > Google Translate Ext: Languages で "ja" を追加。

有料ですが便利な拡張  
- GitHub Copikit

    GitHub Copilotは、AIモデルを活用してコード補完や自動生成を行う開発ツールです。  
    具体的には、GitHub Copilotは、コードエディタ内で開発者がコードを書いている際に、  
    その文脈に基づいた補完や提案を行います。  
    これにより、開発者は短時間で正確なコードを作成することができます。

- GitHub Copilot Chat

    プログラミングに関する質問や課題を解決するためのチャットボットです。  
    GitHub Copikitの契約内で使えます。  

- Code GPT

    OpenAI APIを利用したチャットボットです。

## 実行方法  <a name="howtorun"></a>

VSCodeを起動したら、ファイル > フォルダーを開く で、このプロジェクトを開きます。  
F5キーでプロジェクトを実行できます。  
その際、右下にエラーダイアログが出た場合は、Fixボタンを押してDemoApplication.javaを選びます。

## 確認方法  <a name="confirm"></a>

ブラウザで http://localhost:8080/hello を開いて、「Hello World!」と表示されれば成功です。

## ファイルについて
