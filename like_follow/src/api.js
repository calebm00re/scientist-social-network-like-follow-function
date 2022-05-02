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

    async addToFollows(document_id) {
        return await fetch(`${URL}/addFollow/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async removeFromFollows(document_id) {
        return await fetch(`${URL}/unfollow/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    //get follows by  a user
    async getFollows(user_id) {
        return await fetch(`${URL}/follows/${user_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    //add notification
    async addNotification(document_id) {
        return await fetch(`${URL}/addNotification/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async removeNotification(document_id) {
        return await fetch(`${URL}/removeNotification/${document_id}`, {
            method: "POST",
        }).then(res => res.json());
    }

    async getNotifications(user_id) {
        return await fetch(`${URL}/notifications/${user_id}`, {
            method: "POST",
        }).then(res => res.json());
    }
}