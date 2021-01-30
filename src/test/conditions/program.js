var test1 = 2 == 2
var test2 = 2 == 1 + 1
var test3 = 1 + 1 == 2
var test4 = 1 + 1 == 1 + 1

var test5 = 2 == "text"

console.log(test1)
console.log(test2)
console.log(test3)
console.log(test4)
console.log(test5)

if (test1){
  console.log("is true")
}

if (test5){
  console.log("is false")
}

var number1 = 10;
var number2 = 30;

if (20 > number1) {
  console.log("number1 is less than 20")
}else {
  console.log("number1 is greater than 20")
}

if (20 > number2) {
  console.log("number2 is less than 20")
}else {
  console.log("number2 is greater than 20")
}
