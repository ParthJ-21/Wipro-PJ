var numbers = [1,2,3,4];
const sum = (arr) => arr.reduce((total, num) => total + num, 0);
console.log("This is EX-1");
console.log(sum(numbers));

const doubleNumbers = (arr2) => arr2.map(num => num * 2);
console.log("This is EX-2");
console.log(doubleNumbers([1,2,3,4]));