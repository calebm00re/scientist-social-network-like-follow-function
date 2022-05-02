# scientist-social-network-like-follow-function

Our social network functionality is the ability to like, follow, and apply for notifications from a particular research paper.

### Runnig the Backend: Play

1. Open the `ebean-backend` folder in its own window in IntelliJ
2. Go the file conf->application.conf
3. In line 14, you can specify the port number that the MySQL database is running on
4. Replace the 'INSERT_DATABASE_HERE' portion of the URL with the name of the database you will be using
5. Run the backend, a new window in Chrome should open. If you are running the backend for the first time, Chrome will prompt you to run some SQL scripts to set up the tables in the MySQL database
6. Once all of the tables are set up and your connection to the database is established, the window in Chrome will say "Welcome to Backend"
7. Finally Run the following SQL scripts to populate the tables with data for frontend testing:

```
insert into user (username, password) values ("User1", "password");
```

```
Insert into document (title, author, text) values
('Document 1', 'Author 1', 'full text....'),
('Document 2', 'Author 2', 'full text....'),
('Document 3', 'Author 3', 'full text....'),
('Document 4', 'Author 4', 'full text....'),
('Document 5', 'Author 5', 'full text....'),
('Document 6', 'Author 6', 'full text....'),
('Document 7', 'Author 7', 'full text....');
```


8. Once the data has been inserted, you are done setting up the backend and you can move on to the frontend


### Running the Frontend: React
1. Open the `like_follow` folder in VSCode
2. Open a new terminal, and within the `like_follow` scope, run `npm install` in the terminal
3. Once npm is installed, you can run `npm start` to start up the frontend
4. In Chrome, there may be some API permissions that do not allow the frontend to connect to the backend routes. We found that the Chrome extension Moesif CORS allows the APIs to work if there are any issues. The extension can be found at https://chrome.google.com/webstore/detail/moesif-origin-cors-change/digfbfaphojjndkpccljibejjbppifbc?hl=en-US
5. If you install the Moesif CORS extension, once the extension is install, make sure to turn the extension on in the top right corner of the Chrome window
6. Now the Frontend should be set up, if you are not directly taken to the `Home/Browse` screen, click on the the navigation bar and navigate to the `Home/Browse` tab to begin using the application


### Navigating our repository
Our files for our frontend pages that will need to be edited for future functionality integration are located in the following files: like_follow -> src -> pages -> (Home, Likes, Follows, and Notifications js files)

Our files for out backend routes and functionality might need updating for future integration and can be found here: 

## How to run our functions

console within the file directory like_follow:
```
npm start
```
