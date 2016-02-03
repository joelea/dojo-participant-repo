/// <reference path="../typings/tsd.d.ts" />

import { TennisGame } from './tennis-score.ts'
import * as chai from 'chai'
import * as _ from 'lodash'

const {expect} = chai;

describe('Tennis Game', () => {
    let game: TennisGame = null;

    beforeEach(() => {
        game = new TennisGame();
    });

    it('should be love all when no points have been scored', () => {
        expect(game.getScore()).to.equal('Love All')
    });
});