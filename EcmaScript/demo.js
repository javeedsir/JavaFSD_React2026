
  var num = 99;

function f1(){

    
        let  sid = 101;
        let sname = 'javeed';

        const  amount = 90000;

        console.log(sid +" "+ sname +"  "+amount);


}

const f2 = ()=>{ console.log('hello friends'); }


 const f3 = function(a , b = 10){

        console.log('function with default param')

        console.log(a+b);

 }


f1();

f2();

f3(3,5);

f3(3);