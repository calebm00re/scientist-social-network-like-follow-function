import { Container } from "@mui/material";
// components
import Page from "../components/Page";
import { Api } from "../api";
import React, { useContext, useState, useEffect } from "react";
import CardHeader from 'react-bootstrap/CardHeader';
import {DocCard} from '../components/DocCard';

export default function User() {

  const api = new Api;

  const [user, setUser] = useState(undefined);
  const [likes, setLikes] = useState(undefined);

  let docs = [];

  const documents = [];
  var current_document = undefined;

  useEffect(() => {
    api.getUser(1).then(x => setUser(x));
    api.getLikes(1).then(x => setLikes(x));
    // populateDocs();
  }, []);


  if (!user || !likes) {
    return (
      <div className="container mb-4">
        <h1>Loading...</h1>
      </div>
    )
  } else {
    // console.log(likes.length);
    // console.log(likes[0].user_id);
    //iterate through likes and call api.getDocument(id)
    likes.forEach(function(like) {
      api.getDocument(like.document_id).then(x => docs.push(x));
    });
    // setDocuments(docs);
    console.log(documents);
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
              <p className="p-2">Username: {user.username}</p>
              {
                likes.map((x, i) =>
                  <div key={i}>
                      <DocCard document_id={x.document_id} />
                  </div>
                )}
            </div>
          </div>
        </Container>
      </Page>
    );
  }
}
