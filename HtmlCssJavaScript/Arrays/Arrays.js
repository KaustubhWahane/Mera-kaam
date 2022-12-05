let fruits = ["Banana", "Apple","Pineapple"];
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
// If we access an array which is out of the bounds it will give an undefined value as an answer
console.log(fruits.length);
// Changing the element of the array
fruits[0] = "klajsf";
console.log(fruits);
console.log(typeof fruits)

let name = [1 , 2 , 3 , 4];
let b = name.toString(); //We can convert it from Int to String
console.log(b)
let c = name.join("_") //To join the array and replacing the comma with '_' its called as an separator
console.log(c ,typeof c)
// Push method removes the last element which is at the end of the array 
let r = name.push(5)
// Pop method adds the value to the last element which is at the end of the array 
let x= name.pop()
console.log(name)
let intArr = [23, 45, 67];
intArr.shift(); // It removes the first element 
intArr.unshift(23); // It re-puts the first element 
console.log(intArr);
/* Important points which i have noticed
Push and pop works on the last element of the array
Shift and unshift works on the first element of the array
*/
// The Delete Method
let numbers = [1, 2 ,5 ,5 ,61 , 616, 69]
let numbersdusra = [1, 2 ,5 ,5 ,61 , 616, 69, 715, 7195, 1759]
// I can add up to N numbers of arrays 
delete numbers[0]
console.log(numbers);
let jodi = numbers.concat(numbersdusra)
// Note that the element may be shown deleted but in the Numbers Array it's not deleted
console.log(jodi)
