const redux = require('redux')
const createStore = redux.createStore
// action creator
const BUY_CAKE = 'BUY_CAKE'
const BUY_ICECREAM = 'BUY_ICECREAM'

function buyCake() {
    return {
    type: BUY_CAKE,
    info: 'First redux action'
   }
}

function buyIceCream() {
    return {
        type: BUY_ICECREAM
    }
}

// reducer
const initialState = {
    numOfCake: 10,
    numOfIceCream: 20
}

const reducer = (state = initialState, action) => {
    switch(action.type) {
        case BUY_CAKE: return {
            ...state,
            numOfCake: state.numOfCake - 1
        }
        case BUY_ICECREAM: return {
            // with multiple reducers is important to spread state
            ...state,
            numOfIceCream: state.numOfIceCream - 1
        }
        default: return state
    }
}
// with store
const store = createStore(reducer)
console.log('initial state', store.getState())
const unsubscribe = store.subscribe(() => console.log('Updated state', store.getState()))
store.dispatch(buyCake())
store.dispatch(buyIceCream())
store.dispatch(buyIceCream())
unsubscribe()