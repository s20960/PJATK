const express = require('express');
const bodyParser = require('body-parser');

const app = express();

app.use(bodyParser.json());

app.use((req, res, next) => {
    res.setHeader('Content-Type', 'application/json; charset=utf-8');
    next();
});

let items = [
    { id: 1, name: 'Paweł', date: "2024-01-01" },
    { id: 2, name: 'Piotrek', date: "2023-12-18" }
];

app.get('/items', (req, res) => {
    res.status(200).json(items);
});

app.get('/items/:id', (req, res) => {
	let item = items[(req.params.id)-1]
    if (item) {
        res.status(200).json(item);
    } else {
        res.status(404).json({ message: 'no such item' });
    }
});

app.post('/items', (req, res) => {
    const { name, date } = req.body;
	if(name.length<3){
		return res.status(400).json({message: 'name has to be longer'});
	}
    const newItem = {
        id: items.length > 0 ? items[items.length-1].id+1 : 1,
        name,
        date//: new Date().toISOString().split('T')[0]
    };
    items.push(newItem);
    res.status(201).json(newItem);
});

app.put('/items/:id', (req, res) => {
	let id = parseInt(req.params.id, 10);
	if(id>items.length){
		return res.status(400).json({message: "Index Out of Bounds Exception "});
	}
	const { name, date } = req.body;
 	items[id-1] = {id, name, date};
	res.status(200).json(items[id-1]);
});

app.delete('/items/:id', (req, res) => {
	
	let id = req.params.id;
	if(id>items.length){
		return res.status(400).json({message: "Index Out of Bounds Exception "});
	}
	items.splice(id-1, 1);
	res.status(204);
});

app.listen(8080, () =>{
	console.log("serwer funkcjonuje");
});
