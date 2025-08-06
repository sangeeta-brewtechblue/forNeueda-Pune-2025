import React from 'react';
export function BoilingVerdict(props){
    if(props.temp <100){
        return<h3>Water will not boil</h3>
    }
    else return <h3>Water will boil</h3>

}