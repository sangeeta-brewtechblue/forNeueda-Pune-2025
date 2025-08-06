import React from "react";
import { useState } from "react";
export function Counter(){
 const[count,setCount]=useState(0)
 let incrementCount=()=>{
    setCount(count +1)
 }
 
 return(
    <div>
        The counter value is:{count}
        <button onClick={incrementCount}>Increment</button>
    </div>
 )

}