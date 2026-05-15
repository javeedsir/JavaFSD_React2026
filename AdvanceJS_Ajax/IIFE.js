

const counter = (function () {
    let count = 0;

    return {
        increment: function () {
            count++;
            console.log(count);
        },
        reset: function () {
            count = 0;
            console.log("Counter reset "+count);
        },
    };
})();

counter.increment(); 
counter.increment(); 
counter.reset();