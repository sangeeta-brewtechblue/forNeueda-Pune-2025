import React from 'react';
import { useState } from 'react';
import { sculptureList } from './data';
export default function GalleryOne (){
   const [index,setIndex] = useState(0);
   const[showMore,setShowMore] = useState(false);

     let sculpture = sculptureList[index];
    function handleIndex(){
        setIndex(index + 1);
    }

    function handleShowMore(){
        setShowMore(!showMore);
    }

    return(

        <div>

            <button onClick={handleIndex} >Next</button><br></br>
            <h4>{index} of {sculptureList.length} </h4>
            <button onClick={handleShowMore}>{showMore?'hide':'show'}</button>

            <h2>{sculpture.name}</h2>
            <h3>by {sculpture.artist}</h3>

          {showMore &&   <h4>{sculpture.description}</h4>}



        </div>

    )

}