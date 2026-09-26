const lines = require('fs').readFileSync(0,'utf8').split('\n').map(l => l.replace(/\r$z/, ''));
let idx = 0;
const next = () => lines[idx++];
