import * as _ from 'lodash'
import * as mocha from 'mocha'
import {expect} from 'chai'

import {respondTo} from '../src/respondTo'

describe("respondTo", () => {
    it("should return an unknown query message when the query is unrecognized", () => {
        expect(respondTo("Invalid query")).to.equal("Unknown query 'Invalid query'")
    });
});
