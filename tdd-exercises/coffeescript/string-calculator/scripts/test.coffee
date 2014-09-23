describe 'String calculator', ->
  it 'should give 0 when asked to sum no numbers', ->
    expect(add("")).to.equal 0