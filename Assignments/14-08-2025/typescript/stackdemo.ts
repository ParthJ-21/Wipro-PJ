class Stack<T> {
    private items: T[] = [];

    push(item: T): void {
        this.items.push(item);
    }

    pop(): T | undefined {
        return this.items.pop();
    }

    peek(): T | undefined {
        return this.items[this.items.length - 1];
    }
}

let numberStack = new Stack<number>();
numberStack.push(1);
numberStack.push(2);
numberStack.push(3);

console.log("Peek:", numberStack.peek());
console.log("Pop:", numberStack.pop());
console.log("Peek after pop:", numberStack.peek());

let stringStack = new Stack<string>();
stringStack.push("Parth");
stringStack.push("Jaiswal");

console.log("Peek:", stringStack.peek());