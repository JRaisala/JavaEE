insert into user (username,password,`PRIMARY`enable) values("admin", "admin", "1");

select * from user;

insert into user_roles (user_id,role) values(1,"ROLE_ADMIN");

select * from user_roles;

drop user 'admin'@'localhost';

