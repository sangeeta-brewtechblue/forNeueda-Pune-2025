import React, {useEffect, useState} from 'react';


function EffectHookDemo(){

    const [counter, setCounter]           = useState(0);
    

    useEffect(()=>{
        document.title=`You clicked ${counter} times`;
    })



    return(

        <div>
               <h3>The button is clicked for {counter} times</h3>

               <button onClick={()=>setCounter(counter+1)}>ClickMe</button>

               

        </div>


 )



}

export default EffectHookDemo;