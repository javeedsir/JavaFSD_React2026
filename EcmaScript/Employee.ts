

export  class Employee{

        // eid:number;
        // ename:string;


    // constructor(eid,ename){


    //         this.eid = eid;
    //         this.ename = ename;
    // }


        constructor(private eid:number, private ename:string){

                this.eid = eid;
                this.ename = ename;

        }


}

let emp = new Employee(111,"king");

    console.log(emp)