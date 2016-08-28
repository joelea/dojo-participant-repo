import * as _ from 'lodash'
import * as mocha from 'mocha'
import {expect} from 'chai'

import {TennisGame} from './tennis-score.ts'

describe('Tennis Game', () => {
    let game: TennisGame = null;

    beforeEach(() => {
        game = new TennisGame();
    });

    it('should be love all when no points have been scored', () => {
        expect(game.getScore()).to.equal('Love All')
    });
});
