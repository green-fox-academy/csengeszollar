'use strict';
// Create a function that can reverse a string, which is passed as the parameter
// Use it on this reversed string to check it!

let toBeReversed = `.eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI`;
console.log(reverse(toBeReversed));

function stringReverser(str){
    let splitStringArray = str.split("");
    let reversedStringArray = splitStringArray.reverse();
    let joinArray = splitStringArray.join("");
    return joinArray;
}

console.log(stringReverser(toBeReversed));

//uez roviden osszevonva:

function reverse(str){
    return str.split("").reverse().join("");
}

function reverseString(str) {
    let newString = "";
    for (let i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    return newString;
}

console.log(reverseString(toBeReversed));