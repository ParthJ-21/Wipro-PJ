var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
console.log("EX21");
var stringBox = new Box("Parth Jaiswal");
console.log(stringBox.getValue());
var numberBox = new Box(2106);
console.log(numberBox.getValue());
var boolBox = new Box(false);
console.log(boolBox.getValue());
