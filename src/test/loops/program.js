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

