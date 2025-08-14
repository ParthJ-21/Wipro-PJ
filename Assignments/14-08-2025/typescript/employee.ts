interface employee{
    empId: number;
    empName: string;
    salary: number;
}
let employees: employee[] = [
    { 
        empId: 111, empName: "Alice", salary: 50000 
    },
    { 
        empId: 222, empName: "Bob", salary: 30000 
    },
    { 
        empId: 333, empName: "Charlie", salary: 60000 
    }
];
function printEmployees(empList: employee[]): number {
    for (let i = 0; i < empList.length; i++) {
        console.log(`ID: ${empList[i].empId}, Name: ${empList[i].empName}, Salary: ${empList[i].salary}`);
    }
    return empList.length;
}

let count = printEmployees(employees);
console.log("Total Employees:", count);