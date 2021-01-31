var x = 1
var y = 1

while (x < 10) {
  while (y < 5) {
    var i = x + y
    console.log("i=" + i + " ["+ x+"]["+y+"]");
    y = y + 1;
  }
  y = 1;
  x = x + 1;
}

console.log("While test end")

x = 1;

for (var index = 0; index < 10; index = index + 1) {
  var element = x + index;
  console.log(element)
}

console.log("For test end")
