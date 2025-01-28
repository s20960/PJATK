function fibonacci(n) {
    if (n === 1) {
        return 0;
    }
    if (n === 2) {
        return 1;
    }

    let a = 0;
    let b = 1;
    let temp;

    for (let i = 2; i <= n; i++) {
        temp = a + b;
        a = b;
        b = temp;
    }
//0112358
    return b;
}

function palindrom(text) {
    let reversedText = '';

    for (let i = text.length - 1; i >= 0; i--) {
        reversedText += text[i];
    }

    return text === reversedText;
}

function type(argument) {
    return typeof argument;
}

function algorytm(amount, coins) {

    for (let i = 0; i < amount.length; i++) {
        for (let j = 0; j < amount.length; j++) {
            if (amount[j] > amount[j + 1]) {
                let temp = amount[j];
                amount[j] = amount[j + 1];
                amount[j + 1] = temp;
            }
        }
    }

    for (let i = 0; i < amount.length-1; i++) {
        console.log(amount[i])
    }

    let result = [];

    for (let i = 0; i < coins.length; i++) {
        while (amount >= coins[i]) {
            result.push(coins[i]);
            amount -= coins[i];
        }
    }

    if(amount===0)
        return result;
    else
        return "Zadanie nie ma rozwiązania"

}

console.log("1. Wyliczanie n-tej (parametr funkcji) liczby z szeregu Fibonacciego")
console.log("n=1 "+fibonacci(1)); // 55
console.log("n=1 "+fibonacci(-1)); // 55
console.log("n=2 "+fibonacci(2)); // 55
console.log("n=3 "+fibonacci(3)); // 55
console.log("n=4 "+fibonacci(4)); // 55
console.log("n=5 "+fibonacci(5)); // 55
console.log("n=6 "+fibonacci(6)); // 55
console.log("n=7 "+fibonacci(7)); // 55
console.log("n=8 "+fibonacci(8)); // 55

console.log("\n2. Sprawdzanie, czy podany jako argument łańcuch tekstu jest palindromem")
console.log("Słowo 'kajak': "+palindrom('kajak'));
console.log("Słowo 'narkotyki': "+palindrom('towar'));
console.log("Słowo 'narkotyki': "+palindrom('kobyła ma mały bok'));

console.log("\n3. Określanie nazwy typu dla przekazanego do funkcji argumentu")
console.log("42 - " + type(42));
console.log("Hello - " + type('Hello'));
console.log("true - " + type(true));

console.log("\n4. Konwertowanie wartości całkowitej na kolekcję monet o zadanych (jako tablica) dostępnych nominałach")
console.log(algorytm(9, [4,7,11,13,5]));
console.log(algorytm(46, [25, 10, 5, 1]));
