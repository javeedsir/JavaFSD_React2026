import { Component } from "react";


export default  function HocExample(HocComponent , dataList){



        return class  extends  Component{



                    constructor(props){

                            super(props)

                            this.state = {


                                    value : dataList
                            }


                    }




                    render(){


                        return( 
                            <>

                                <h1>hi from HOC</h1>
                        <HocComponent data = {this.state.value} {...this.props} />

                       

                        </>
                        
                        );

                }
              





        }









}