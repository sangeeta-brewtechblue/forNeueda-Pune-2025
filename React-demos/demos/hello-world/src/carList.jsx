import React from "react";
//import './carList.css';
export function CarList(){
    const cars=[
        {id:1, name:"Toyota", model:"Corolla"},
        {id:2, name:"Honda", model:"Civic"},
        {id:3, name:"Ford", model:"Focus"}
    ];
    // Using map to create list items from cars array
    // Each list item has a unique key based on the car id
    const carItems=cars.map((car)=>
        <li key={car.id}>{car.model }-{car.name}</li>
)
    // Displaying the list of car models
    // Each car model is displayed as a list item           
    return(
        <div>
            <ul>{carItems}</ul>
        </div>
    )   
}