console.log("EX17");
class Calculator {
    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}
let calc = new Calculator();

console.log("Sum:", calc.add(3,2));
console.log("difference:", calc.subtract(3,2));