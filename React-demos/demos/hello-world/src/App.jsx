//import { useState } from 'react'
////import reactLogo from './assets/react.svg'
//import viteLogo from '/vite.svg'
import './App.css'
import { Counter } from './counter.jsx'
import { Welcome } from './welcome.jsx'
import {BoilingVerdict} from './boilingVerdict.jsx'
import { FormattedDate} from './formattedDt.jsx'
import { ForLoopExample } from './forLoopexample.jsx'
import { CarList } from './carList.jsx'
import { Greeting } from './greeting.jsx'

function App() {
  
  return (
    <div>
    <h3>App Compnenet </h3>
    <h4>Following is a greeting example</h4>
    <Greeting />
     <h4>Following is a welcome example</h4>
     <h4><Welcome name="Sarah"/></h4>
     <h4><Welcome name="John"/></h4>
     <h4>Following is a boiling verdict example</h4>
     <BoilingVerdict temp={55} />
     <BoilingVerdict temp={105} />
     <h4>Following is a formatted date example</h4>
     <FormattedDate today={new Date().toLocaleDateString()} />
      <h4>Following is a for loop example</h4>
      <ForLoopExample />
      <h4>Following is a car list example</h4>
      <CarList />
      <h4>Following is a counter example</h4>
      <Counter />
   
   
   
    </div>
  )
}
   
 

export default App
