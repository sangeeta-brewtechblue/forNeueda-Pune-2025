import React from "react";
export function Welcome(props){
   let changeName=()=>{
       // props.name="John";
        console.log("Name changed to John");

   }


    return(
        <div>
    <h2>Welcome, {props.name}</h2>
    <button onClick={changeName}>Change Name</button>
    </div>
)
}