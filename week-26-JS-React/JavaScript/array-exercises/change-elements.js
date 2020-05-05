// -  Create an array named `numbers` with the following content: `[1, 2, 3, 8, 5, 6]`
// -  Change the 8 to 4 with the `.map` method
// -  Print the fourth element as a test

let numbersToChange = [1, 2, 3, 8, 5, 6, "8"];

let changedArr = numbersToChange.map(item => {
    if (item === 8) {
return 4;
    } else {
        return item;
    }
});

console.log(...changedArr);
console.log(changedArr);
console.log(changedArr[3]);

// -  Increment the third element simply by accessing it
// -  Log the third element to the console
console.log(++numbersToChange[2]);