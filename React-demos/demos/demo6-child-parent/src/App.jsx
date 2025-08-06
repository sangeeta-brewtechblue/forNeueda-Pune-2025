import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { CounterParent } from './counterParent'

function App() {
  const [count, setCount] = useState(0)

  return (
   <div>
    <h2>This is App component</h2>
    <CounterParent />
   </div>
  )
}

export default App
