// -  Create an array variable named `animals`
//    with the following content: `["koal", "pand", "zebr"]`
// -  Add all elements an `"a"` at the end

let animals = ["koal", "pand", "zebr"];
animals.forEach(function (item) {
    let appendedAnimals = item + "a";
    console.log(appendedAnimals);
})

