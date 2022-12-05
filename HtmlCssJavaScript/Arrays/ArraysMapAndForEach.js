/*
Map - Creates a new array by performing some operation on each array element
For Each - Calls a function , once for each array element
The Syntax of Writing them is simultaneously we can also write the index and array of Arr
let a = Arr.map((value , index , array) =>{
    console.log(value , index , array)
    return value + index
}) 
console.log(a);
*/
let Arr = [12, 51 , 69]
let a = Arr.map((value , index) =>{
    console.log(value, index) //It prints the element of Arr
    return value + index+ 69 //It prints the value of each array element and adding there index
}) 
console.log(a)
// Filter method - Filters an array with values that passes a test which creates a new array.
let arr2 = [1 , 2 ,3 , 5 , 69]
let b = arr2.filter((a)=>{
    return a < 5;
}
)
console.log(b)
// Reduce Method - Reduces an array to a single value (Meaning har ek ko add kar deta hai)
let arr3= [5, 152, 61, 12]
let c = arr2.reduce((c1 , c2)=>{
    return c1 + c2;
})
console.log(c)