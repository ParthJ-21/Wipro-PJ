function addTask() {
    let taskInput = document.getElementById("taskInput");
    if (taskInput.value.trim() === "") {
        console.log("Please enter a task!");
        return;
    }

    let li = document.createElement("li");
    li.textContent = taskInput.value + " ";
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.onclick = function() {
        li.remove();
    };

    li.appendChild(delBtn);
    document.getElementById("taskList").appendChild(li);
    taskInput.value = "";
}