console.log("EX17");
var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var calc = new Calculator();
console.log("Sum:", calc.add(3, 2));
console.log("difference:", calc.subtract(3, 2));
