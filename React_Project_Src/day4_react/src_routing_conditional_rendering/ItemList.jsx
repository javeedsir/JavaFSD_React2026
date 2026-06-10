


export function ItemList(props) {
    const items = props.items;

    


    return (
      <div>
        {items.length > 0 && <h1>You have {items.length} items.</h1>} <br />

            <ul>

              {items.map( 
                        (item,index)=>(


                                <li key={index}>{item}</li>

                        )



              )}

            </ul>
          

      </div>
    );
  }