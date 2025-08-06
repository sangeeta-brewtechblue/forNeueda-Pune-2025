import React from 'react';  
import { useState } from 'react'; 
import { CounterChild } from './counterChild';

export function CounterParent(){
    const[counter,setCounter]= useState(0)

    /* No code needed here, but fix the setCounter usage below */
    const receiveCounter = (ctr) => {
        setCounter(ctr);
        console.log(ctr);
    }
    return(
        <div>
            <h2>Parent counter </h2>
           
            <CounterChild onCounterChange={receiveCounter} />  
            <p>Counter Value: {counter}</p>
     
        </div>
    )
}