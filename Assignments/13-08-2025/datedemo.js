let myDate = new Date(2030, 7, 13); // Month is 0-based (7 = August)


let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
let day = days[myDate.getDay()];

console.log("13th August 2030 is a " + day);
