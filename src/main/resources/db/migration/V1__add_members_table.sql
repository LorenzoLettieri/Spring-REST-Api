create table members (
id int auto_increment not null,
name varchar(255) default null,
surname varchar(255) default null,
email varchar(255) default null unique,
created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
primary key (id)
)