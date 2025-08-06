import React from 'react'
import { Welcome } from './welcome' 
import './App.css'
import WelcomeClass from './welcomClass'
import { WelcomeFunctional } from './welcomeFunctional'
import { EventDemo } from './eventDemo';

function App() {
 

  return (
    <div>
      <div>
            This is App Component !!!
       </div>
       <div>Welcome component
        {/*     
         <Welcome name="Sarah" />
        <WelcomeClass name="Sarah" />
        <WelcomeFunctional name="Sarah"/>*/} 
        <EventDemo />
       </div>
    </div>
  
  )
}

export default App
