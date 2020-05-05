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
names.splice(1,1);
names.reverse().forEach(name => {
    console.log(name);
});