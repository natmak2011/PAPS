
import './App.css';
import Header from "./Header";
import {Switch} from "@mui/material";
import CreateRequest from "./CreateRequest";
import {Route, Routes} from "react-router-dom";

const App = () => {

    return (
       <>
        <Header/>

            <Routes>

                <Route path='/' element={<CreateRequest/>}/>


            </Routes>
        </>






    )


}

export default App;
