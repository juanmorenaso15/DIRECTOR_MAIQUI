// console.log(3);
// console.log("hola".toUpperCase()); //metodo toUpperCase convierte a mayusculas
// console.log(false);

//const { use } = require("react");


// console.log(new Number(3));
// console.log(new String("hola"));
// console.log(new Boolean(false));

//-------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------
// let name = "juan"
// let lastname = "Moreno"
// let age = 30

// const user = {
//     name: "juan",
//     lastname: "Moreno",
//     age: 30,
//     hobbies: ['read', 'programar', 'correr'],
//     direccion: {
//         calle:  "nose",
//         ciudad: "calarca"
//     }
// }

// console.log(user)


// function showfullname(){
//     return "juan moreno"
// }

// const user = {
//     name: "juan", //PROPIEDADES
//     lastname: "Moreno",
//     age: 30, 
// //     showfull: function (){
// //     return "juan moreno"
// // }
//     showfull(){
//     return "juan moreno"
// }
// }
// console.log(user)
// console.log(user.showfull())

// const user = {
//     name: "juan",
//     lastname: "Moreno",
//     age: 30, 
//     showfull(){
//     return this.name +" "+this.lastname
// }
// }

// console.log(user.showfull())

// const cuenta = {
//     number: "123123123123",
//     monto: 100,
//     depositar(quantity){
//         this.monto = this.monto+quantity
//     },
//     retirar (quantity){
//         this.monto = this.monto - quantity
//     }
// }

// cuenta.depositar(100)
// cuenta.depositar(50)
// cuenta.depositar(10)

// console.log(cuenta)

// cuenta.retirar(10)
// cuenta.retirar(200)

// console.log(cuenta)


// const user1 = {
//     name: "juan",
//     lastname: "Moreno",
//     age: 30, 
//     showFullName(){
//     return `${this.name} ${this.lastname}`;
// }
// }

//constructor


// function Person() {
//     this.name = " "
//     this.lastname = " "
//     this.age = 0
//     this.showFullName = function(){
//     return `${this.name} ${this.lastname}`;
// }
// }

// const user2 = new Person()
// user2.name="joe"
// user2.lastname="McMillan"
// user2.age=30
// console.log(user2.showFullName())

// const user3 = new Person()
// user3.name="Cameron"
// user3.lastname="Howe"
// console.log(user3.showFullName())
// const user4 = new Person()
// const user5 = new Person()


// console.log(user3,user4,user5)

//constructor

// const string = new Object("hello world")
// string.test = function (){
// return this + "test"
// }
// console.log(string.test())

//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
// metodo del objeto "object"para acceder a valores y propiedades
// const user = {
//     name:"Juan",
//     lastname: "Moreno",
//     age: 30,
//     showName(){
//         return this.name
//     }

// }

// console.log(Object.values(user))

// new

// function Person(){
//     this.name=""
//     this.lastname=""
// }

// const person1 = new Person()
// console.log(person1)

// prototipo

// function Person (name, lastname){
//     this.name = name
//     this.lastname = lastname
//     this.displayName = function(){
//         return `${this.name} ${this.lastname}`
//     }
// }
// const john = new Person ("john", "Moreno")
// const mario = new Person("Mario","Moreno")
// const maria = new Person("Maria", "Perez")
// const jose = new Person ("jose", "Perez")

// Person.prototype.greet = function(){
//     return `Hello i'm ${this.name}`
// }

// Person.prototype.age = 100

// console.log(john.age)
// console.log(mario.age)
// console.log(maria.age)
// console.log(jose.age)

// const s = new String("Hello world")

// String.prototype.concatTest = function(){
//     return this + " test";
// }

// console.log("Mu name is Juan".concatTest())

// console.log(s.concatTest())

//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
//class

// class Person {
//     constructor(name, lastname){
//         this.name = name
//         this.lastname = lastname
//     }

//     greet(){
//         return `Hello I'm ${this.name} ${this.lastname}`
//     }
//     }

// const user1 = new Person ("Juan","Moreno")
// const user2 = new Person ("Manuel","Moreno")

// console.log(user1)
// console.log(user2)

// console.log(typeof Person)

// ASOSCIACION



// class Person {
//     constructor(name, lastname) {
//         this.name = name
//         this.lastname = lastname
//     }
// }

// const juan = new Person ("Juan", "Moreno")
// const manuel = new Person ("Manuel", "Moreno")

// // relacion
// manuel.parent = juan;

// console.log(manuel)
// console.log(juan)

//Agregacion 

// const company = {
//     name: "Fazt tech",
//     employes: []
// }

// class Person {
//     constructor(name, lastname) {
//         this.name = name
//         this.lastname = lastname
//     }
// }

// const juan = new Person ("Juan", "Moreno")
// const manuel = new Person ("Manuel", "Moreno")

// company.employes.push(juan)
// company.employes.push(manuel)

// console.log(manuel)
// console.log(juan)

// console.log(company)


//composicion

// const person = {
//     name: "Juan",
//     lastname: "Moreno",
//     address:{
//         street:"123 baker street",
//         city: "London",
//         country:"United Kingdon"
//     }
// }


//encapsulacion

// function Company(name) {
//     let employes=[]
//     this.name = name

//     this.getEmployes = function(){
//         return employes
//     }

//     this.addEmploye = function(employe){
//         employes.push(employe)
//     }
// }

// const company1 = new Company("coca cola")
// const company2 = new Company("Pepsi")

// console.log (company1)
// console.log(company2)

// company1.addEmploye({name: "juan"})
// company2.addEmploye({name: "Manuel"})

// console.log(company1.getEmployes())
// console.log(company2.getEmployes())

//herencia

class Person {
    constructor(name, lastname) {
        this.name=name
        this.lastname=lastname
        this.age = 30
    }
}

class Progammer extends Person {
    constructor(language,name,lastname){
        super(name,lastname);

        this.language=language
    }
}

const person = new Person("juan","Morneo")

console.log(person)

const programmer = new Progammer("java","manuel","moreno")

console.log(programmer)

//polimorfismo - sobrecarga

