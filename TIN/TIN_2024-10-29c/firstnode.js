var http = require('http');
var url = require('url');

http.createServer(function (req, res) {
  
  var q = url.parse(req.url, true);
  
  var dzialanie = q.pathname.slice(1);
  var q = q.query
  
  var x = Number(q.x);
  var y = Number(q.y);
  
  if(isNaN(x)||isNaN(y)){
	  res.writeHead(400, {'Content-Type':'text/html'});
	  res.end('arguments are nut numbers');
	  return;
  }
  
  var txt = dzialanie+" "+x+" "+y
  
  var answer;
  
  switch (dzialanie) {
		case 'dodawanie':
			answer = x + y;
			break;
		case 'odejmowanie':
			answer = x - y;
			break;
		case 'mno%C5%BCenie':
			answer = x * y;
			break;
		case 'dzielenie':
			if (y === 0) {
				res.writeHead(400, {'Content-Type':'text/html'});
				res.end('y cant be equal to 0');
				return;
			}
			answer = x / y;
			break;
		default:
			res.writeHead(400, {'Cotent-Type':'text/html'});
			res.end('this is not an action '+ txt);
			return;
  }
  
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.end(txt+' result = ' + answer)
}).listen(8080);
