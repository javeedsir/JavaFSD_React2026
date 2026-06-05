import { Component } from "react";


export default class Mounting  extends Component{


    componentDidMount()
    {
        console.log("App - component Did Mount");
    }


         //constructor
    constructor(props)
    {
        super(props);

        console.log("App - constructor called");
        //for removing warning message 
        this.state={
             sname:this.props.pname
        }
    }

    static getDerivedStateFromProps(props,state) 
    {
        console.log("App - get Derived State From props ");
       state = {sname:'khan'}
        console.log('props ',props.pname)
        console.log('state ',state.sname)
        //removing warning message
        return null;
    }   


    render() {
        console.log("App- rendered")
        return <h1>Hello World</h1>
    }


   


}