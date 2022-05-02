// import { useTheme } from "@mui/material/styles";
import { Grid, Container, Typography } from "@mui/material";
// import axios from 'axios';
// import { URL } from '../utils/misc';
import Card from 'react-bootstrap/Card';
import CardHeader from 'react-bootstrap/CardHeader';

// components
import Page from "../components/Page";
import { Api } from '../api';
import React, {useContext, useState, useEffect} from "react";

export default function DashboardApp() {
  // const theme = useTheme();
  
  const api = new Api;
  const [documents, setDocuments] = useState(undefined);
  
  useEffect(() => {
    api.getDocuments().then(x => setDocuments(x));
  }, []);

  if(!documents) {
    return (
      <div className="container mb-4">
        <h1>Loading...</h1>
      </div>
    )
  } else {
    return (
      <Page title="Home">
        <Container maxWidth="xl">
          <h1>Home/Browse</h1>
            {
              documents.map((x, i) =>
              <div key={i} className= "card mb-4 d-flex">
              <CardHeader>{x.title}</CardHeader>
                <div className="card-body">
                  <p className="p-2">{x.author}</p>
                  <p className="p-2">{x.text}</p>
                  <a href="#" className="btn btn-success m-1">Like</a>
                  <a href="#" className="btn btn-danger m-1">Dislike</a>
                </div>
          </div>
        )}
        </Container>
      </Page>
    );
  }
}
