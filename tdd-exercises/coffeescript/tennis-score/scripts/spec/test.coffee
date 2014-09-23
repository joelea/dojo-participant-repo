describe 'Tennis Game', ->
  game = null

  beforeEach ->
    game = new TennisGame()

  it 'Should be love all when no points are scored', ->
    expect(game.getScore()).to.equal 'Love All'