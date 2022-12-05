function generateRandomLetter() {
const alphabet = "SWG"
return alphabet[Math.floor(Math.random()*alphabet.length)]
}
let b = generateRandomLetter();
console.log(b)
const prompt = require("prompt-sync")();
while(true){
    let a = prompt("Enter any character from Snake Water Gun")
    if(a ==b){
        console.log("Congrats bhai kya guess hai tu jeet gaya")
        break;
    }
    else{
        console.log("Try again")
    }
}
