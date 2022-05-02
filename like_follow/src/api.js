import { URL} from './utils/misc';

export class Api {
    async getDocuments() {
        console.log(URL);
        return await fetch(`${URL}/documents`, {
            method: "POST",
        }).then(res => res.json());
        // return await fetch(`${URL}/documents`, {
        //     mode: 'no-cors',
        //     method: "post",
        // });
    }
}