import React, { useContext, useState, useEffect } from 'react';
import { useParams } from 'react-router';
import { Grid, Container, Typography } from "@mui/material";
import CardHeader from 'react-bootstrap/CardHeader';
// components
import Page from "../components/Page";
import { Api } from '../api';


export const DocCard = props => {
    const api = new Api;
    const [document, setDocument] = useState(undefined);
    useEffect(() => {
        api.getDocument(props.document_id).then(x => setDocument(x));
    }, []);
    if (!document) {
        return <>
            <div>Loading...</div>
        </>
    }
    else {
        console.log(document);
        return (
            <>
                <Container maxWidth="xl">
                            <div className="card mb-4 d-flex">
                                <CardHeader>{document.title}</CardHeader>
                                <div className="card-body">
                                    <p className="p-2">{document.author}</p>
                                    <p className="p-2">{document.text}</p>
                                    {/* <a href="#" className="btn btn-success m-1">Like</a>
                                    <a href="#" className="btn btn-danger m-1">Dislike</a> */}
                                </div>
                            </div>
                </Container>
            </>
        );
    }
}