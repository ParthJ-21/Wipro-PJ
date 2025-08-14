class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}
console.log("EX21");
let stringBox = new Box<string>("Parth Jaiswal");
console.log(stringBox.getValue());

let numberBox = new Box<number>(2106);
console.log(numberBox.getValue());

let boolBox = new Box<boolean>(false);
console.log(boolBox.getValue());