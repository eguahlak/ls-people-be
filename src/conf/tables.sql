drop table People;

create table People (
  email varchar(80) primary key,
  first_name varchar(40) not null,
  last_name varchar(40) not null,
  age int not null
  );
