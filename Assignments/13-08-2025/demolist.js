var list1 = [
  {
    name: "John Doe",
    age: 30,
    city: "Pune",
    empId: 1,
    salary: 20000,
    role: "Manager"

  },
  {
    name: "Mark Freeman",
    age: 32,
    city: "Mumbai",
    empId: 2,
    salary: 30000,
    role: "HR"
  },
  {
    name: "Patricia  Dark",
    age: 35,
    city: "Delhi",
    empId: 3,
    salary: 40000,
    role: "Manager"
  },
  {
    name: "John Wick",
    age: 15,
    city: "Nagpur",
    empId: 4,
    salary: 10000,
    role: "Intern"
  }
];
 
// for(let i=0;i<list1.length;i++){
//   console.log(list1[i]);
// }
// let  filterlist=list1.filter((x)=>x.age>18);
// console.log("People that can vote:");
// console.log(filterlist);
// let totalSalary = list1.filter(emp => emp.role === "Manager").reduce((total, emp) => total + emp.salary, 0);
// console.log("Total Salary of all managers:"+totalSalary);

// for(let i = 0; i < list1.length; i++) {
//     if(list1[i].age>18)
//     {
//         list1[i].status = "adult";
//     }else
//     {
//         list1[i].status = "minor";
//     }
// }

list1.map(x=>{if(x.age>=18){x.status = "adult";}else{x.status = "minor";}});

 for(let i=0;i<list1.length;i++){
  console.log(list1[i]);
}
