var child_process = require('child_process');
var _ = require('lodash');

var outputDir = __dirname + '/build';
var outputFilename = "tests.js";
var outputPath = outputDir + '/' + outputFilename;

var mochaPath = __dirname + "/node_modules/mocha/bin/mocha";

function WebpackAfterEmitPlugin(callback) {
  this.callback = callback;
}

WebpackAfterEmitPlugin.prototype.apply = function(compiler) {
  compiler.plugin('done', this.callback);
};

module.exports = {
  entry: './src/bowling-game-spec.ts',
  output: {
    path: outputDir,
    filename: outputFilename
  },
  plugins: [
    new WebpackAfterEmitPlugin(function() {
      _.defer(function() {
        try {
          child_process.execSync(mochaPath + ' ' + outputPath, {stdio: 'inherit'})
        } catch (e) {

        }
      });
    })
  ],
  module: {
    loaders: [
      {test: /\.ts$/, loader: 'ts-loader'}
    ]
  }
};
