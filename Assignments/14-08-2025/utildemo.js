class Util {
    getDate = () => {
        const today = new Date;
        return today;
    };

    getPIValue = () => Math.PI;

    convertC2F = (celsius) => (celsius * 9 / 5) + 32;

    getFibonacci = (n) => {
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
    };
}

const util = new Util();

console.log("Today's Date:", util.getDate());
console.log("Value of PI:", util.getPIValue());
console.log("100°C in F:", util.convertC2F(100));
console.log("First 5 Fibonacci:", util.getFibonacci(10));
