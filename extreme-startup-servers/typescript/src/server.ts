import * as express from "express";

import {respondTo} from "./respondTo";

const app = express();

app.get("/", (request: express.Request, response: express.Response) => {
    const query = request.query["q"];
    const answer = respondTo(query);
    response.end(answer);
});


const PORT = 1337;
app.listen(PORT, () => {
    console.log(`Typescript Extreme Startup Server running on port ${PORT}`);
});
