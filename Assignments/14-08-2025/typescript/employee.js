var employees = [
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
function printEmployees(empList) {
    empList.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return empList.length;
}
var count = printEmployees(employees);
console.log("Total Employees:", count);
