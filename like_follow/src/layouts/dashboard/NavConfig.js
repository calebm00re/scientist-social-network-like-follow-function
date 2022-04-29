// component
import Iconify from "../../components/Iconify";

// ----------------------------------------------------------------------

const getIcon = (name) => <Iconify icon={name} width={22} height={22} />;

const navConfig = [
  {
    title: "Home",
    path: "/Home",
    icon: getIcon("eva:pie-chart-2-fill"),
  },
  {
    title: "Likes",
    path: "/Likes",
    icon: getIcon("eva:people-fill"),
  },
  {
    title: "Follows",
    path: "/Follows",
    icon: getIcon("eva:shopping-bag-fill"),
  },
  {
    title: "Notifications",
    path: "/Notifications",
    icon: getIcon("eva:file-text-fill"),
  },
];

export default navConfig;
