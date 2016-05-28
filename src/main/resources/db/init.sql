CREATE TABLE IF NOT EXISTS users (
   id int PRIMARY KEY auto_increment,
   First_name VARCHAR,
   last_name VARCHAR,
   email VARCHAR UNIQUE,
   bio VARCHAR,
   location VARCHAR,
   zip VARCHAR,
   lat VARCHAR,
   lng VARCHAR,
   password VARCHAR,
   img VARCHAR,
   UNIQUE(email)
);

CREATE TABLE IF NOT EXISTS posts (
   id INTEGER PRIMARY KEY auto_increment,
   user_id INTEGER,
   sport VARCHAR,
   type VARCHAR,
   rate VARCHAR,
   available VARCHAR,
   description VARCHAR,
   location VARCHAR,
   lat VARCHAR,
   lng VARCHAR,
   FOREIGN KEY(user_id) REFERENCES public.users(id)
);