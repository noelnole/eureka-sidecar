var Router = require('koa-router');
const api = new Router();
var json = require('koa-json');

api.get('/hello',async (ctx, next) => {
  ctx.body = 'hola';
});

api.get('/health',async(ctx, next) => {
  ctx.body = { status: 'UP' };
})

//export default api; si ejecutamos con babel

module.exports = api;
