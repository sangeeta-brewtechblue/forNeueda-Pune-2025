import {React,Component} from "react";
class WelcomeClass extends Component{


    constructor(props){
        super(props);
        this.state={
            name:  props.name
        }
    this.changeName=this.changeName.bind(this)
        
    }
   changeName=()=>{
       //  this.state.name="John"; // This won't work as state should not be mutated directly
        console.log("Name changed to John");
        this.setState({name:"John"})
    }

    render(){
    return(
        <div>
            <h2>Welcome, {this.state.name}</h2>
            <button onClick={this.changeName}>Change Name</button>
        </div>)
    }
}


    
export default WelcomeClass;