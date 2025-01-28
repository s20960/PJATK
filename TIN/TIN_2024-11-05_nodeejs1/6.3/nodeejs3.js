var express = require('express');
const path = require('path');

var app = express();

app.use(express.static('public')); //za³¹cza publica jako statyczny folder

app.use(express.urlencoded({ extended: true })); //middleware

app.set('view engine', 'ejs'); //mówi programowi ¿e to jest ejs

app.get('/', (req, res) =>{
	res.render('form');
})

app.post('/action', (req, res) =>{
	var {nick, email, message} = req.body;
	res.render('answer', {nick, email, message});
})

app.listen(8080);