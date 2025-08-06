import React, {useEffect, useState} from 'react';


function EffectHookDemo2(){

     const [date]           = useState(new Date());
     const[second,setSecond] = useState(date.getMilliseconds());

    useEffect(()=>{
          console.log("set interval");
          const interval = setInterval(() =>setSecond(second+1) 
            
          , 1000);
          return   ()=>{
                console.log("clean up... clearing the interval")
                 clearInterval(interval);
             }



      
    })



    return(

        <div>
               <h3>Today's date  is </h3>
               
                 {date.toDateString()}
               
               <h4>   & current time is </h4>

                   {second}

               

        </div>


 )



}

export default EffectHookDemo2;