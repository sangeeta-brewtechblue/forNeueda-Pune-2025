import React, { useState } from 'react';
import {sculptureList} from './data'

export default function Gallery (){

    const[index,setIndex] = useState(0);

    function handleClick(){
       setIndex(index+1);
    };
    let sculpture = sculptureList[index];
    return(

        <div>
            <button onClick={handleClick} >Next</button>
           <h4> {index + 1 } of {sculptureList.length} </h4> 
           
           <h2>{sculpture.name}  </h2>
           <h3>by {sculpture.artist}</h3>

        </div>

    )

}