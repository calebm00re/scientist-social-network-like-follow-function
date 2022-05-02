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

create table follows (
  document_id                   bigint auto_increment not null,
  user_id                       bigint,
  constraint pk_follows primary key (document_id)
);

create table likes (
  document_id                   bigint auto_increment not null,
  user_id                       bigint,
  constraint pk_likes primary key (document_id)
);

create table notifications (
  document_id                   bigint auto_increment not null,
  user_id                       bigint,
  constraint pk_notifications primary key (document_id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists document;

drop table if exists follows;

drop table if exists likes;

drop table if exists notifications;

drop table if exists user;

