import { Component } from "react";



export class  Updating  extends Component{




    
  constructor(props) {
    console.log("App-constructor called");
    super(props);

    //initialize the state
    this.state =
    {
        color:"green"
    };
  }
  static getDerivedStateFromProps(props, state) {
    console.log("App-getDerivedStatedFromProps called") 
    // update the state or null to update nothing.
    return null;
  }
  changeColor = () => {
    this.setState({color: "black"});
  }
  shouldComponentUpdate(nextProps,nextState)
  {
    console.log("App- shouldcomponentupdate called");
    console.log(nextProps.favcolor , nextState.color)
    return true;
  }
   //this method runs before update
   getSnapshotBeforeUpdate(prevProps,prevState)
   {
       console.log("App - get snap shot before update ");
       console.log(prevProps.favcolor,prevState.color);
       return true;
   }

   //this method runs after update
   componentDidUpdate(prevProps,prevState,snapshot)
   {
       console.log("App - component did update ");
       console.log(prevProps,prevState,snapshot);
   }
  render() {
    console.log("App-render called");
    return (
      <div>
      <h1>My Favorite Color is {this.state.color}</h1>
      <button type="button" onClick={this.changeColor}>Change color</button>
      </div>
    );
  }






    
}