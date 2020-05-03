// -  Create a variable named `numbers` with the following content:
//   `[3, 4, 5, 6, 7]`
// -  Log the sum of the elements in `numbers` to the console


let nums = [3, 4, 5, 6, 7];

console.log(nums.reduce((a, b) => a + b, 0))