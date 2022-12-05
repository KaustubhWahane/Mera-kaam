// let array = [12, 51, 61, 72, 69]
// let a1 = prompt("Enter your number");
// a1 = Number.parseInt(a1);
// array.push(a1)
// // console.log(array)
// let a;

// We can also use do while loop
// while(a!=0){
    //     a = prompt("Enter your number ");
    //     a = Number.parseInt(a);
    //     array.push(a);
    // }
    // console.log(array)
    
// Create an array where we can find out which number is divisble by 10
//  let array = [12, 50, 61, 30, 69]
// let p = array.filter((x)=>{
// return (x % 10) ==0;
// })
// console.log(p)
// Create an array where each element is the square of the number
// let array = [12, 4, 16, 30, 69]
// let p = array.map((x)=>{
// return (x *x);
// })
// console.log(p)
// Create an array reduce method will give us the factorial value
let array = [1, 2 ,3 ,4 ,5]
let p = array.reduce((y,z)=>{
return y * z;
})
console.log(p)
