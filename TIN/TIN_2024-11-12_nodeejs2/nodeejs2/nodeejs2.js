var mysql = require('mysql');
var express = require('express');

var app = express();
app.use(express.static('public'));
app.use(express.urlencoded({ extended: true })); //middleware
app.set('view engine', 'ejs');

var con = mysql.createConnection({
  host: "localhost",
  user: "loman",
  password: "1234",
  database: "mydb"
});

con.connect(function(err) {
  if (err) 
	throw err;
  console.log("Connected!");
});


//endpoints
//wyświetlenie listy
app.get('/list', (req, res) => {
	var sql = "select * from customers";
	con.query(sql, (err, result) => {
		if (err) 
			throw err;
		res.render('list', {customers: result});
	});
});
//dodawanie:
app.post('/action', (req, res) => {
  const { name, address } = req.body;
  const sql = "INSERT INTO customers (name, adress) VALUES (?, ?)";
  con.query(sql, [name, address], (err, result) => {
    if (err) 
		throw err;
    console.log('Record added:', result);
    res.redirect('/list');
  });
});
//szczegóły
app.get('/details/:id', (req, res) =>{
	var id = req.params.id;
	var sql = "select * from customers where id = ?";
	con.query(sql, [id], (err, result) =>{
		if(err) 
			throw err;
	if (result.length > 0) {
      res.render('details', { customer: result[0] });
    } else {
      res.status(404).send('Customer not found');
    }
	});
});


//routes
//lista
app.get('/list', (req, res) => {
  res.render('list');
});
//dodawanie
app.get('/dodawanie', (req, res) => {
  res.render('dodawanie');
});
//szczegóły
/*
app.get('/details/:id',(req, res)=>{
	res.render('details')
});
*/





app.listen(8080);














  /*
  con.query("CREATE DATABASE mydb", function (err, result){
	if (err) throw err;
	console.log("Database created")
  });
  */
  
  /*
  var sql = "create table customers(name varchar(255), adress varchar(255))";
  
  con.query(sql, function(err, result){
	if (err) throw err;
	  console.log("Table created")  
  });
  */
  
  /*
  var sql = "alter table customers add column id int auto_increment primary key";
  
  con.query(sql, function (err, result){
	  if (err) throw err;
	console.log("table altered");
  })
  */
  
  /*
  var sql = "INSERT INTO customers (name, adress) VALUES ('Company Inc', 'Highway 37')";
  
  con.query(sql, function(err, result){
	if (err) throw err;
	  console.log("Row inserted")  
  });
  */
  
    /*
  var sql = "insert into customers (name, adress) values ?";
  var values =[
	['John', 'Highway 71'],
    ['Peter', 'Lowstreet 4'],
    ['Amy', 'Apple st 652'],
    ['Hannah', 'Mountain 21'],
    ['Michael', 'Valley 345'],
    ['Sandy', 'Ocean blvd 2'],
    ['Betty', 'Green Grass 1'],
    ['Richard', 'Sky st 331'],
    ['Susan', 'One way 98'],
    ['Vicky', 'Yellow Garden 2'],
    ['Ben', 'Park Lane 38'],
    ['William', 'Central st 954'],
    ['Chuck', 'Main Road 989'],
    ['Viola', 'Sideway 1633']
  ];
  con.query(sql, [values], function(err, result){
	  if(err) throw err;
  console.log("Number of records inserted: "+result.affectedRows);
  });
  */
  
  /*
  var sql = "insert into customers(name, adress) values('Michelle', 'Blue Village 1')";
  
  con.query(sql, function(err, result){
	  if(err) throw err;
	console.log("numer idka: "+result.insertId)
  });
  */
  
  /*
  var sql = "SELECT id, name, adress FROM customers";
  
  con.query(sql, function(err, result, fields){
	if (err) throw err;
	  console.log(JSON.parse(JSON.stringify(result)));
  });
  */
  