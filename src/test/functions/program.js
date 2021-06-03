function mul(a,b) {
  var sum = a * b;
  return sum;
}

function nameFunc(a, b) {
  var zm = mul(a,b);
  console.log(zm);
  var returnValue = zm * 2;
  return returnValue;
}

function convert(a) {
  var tekst = "Zmienna: "
  var result = tekst + a
  return result;
}

var a = 3;
var b = 5;
var c = nameFunc(a,b);
console.log("c");
console.log(c);
var d = convert(4.7)
console.log(d);
