const obj1 = { a: 1, b: 2 };
const obj2 = { b: 3, c: 4 };

const mergedObj = { ...obj1, ...obj2 };
console.log("EX7");
console.log(mergedObj);

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const newArr = [0, 12, ...arr1, 11, 7, ...arr2, 2, 1];
console.log("EX8");
console.log(newArr);

function sum(a, b, c) {
    return a + b + c;
}

const result = sum(...arr1);
console.log("EX9");
console.log(result); 