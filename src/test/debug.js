function swap(arr, firstIndex, secondIndex) {
  var temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;
}

var arr = [1,2,3,4,5];

swap(arr, 2, 4);

var size = arr.length
for(var i = 0; i < size; i = i + 1){
  console.log(arr[i])
}
