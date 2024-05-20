import "./App.css";
import { useState } from "react";
import Login from "./pages/login/component/Login.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Agency from "./pages/agency/component/AgencyDashBoard.jsx"

function App() {
	return (
		<BrowserRouter>
			<Routes>
				<Route path="/" element={<Login />} />
			</Routes>
		</BrowserRouter>
		// <div>
		// 	<Agency />
		// </div>
	);
}

export default App;
