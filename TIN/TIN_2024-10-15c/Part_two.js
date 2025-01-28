class Person {
    constructor(name, surename) {
        this._name = name;
        this._surename = surename;
    }

    get name() {
		return this._name;
	}
    get surename() {
		return this._surename;
	}
    set name(name) {
		this._name = name;
	}
    set surename(surename) {
		this._surename = surename;
	}
}

class Klient extends Person {
    constructor(name, surename, amount) {
        super(name, surename);
        this._amount=amount;
    }

    get amount() {
		return this._amount;
	}
    set amount(amount) {
		this._amount = amount;
	}
}

class Diler extends Person {
    constructor(name, surename, experience) {
        super(name, surename, experience);
        this._experience = experience;
    }

    get experience() {
		return this._experience;
	}
    set experience(experience) {
		this._experience = experience;
	}
}

const Przemek = new Klient('Przemek', 'Kowalski', 20);
console.log("Cześć, jestem "+ Przemek.name + " " + Przemek.surename+", mam " + Przemek.amount + " zł w portfelu")

const Marcin = new Diler('Marcin', 'Nowak', 2.5);
//Marcin.experience(30);
console.log("Cześć, jestem "+ Marcin.name + " " + Marcin.surename+", przetrwałem już " + Marcin.experience + " lat roznosząc towar")