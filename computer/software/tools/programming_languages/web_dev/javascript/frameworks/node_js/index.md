---
runme:
  id: 01HVTV1AYJ8NGPPTS0EQM0TSXM
  version: v3
---

# Node.js

## sync vs async

```javascript {"id":"01HVV7X0AZQX1GG9HTWRJWAAMP"}
const { readFileSync } = require('fs');

const file = readFileSync('hello.txt', 'utf-8');

console.log(file);
console.log('this will show second')
```

```javascript {"id":"01HVV7Y6KWXGTQNQ2PNX03PD1D"}
const { readFile } = require('fs');

readFile('hello.txt', 'utf-8', (err, text) => {
  console.log(text);
});

console.log('this will show first');
```

```javascript {"id":"01HVV8FSMJBJP0WJ9NWZN37KWY"}
const { readFile } = require('fs').promises;

async function getFile() { const file = await readFile('hello.txt', 'utf-8'); return file; }

console.log(getFile());
```

## Express

```javascript {"id":"01HVV91QM1KQ176BA358868J68"}
const express = require('express');

const app = express();

app.listen(3000)
```

### Scripts to run for Express projects

```json
"scripts": {
  "build": "tsc -p .",
  "dev": "nodemon src/server.ts",
  "start": "node dist/server.js",
}
```

### Middlewares

#### `bodyParser` [-deprecated-]

```js
app.use(bodyParser.urlencoded({extended: false}))
app.use(bodyParser.json())
```

#### alternative bodyParser

```js
app.use(express.urlencoded({extended: true}))
app.use(express.json())
```

### URL Params

```js
app.get("/name/:name/age/:age", (req, res) => {
  res.send({
    name: req.params.name,
    age: req.params.age
  })
});
```

### Post with `body`

```js
app.post("/:name/:age", (req, res) => {
  res.send({
    body: req.body,
    params: {
      name: req.params.name,
      age: req.params.age
    }
  })
});
```

### Database Connection

#### Creating Connection Pool

```js
const pool = mysql.createPool({
  host: '127.0.0.1',
  user: 'root',
  password: 'soso',
  database: 'mysql_db'
  connectionLimit: 10,
  multipleStatements: true
})
```

#### Operations on database

```js
pool.getConnection((err, conn) => {
  if (err) {
    // we can even send a response to client with the error
    console.log("error");
  } else {
    conn.query(
      "SELECT * FROM User WHERE user_id=?",
      [req.params.id],
      (err, rows) => {
        if (err) {
          console.log("error");
        }

        res.send(rows);

        conn.release();
      }
    );
  }
});
```

### Environment Variables

```js
import dotenv from 'dotenv';

dotenv.config();

console.log(process.env.PORT);
```

```.env
PORT = 3000
```

### Creating Router

```org
# folder structure

src
  |
  -- routes
      |
      -- index.js
      |
      -- user.routes.js
```

```js
// index.js
import {Router} from express;
import userRoutes from './user.routes';

const Routes = Router()

Routes.use('/user', userRoutes);

export default routes;
```

```js
// user.routes.js
import {Router} from 'express';

const userRouter = Router();

userRouter.get('/', (req, res) => {
  return res.json("OK")
})

export default userRouter;
```

## References

### Docs

- [Node.js](https://nodejs.org/en/)

### Tutorials