

function Student({text,count})
{
    console.log("Rending :",text);
    return (
        <div>{text} - {count}</div>
    )
}
export default Student;