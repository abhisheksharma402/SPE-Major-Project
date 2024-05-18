import { createBrowserRouter, Outlet } from "react-router-dom";
import Login from "./component/Login";

const router = createBrowserRouter([
	{
		path: "/",
		element: <Login />
	}
]);

export default router;