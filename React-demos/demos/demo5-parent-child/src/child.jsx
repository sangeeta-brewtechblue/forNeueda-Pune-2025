import React from 'react';
import { useState } from 'react'

export function Child(props){
    const [firstName,setFirstName] = useState("John");
    
    return(
        <div>
            <h2>Child Component</h2>
            <p>First Name: {firstName}</p>
            <p>Last Name: {props.lastName}</p>
        </div>
    )
}