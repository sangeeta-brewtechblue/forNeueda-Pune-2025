import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { ForLoopExample } from './forLoopexample'
import{ CarList } from './CarList'

function App() {
  

  return (
       <div>
          <h2>App Component</h2>
          <ForLoopExample />
          <CarList />
      </div>
  )
}

export default App
