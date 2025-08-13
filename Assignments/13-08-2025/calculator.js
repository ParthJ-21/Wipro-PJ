let n1 = document.getElementById("num1");
let n2 = document.getElementById("num2");
let result = 0;

function add(){
    result = num1+num2;
}
function subs(){
    result = num1-num2;
}
function multi(){
    result = num1*num2;
}
function div(){
    result = num1/num2;
}

document.getElementById("result").textContent = result;