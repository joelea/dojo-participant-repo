express = require('express')
responses = require('./app.js')
app = express()

app.get '/', (req, res) ->
  query = req.param("q")
  answer = responses.responseFor query
  res.end answer

server = app.listen 3000, ->
  console.log 'Listening on port %d', server.address().port