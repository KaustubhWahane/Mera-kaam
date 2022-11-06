console.log("Welcome to the world of Operators");
let a = 5;
let b = 5;
console.log("a + b: " ,a + b)
// Note the difference between them because of + it acts as like a String which is concatenation
console.log("a - b: " +a + b)
console.log("a * b: " ,a * b)
console.log("a / b: " ,a / b)
console.log("a % b: " ,a % b)

// Now the main difference between the increment & decrement operator
// Increment Operator
console.log("a++: " ,a++)
// Notice this when we increment it doesn't print it unless we use another print statement to print it
console.log("a" , a)
// Now let' say we want to add it first without printing it again so
console.log("++a:" , ++a)
// Decrement Operator
console.log("--b:" ,b--)
// Same goes for decrement operator 
console.log(b)

// Assignment Operators
let ass = 1;
ass+= 5;
console.log(ass);
// It will be same as for all the arithmetic Operators

// Comparison Operator
let value1 = 6;
let value2 = "6";
// let value2 = 6;
// Now this checks the value 
console.log("value1 == value2" ,value1 == value2)
// This checks the value is not equal
console.log("value1 != value2" ,value1 != value2)
//This checks the value and the data type of the variable 
console.log("value1 === value2" ,value1 === value2)
//This checks nor the value neither data type of the variable 
console.log("value1 !== value2" ,value1 !== value2)
// Baaki ka greater or lesser vala hai

// Logical Operator
let a1 = 67;
let a2 = 69;
// And operator
console.log("a1 and a2:",a1 < a2 && a1 == 67)
// Or operator
console.log("a1 || a2:",a1 < a2 || a1 != 67)
// Logical Operator Bas ulta kar dega 
console.log(!false);
console.log(!true);
















