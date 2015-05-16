-- create table
create table client (
	uid serial primary key,
	name varchar(200)
);

create table pet (
	uid serial primary key,
	client_id int not null references client(uid),
	nick varchar(200)
);

-- add new client
insert into client (name) values ('petr');

-- add new pet
insert into pet (client_id, nick) values (1, 'sparky');

insert into pet (client_id, nick) values (1, 'boby');

-- select pet with client
select pet.nick, client.name from pet as pet
inner join client as client on client.uid = pet.client_id;

-- select client by name
select * from client as client where client.name = 'petr'

-- update pet
update pet as pet set nick = 'bob' where pet.nick = 'boby'

-- delete pet by nick
delete from pet as pet where pet.nick = 'bob'

-- roles
create table roles (
		uid serial primary key,
		name varchar(200)
);

-- users
create table users (
		uid serial primary key,
		login varchar(200),
		email varchar(200),
		role_id int not null references roles(uid)
);

-- messages

-- users
create table messages (
		uid serial primary key,
		text  character varying,
		user_id int not null references users(uid)
);