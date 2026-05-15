"use strict";
class Hello {
    id = 99;
    name = "tom";
    myname = new String('javeed');
    constructor() {
        console.log('Hello constructor called obj created..');
    }
    m1() {
        console.log("m1() method is called");
        console.log(this.id + "  " + this.name);
    }
}
let h = new Hello();
h.m1();

