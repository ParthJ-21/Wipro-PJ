function validateEmail() {
    let email = document.getElementById("email").value;
    let emailError = document.getElementById("emailError");

    if (email === "") {
        emailError.innerText = "Email is required";
        return false;
    }

    if (email.indexOf("@") === -1 || email.indexOf(".") === -1 || email.indexOf(" ") !== -1) {
        emailError.innerText = "Invalid email format";
        return false;
    }

    emailError.innerText = "";
    return true;
}

function validatePassword() {
    let password = document.getElementById("password").value;
    let passwordError = document.getElementById("passwordError");

    if (password === "") {
        passwordError.innerText = "Password is required";
        return false;
    }

    passwordError.innerText = "";
    return true;
}

function validateForm() {
    let emailValid = validateEmail();
    let passwordValid = validatePassword();

    if (emailValid && passwordValid) {
        console.log("Login successful!");
    }
}