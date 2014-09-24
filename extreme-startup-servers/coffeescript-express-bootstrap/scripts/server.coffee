express = require('express')
responses = require('./app.js')
app = express()

app.get '/', (req, res) ->
  query = req.param("q")
  answer = responses.responseFor query
  console.log query
  res.end answer


server = app.listen 1337, ->
  console.log 'Listening on port %d', server.address().port