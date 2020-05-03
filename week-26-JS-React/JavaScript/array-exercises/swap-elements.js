// -  Create a variable named `names` with the following content:
//   `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `names`

let names = ["Arthur", "Boe", "Chloe"];
names = [names[2], names[1], names[0]];

console.log(...names);

//vagy:

Array.prototype.swap = function(a, b) {
    var temp = this[a];
    this[a] = this[b];
    this[b] = temp;
};

names.swap(0,2);
console.log(...names);

//vagy:

var temp = names[0];
names[0] = names[2];
names[2] = temp;

alert(names);