import React from "react";  

import { useState } from "react";
export function CounterChild(props) {

   // const { onCounterChange } = props;

   
    // To send the incremented counter value to the parent, call props.onCounterChange with ctr + 1 inside handleClick.
    

    // This is the child component that will increment the counter
    // and send the updated value to the parent component
    // using the onCounterChange function passed as a prop. 

    const [ctr,setCtr]=useState(0)
    const handleClick = () => {
        setCtr(ctr + 1); 
      props.onCounterChange(ctr ); // Call the parent's function to update the counter     
    }

    return(<div>
        <h2>Child Counter</h2>
        <button className="primary" onClick={handleClick}>Increment Counter</button>
        
    </div>)


}