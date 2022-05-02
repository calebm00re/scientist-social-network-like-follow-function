import { URL} from './utils/misc';

export class Api {
    async getDocuments() {
        console.log(URL);
        return await fetch(`${URL}/documents`, {
            method: "POST",
        }).then(res => res.json());
    }

    async getDocument(id) {
        return await fetch(`${URL}/documents/${id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async getUser(id) {
        return await fetch(`${URL}/users/${id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async getLikes(user_id) {
        return await fetch(`${URL}/likes/${user_id}`, {
            method: "POST",
        }).then(res => res.json());
    }
    
    async addToLikes(document_id) {
        return await fetch(`${URL}/addLike/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async removeFromLikes(document_id) {
        return await fetch(`${URL}/unlike/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }
}