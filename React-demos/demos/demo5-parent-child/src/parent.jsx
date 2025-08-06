import React from 'react';
import { useState } from 'react'
import { Child } from './child';

export function Parent(props){
    const[familyName,setFamilyName] =useState("Jackson") 
    
   const handleClick=()=>{
       setFamilyName(props.fname);
    }
   

    return(
        <div>
            <h2>Parent Component</h2>
            Family Name: {familyName}
            <button className='primary' onClick={handleClick}>Show Family Name</button>
            <Child lastName={familyName}></Child>
        </div>
    )
}