let value = "Paise nikal chal lavde 15500";
console.log(value.slice("Paise nikal chal lavde ".length))
// Or
// The reason i used parseInt because the number is a String data type
console.log(Number.parseInt(value.slice(23)))