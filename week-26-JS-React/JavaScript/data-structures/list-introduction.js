let names = [];
console.log(names.length);

names.push("William");
console.log(names.length === 0);
names.push("John");
names.push("Amanda");
console.log(names.length);
console.log(names[2]);
names.forEach(name => {
    console.log(name);
});
names.splice(1, 1);
// names.reverse().forEach(name => {
//     console.log(name);
// });

for (let i = names.length - 1; i >= 0; i--) {
    console.log(names[i]);
}

names.splice(0);
console.log(names.length);

// class Animals{
//
//
//     constructor(age, type, legs) {
//         this._age = age;
//         this._type = type;
//         this._legs = legs;
//     }
//
//
//     get age() {
//         return this._age;
//     }
//
//     set age(value) {
//         this._age = value;
//     }
//
//     get type() {
//         return this._type;
//     }
//
//     set type(value) {
//         this._type = value;
//     }
//
//     get legs() {
//         return this._legs;
//     }
//
//     set legs(value) {
//         this._legs = value;
//     }
// }
//
// let zebra = new Animals(4, "zebra", 4);
// console.log(zebra);




