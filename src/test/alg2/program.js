//Using a for loop
var items = [2, 5, 3, 7, 8, 10, 15, 18, 24, 111, 12, 19, 87];

function itemSearch(items, item) {
    for(var i=0; i < items.length; i++) {
        if(items[i] === item) {
            console.log("Found item " + item + " at index " + i);
            return true;
        }
    }
    //item not found 
    return false;
}

var item = itemSearch(items, 15);
if(!item) {
    console.log('Item does not exist!');
}