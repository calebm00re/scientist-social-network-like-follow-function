import { useTheme } from "@mui/material/styles";
import { Grid, Container, Typography } from "@mui/material";
// components
import Page from "../components/Page";
export default function DashboardApp() {
  const theme = useTheme();

  return (
    <Page title="Home">
      <Container maxWidth="xl">
        <h1>Home/Browse</h1>
      </Container>
    </Page>
  );
}
