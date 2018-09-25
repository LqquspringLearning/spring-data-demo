create database  grad_step;

use grad_step;
create table t_user(
  id int primary key ,
  name varchar(10)
);
create table t_role(
  id int primary key ,
  code varchar(100) unique ,
  name varchar(10)
);
create table  t_privilege(
  id int primary key ,
  code varchar(100) unique ,
  name varchar(100)
);
create table t_role_privilege(
  role_code varchar(100),
  privilege_code varchar(100)
);



