//document.getElementById("head").innerText = "This is 2nd text";

function Length() {
    let text = document.getElementById("Input").value;
    let length = text.length;
    console.log("Length of text:", length);
}

/*btn1=document.getElementById("btn1");
btn1.addEventListener("click", function fn() {
    var input = document.getElementById("input1").value;
    console.log(input);
 });*/

let inputBox = document.getElementById("Input");
let p = document.getElementById("char");

inputBox.addEventListener("input", function(){
    let x = 50 - inputBox.value.length;
    p.innerText = x + " characters remaining";

});