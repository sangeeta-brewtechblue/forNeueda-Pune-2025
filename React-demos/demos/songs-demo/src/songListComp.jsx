import React from "react";
import {useState} from "react";
export function SongListComp(props){

    const[flag,setFlag]=useState(false);
    const[caption,setCaption]=useState("Show Songs");
    const visibleStyle = flag?{display:"list-item"}:{display:"none"}
    
 const toggleFlag=()=>{
    setFlag(!flag);
    setCaption(flag?"Show Songs":"Hide Songs");
 }
    const songs =[
     
        {id:1, title:"Song A", artist:"Artist 1"},
        {id:2, title:"Song B", artist:"Artist 2"},
        {id:3, title:"Song C", artist:"Artist 3"}       
    ]

  
    // Using map to create list items from songs array
    // Each list item has a unique key based on the song id
   
    const songItems = songs.map((song) =>
        <li style={visibleStyle} key={song.id}>{song.title} - {song.artist}</li>
    );
return(
    <div>
        <ul>{songItems}</ul>
        <button onClick={toggleFlag}>{caption}</button>
    </div>
)
}