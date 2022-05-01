# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table document (
  document_id                   bigint auto_increment not null,
  title                         varchar(255),
  author                        varchar(255),
  text                          varchar(255),
  constraint pk_document primary key (document_id)
);

create table likes (
  user_id                       bigint,
  document_id                   bigint
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists document;

drop table if exists likes;

drop table if exists user;
