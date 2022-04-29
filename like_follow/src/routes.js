import { Navigate, useRoutes } from 'react-router-dom';
// layouts
import DashboardLayout from './layouts/dashboard';
import LogoOnlyLayout from './layouts/LogoOnlyLayout';
//
import Notifications from './pages/Notifications';
import Likes from './pages/Likes';
import NotFound from './pages/Page404';
import Follows from './pages/Follows';
import Home from './pages/Home';

// ----------------------------------------------------------------------

export default function Router() {
  return useRoutes([
    {
      path: '/',
      element: <DashboardLayout />,
      children: [
        { path: 'Home', element: <Home /> },
        { path: 'Likes', element: <Likes /> },
        { path: 'Follows', element: <Follows /> },
        { path: 'Notifications', element: <Notifications /> },
      ],
    },
    { path: '*', element: <Navigate to="/404" replace /> },
  ]);
}
