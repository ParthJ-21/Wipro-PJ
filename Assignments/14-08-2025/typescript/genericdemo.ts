function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let result1 = pair<number, string>(21, "Parth");
let result2 = pair<boolean, number>(true, 12);
console.log("Ex20");
console.log(result1);
console.log(result2);