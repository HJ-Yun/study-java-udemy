import { useState } from 'react';
import {PropTypes} from "prop-types";

import './Counter.css'

export default function Counter({by}){

    const [count, setCount] = useState(0);

    console.log(by)

    function increaseButton(){
        setCount(count + by)
        console.log(count)
        console.log('increase')
    }

    function decreaseButton(){
        setCount(count - by)
        console.log(count)
        console.log('decrease')
    }

    return(
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterButton" onClick={increaseButton}>+{by}</button>
                <button className="counterButton" onClick={decreaseButton}>-{by}</button>
            </div>
        </div>
    )
}

Counter.propTypes={
    by:PropTypes.number
}

Counter.defalutProps={
    by:1
}

