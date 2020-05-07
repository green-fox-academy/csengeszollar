import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome'
import Hello from './components/Hello'
import Message from './components/Message'
import Counter from './components/Counter'
import FunctionClick from './components/FunctionClick'
import ClassClick from './components/ClassClick'
import EventBind from './components/EventBind'
import ParentComponent from './components/ParentComponent'

function App() {
  return (
    <div className="App">
      <ParentComponent></ParentComponent>
      {/* <EventBind></EventBind> */}
      {/* <ClassClick></ClassClick>
      <FunctionClick></FunctionClick>
      <Counter />
      <Greet name="Rami" heroName="Warewolf">
        <p>The bestest doggie ever</p>
        </Greet> 
      <Greet name= "Vilcsi" heroName="Spider Woman">
        <button>Climb</button>
        </Greet> 
      <Greet name= "Laca" heroName="Wonderboy"></Greet> 
      <Welcome name="Ramesz" heroName="Warewolf"></Welcome>
      <Welcome name="Vinyo" heroName="Wonder woman"></Welcome>
      <Hello></Hello>
      <Message></Message> */}
    </div>
  );
}

export default App;
