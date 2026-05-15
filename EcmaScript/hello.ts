


class   Hello{

       // id:number = 99;

       // name:string = "tom";

        myname:String = new String('javeed');


        constructor(private id:number , private name:string){

                    this.id = id;
                    this.name = name;

                console.log('Hello constructor called obj created..')

        }



     m1() 
    {


        console.log("m1() method is called");

        console.log(this.id +"  "+ this.name);

    }



}


let h = new Hello();

h.m1();