// All the JS Code for the Add Students Page Goes Here
document.querySelector("#form").addEventListener("submit", masaiStd);
let stdArr=JSON.parse(localStorage.getItem("userData")) || [];

function masaiStd(event){
    event.preventDefault();

    let stdObj={
        stdName: document.querySelector("#name").value,
        stdEmail: document.querySelector("#email").value,
        stdPhone: document.querySelector("#phone").value,
        stdGender: document.querySelector("#gender").value,
        stdCourse: document.querySelector("#course").value,
    };

    stdArr.push(stdObj);

    localStorage.setItem("admission", JSON.stringify(stdArr));
 } 
