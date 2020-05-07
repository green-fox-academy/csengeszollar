import React from 'react'

// function Greet() {
//     return <h1>Hello Vilcsi!</h1>
// }

// const Greet = (props) => {
// return (
// <div>
//     <h1>Hello {props.name} aka {props.heroName}!</h1>
//     {props.children}
//     </div>
// )
// }

// destructuring props in the parameter:
const Greet = ({name, heroName}) => {
    return (
    <div>
        <h1>Hello {name} aka {heroName}!</h1>
        </div>
    )
    }

export default Greet