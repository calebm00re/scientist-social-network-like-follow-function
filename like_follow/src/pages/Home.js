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

  const handleFollow = (id) => {
    api.addToFollows(id).then(res => console.log(res));
  }

  const handleUnfollow = (id) => {
    api.removeFromFollows(id).then(res => console.log(res));
    //api call for unfollow
  }

  const handleNotification = (id) => {
    api.addNotification(id).then(res => console.log(res));
  }

  const handleUnnotification = (id) => {
    api.removeNotification(id).then(res => console.log(res));
    //api call for unnotification
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
              <CardHeader>
                {x.title}
                <Button className="m-2 float-right space-between" color="grey" variant="contained" onClick={() => handleNotification(x.document_id)}>Alert</Button>
                <Button className="m-2 float-right space-between" color="error" variant="contained" onClick={() => handleUnnotification(x.document_id)}>Remove Alert</Button>
              </CardHeader>
                <div className="card-body">
                  <p className="p-2">{x.author}</p>
                  <p className="p-2">{x.text}</p>
                  <Button color="primary" variant="contained" onClick={() => handleLike(x.document_id)}>Like</Button>
                  <Button className="m-2" color="error" variant="contained" onClick={() => handleDislike(x.document_id)}>Dislike</Button>

                  <Button className="m-2" color="success" variant="contained" onClick={() => handleFollow(x.document_id)}>Follow</Button>
                  <Button className="m-2" color="grey" variant="contained" onClick={() => handleUnfollow(x.document_id)}>Unfollow</Button>

                </div>
          </div>
        )}
        </Container>
      </Page>
    );
  }
}
