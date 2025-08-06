import { useState } from "react"

export function WelcomeFunctional(props) {
      
      const[name,setName]=useState(props.name)
      let changeName=()=>{
        setName("John")
      }

     return(
        <div>
            <h2>Welcome, {name}</h2>
            <button onClick={changeName}>Change Name</button>
        </div>
     )


}

