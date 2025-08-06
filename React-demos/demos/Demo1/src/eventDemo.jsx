import React from "react";
export function EventDemo(){
  const handleClick=()=>{
    alert("Button clicked!");
    console.log("Button clicked!");
  }

  return(
    <div>
        <button onClick={handleClick}>Click me</button>
    </div>
  )

}