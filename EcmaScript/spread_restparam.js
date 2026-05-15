

function test( x , ...num ){


        console.log('test() called...');


        console.log(num.length +" parameters")

        num.forEach(n1 => {

                console.log(n1)
            
        });


}

test();
test(5);
test('smith',5,10)