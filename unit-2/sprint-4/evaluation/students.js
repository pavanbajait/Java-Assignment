// All the Code for All Students Page Goes He
let students=JSON.parse(localStorage.getItem("admission"));

console.log(students);
displayTable();

function displayTable(){
    document.querySelector("tbody").innerHTML = "";
    students.map(function (element){
        element.preventDefault();
            let tr = document.createElement("tr");
            let td1 = document.createElement("td");
            td1.innerHTML= element.stdName;
            let td2 = document.createElement("td");
            td2.innerHTML= element.stdEmail;
            let td3 = document.createElement("td");
            td3.innerHTML= element.stdCourse;
            let td4 = document.createElement("td");
            td4.innerHTML= element.stdGender;
            let td5 = document.createElement("td");
            td5.innerHTML= element.stdPhone;
            let td6 = document.createElement("td");
            td6.innerHTML= "Accept";
            let td7 = document.createElement("td");
            td7.innerHTML= "Reject";
            tr.append(td1, td2, td3, td4, td5, td6, td7);
            document.querySelector("tbody").append(tr);
});
}