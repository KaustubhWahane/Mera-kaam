/*
Syntax of Function
function binodLavde(paramter 1 , parameter 2){
Vo binodLavde is the name of the function
}
*/



function meHuKon(a , b){
    console.log("Hogaya");
    return Math.round ((a + b)/2)
}

let x = 1;
let y = 2;
let z = 5;

console.log(`Average of x and y  is: ${meHuKon(x , y)}`);
console.log(`Average of y and z  is: ${meHuKon(y, z)}`);
console.log(`Average of z and x  is: ${meHuKon(z, x)}`);
