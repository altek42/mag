function swap(arr, firstIndex, secondIndex) {
  var temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}
function bubbleSortAlgo(arraaytest) {
  var len = arraaytest.length,
    i, j, stop;
  for (i = 0; i < len; i++) {
    for (j = 0, stop = len - i; j < stop; j++) {
      if (arraaytest[j] > arraaytest[j + 1]) {
        swap(arraaytest, j, j + 1);
      }
    }
  } return arraaytest;
}
// var myArray = [3, 6, 2, 5, -75, 4, 1]

var myArray = [10, 23, 13, 45]

myArray = bubbleSortAlgo(myArray, 1, 2)

for(var i = 0; i < myArray.length; i = i + 1){
  console.log(myArray[i])
}


