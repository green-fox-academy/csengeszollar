import React from 'react'

function ChildComponent(props) {
    return (
        <div>
            <button onClick={() => props.greetHandler('Jancsi')}>Greet parents</button>
        </div>
    )
}

export default ChildComponent
