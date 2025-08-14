const sumT= function sumNumbers(...args){
    total=args.reduce((total, num) => total + num, 0);
    console.log(total);
    
}
console.log("EX10");
sumT(1,2,3);
sumT(2,4,6,8,10);
sumT(1,2,3,4,5);

function separateFirstRest(first, ...rest) {
    x = {
        first: first,
        rest: rest
    };
    console.log(x);
}
console.log("EX11");
separateFirstRest(1,2,3,4,5,6);
separateFirstRest("abc","def","pqr","xyz");
