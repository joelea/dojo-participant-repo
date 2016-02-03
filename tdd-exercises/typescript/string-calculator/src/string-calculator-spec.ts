/// <reference path="../typings/tsd.d.ts" />

import { stringCalculator } from './string-calculator.ts'
import * as chai from 'chai'

const {expect} = chai;

describe('String calculator', () => {
    it('should give 0 when asked to sum no numbers', () => {
        expect(stringCalculator('')).to.equal(0)
    });
});