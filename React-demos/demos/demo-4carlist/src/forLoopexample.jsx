import React from "react";
export function ForLoopExample(){
const numbers=[1,2,3,4,5];
// Using map to create list items from numbers array
// Each list item has a unique key based on the number      

const listItem=numbers.map((num)=>
    <li key={num} >{num}</li>)

return(
    <div>
        <ul>{listItem}</ul>
    </div>
)
}