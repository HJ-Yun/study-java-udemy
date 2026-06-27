import './App.css';
// import {Component} from "react";
import FirstComponent from "./components/examples/FirstComponent"
import ClassComponent from "./components/examples/ClassComponent";
import {AnotherFirstComponent} from "./components/examples/FirstComponent"

function App() {
  return (
    <div className="App">
      App Component
        <FirstComponent></FirstComponent>
        <ClassComponent></ClassComponent>
        <AnotherFirstComponent></AnotherFirstComponent>
    </div>
  );
}

// function FirstComponent() {
//     return (
//         <div className="FirstComponent">
//             First Component
//         </div>
//     )
// }

// class ClassComponent extends Component{
//     render() {
//         return (
//             <div className="classComponent">
//                 Class Component
//             </div>
//         )
//     }
// }

export default App;
