/// <reference path="../typings/tsd.d.ts" />

import { Game } from './bowling-game.ts'
import * as chai from 'chai'
import * as _ from 'lodash'

const {expect} = chai;

describe('Bowling Game', () => {
    let game = null;

    beforeEach(() => {
        game = new Game();
    });

    it('should have a score of 0 if no pins are knocked over', () => {
        game.score(0);
        expect(game.getScore()).to.equal(0)
    });
});