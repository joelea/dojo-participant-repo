describe 'Bowling Game', ->
  game = null

  beforeEach ->
    game = new Game()

  it 'should have a score of 0 if no pins are knocked over', ->
    [1..20].map -> game.score(0)
    expect(game.getScore()).to.equal 0