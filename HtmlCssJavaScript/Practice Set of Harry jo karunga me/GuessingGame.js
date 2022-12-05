// Harry ka diya hua project
const prompt = require("prompt-sync")();
function randomGenerator() {
 return  (Math.floor((Math.random()*100)))
}
let countexact=0;
let countLesser=0;
let countGreater=0;
while(x = randomGenerator()){
    let a = prompt("Enter the number guess")
    a = Number.parseInt(a);
    if (a == x){
        console.log("Congrats you have guessed it correctly")
        console.log("NoOfTries took for correct number"+ countexact++);
        break
    }
    else if( a < x){
        console.log("Sorry the value you have entered is less than x")
        console.log("NoOfTries took for lesser value"+ countLesser++);
    }
    else if( a > x){
        console.log("Sorry the value you have entered is more than x")
        console.log("NoOfTries took for greater value"+ countGreater++);
    }
    console.log(x)  
}
