describe 'Startup Server', ->
  it 'should return an unknown query response when the query is invalid', ->
    expect(responseFor("blooga blagah")).to.equal "Unknown Query blooga blagah"