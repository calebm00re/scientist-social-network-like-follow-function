import { Container } from "@mui/material";
// components
import Page from "../components/Page";
import { Api } from "../api";
import React, { useContext, useState, useEffect } from "react";
import CardHeader from 'react-bootstrap/CardHeader';

export default function User() {

  const api = new Api;

  const [user, setUser] = useState(undefined);
  const [likes, setLikes] = useState(undefined);

  const [documents, setDocuments] = useState(undefined);

  useEffect(() => {
    api.getUser(1).then(x => setUser(x));
    api.getLikes(1).then(x => setLikes(x));
    
  }, []);


  if (!user || !likes) {
    return (
      <div className="container mb-4">
        <h1>Loading...</h1>
      </div>
    )
  } else {
    // for (let i = 0; i < likes.length; i++) {
    //   api.getDocument(likes[i].document_id).then(x => setDocuments(x));
    // }
    return (
      <Page title="Likes">
        {/* <p>{documents[0].title}</p> */}
        <Container>
          <h1>Likes</h1>
          <div className="card mb-4">
            <div className="card-body">
              <p className="p-2">{user.username}</p>
              {
                likes.map((x, i) =>
                  <div key={i} className="card mb-4 d-flex">
                    <CardHeader>{x.user_id}</CardHeader>
                    <div className="card-body">
                      <p className="p-2">{x.document_id}</p>
                    
                    </div>
                  </div>
                )}
            </div>
          </div>
        </Container>
      </Page>
    );
  }
}
