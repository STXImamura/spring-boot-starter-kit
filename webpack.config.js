const path = require('path');

module.exports = {
    // モード値を production に設定すると最適化された状態で、
    // development に設定するとソースマップ有効でJSファイルが出力される
    mode: "production",
    module: {
      rules: [
        {
          // 対象となるファイルの拡張子(cssのみ)
          test: /\.css$/,
          // Sassファイルの読み込みとコンパイル
          use: [
            // スタイルシートをJSからlinkタグに展開する機能
            "style-loader",
            // CSSをバンドルするための機能
            "css-loader"
          ],
        },
      ],
    },
    output: {
      path: path.resolve(__dirname, './build/resources/main/static/dist'),
      filename: 'main.js'
    }    
  };