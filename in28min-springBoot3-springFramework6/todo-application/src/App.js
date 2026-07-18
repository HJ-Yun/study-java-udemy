import './App.css';
// import {Component} from "react";
// import FirstComponent from "./components/examples/FirstComponent"
// import ClassComponent from "./components/examples/ClassComponent";
// import {AnotherFirstComponent} from "./components/examples/FirstComponent"
// import LearningJavaScript from "./components/examples/LearningJavaScript";
import Counter from "./components/counter/Counter";

function App(){
  return(
      <div className="App">
        <Counter />
        <Counter by={1}/>
        <Counter by={2}/>
        <Counter by={5}/>

      </div>
  )
}

// function PlayingWithProps({property1,property2}) {
//     console.log(property1)
//     console.log(property2)
//
//     return(
//         <div></div>
//     )
// }

// function PlayingWithProps(properties) {
//     console.log(properties)
//     console.log(properties.property1)
//     console.log(properties.property2)
//
//     return(
//         <div></div>
//     )
// }

// function App() {
//   return (
//     <div className="App">
//       App Component
//         <FirstComponent></FirstComponent>
//         <ClassComponent></ClassComponent>
//         <AnotherFirstComponent></AnotherFirstComponent>
//         <LearningJavaScript></LearningJavaScript>
//     </div>
//   );
// }

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
