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
        swap(arraaytest, 2, 1);
      }
    }
  } return arraaytest;
}
console.log(bubbleSortAlgo([3, 6, 2, 5, -75, 4, 1]));
