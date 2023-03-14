class Employee{

   #data;
   #totalPages;

    constructor(value){
        this.#data = value.data;
        this.#totalPages = value.totalPages;
        
    }

    get data(){
        return this.#data;
    }
    get totalPages(){
        return this.#totalPages;
    }
    
    getEmplData(){
        return fetch(`https://dbioz2ek0e.execute-api.ap-south-1.amazonaws.com/mockapi/get-employees`)
        .then((res) => res.json())
        .then((res) => {
            this.#data=res.data;
            this.#totalPagesres.totalPages;
        })
        .catch((err) => {})
    }

    


}

// console.log(Employee);
const employees = new Employee();
    employees.getEmplData.then(()=>{
        console.log(employees.data);
        console.log(employees.totalPages);
    })


    function createCardOfEmpl(emp){
        const div = document.createElement("div");
        const img = document.createElement("img");
        const name = document.createElement("h3");
        const department = document.createElement("p");
        const gender = document.createElement("p");
        const salary = document.createElement("p");
        const description = document.createElement("p");

        name.textContent=emp.name;
        department.textContent=emp.department;
        gender.textContent=emp.gender;
        salary.textContent=emp.salary;
        description.textContent=emp.description;
        img.textContent=emp.img;

        div.append(img, name, gender, salary, department, description);
        return div;
    }

    