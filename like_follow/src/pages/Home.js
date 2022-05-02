import { Grid, Container, Typography, Button } from "@mui/material";
import CardHeader from 'react-bootstrap/CardHeader';

// components
import Page from "../components/Page";
import { Api } from '../api';
import React, {useContext, useState, useEffect} from "react";

export default function DashboardApp() {
  // const theme = useTheme();
  
  const api = new Api;
  const [documents, setDocuments] = useState(undefined);

  const handleLike = (id) => {
    api.addToLikes(id).then(res => console.log(res));
  }

  const handleDislike = (id) => {
    api.removeFromLikes(id).then(res => console.log(res));
    //api call for dislike
  }
  
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
                  <Button color="primary" variant="contained" onClick={() => handleLike(x.document_id)}>Like</Button>
                  <Button className="m-2" color="error" variant="contained" onClick={() => handleDislike(x.document_id)}>Dislike</Button>
                  {/* <Button color="danger" variant="contained" onClick={() => handleDislike(x.document_id)}>Dislike</Button> */}
                  {/* <a href="#" className="btn btn-success m-1">Like</a>
                  <a href="#" className="btn btn-danger m-1">Dislike</a> */}
                </div>
          </div>
        )}
        </Container>
      </Page>
    );
  }
}
