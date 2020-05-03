let arr = ["apple", 'orange', "pear", true, 5];
console.log(typeof arr[3]);

let fruits = ["mango", "apple", "pear", "pineapple", "papaya"];

console.log(fruits[fruits.length - 1]);

fruits.push("banana");
fruits.unshift("strawberry");
fruits.shift();

// let pos = fruits.indexOf('pear');
// fruits.splice(0,3);

fruits.forEach(function(item, index){
    console.log(item, index)
});

let copyFruit = fruits.slice();
copyFruit.splice(1,1);
console.log(copyFruit);

fruits.length = 2;
console.log(fruits.length);
fruits.forEach(function(item, index){
    console.log(item, index)
});

console.log(...copyFruit);