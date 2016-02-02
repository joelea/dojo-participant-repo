/// <reference path="../typings/tsd.d.ts" />

import { stringCalculator } from './string-calculator.ts'
import * as chai from 'chai'

const {expect} = chai;

describe('a test', () => {
    it('should work', () => {
        expect(stringCalculator('')).to.equal(0)
    });
});