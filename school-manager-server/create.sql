create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (user_id bigint not null, authority bytea);
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), expiration_date timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), token varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), expiration_date timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), token varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
create sequence authorities_seq start with 1 increment by 50;
create sequence director_super_director_seq start with 1 increment by 50;
create sequence it_school_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table city (id bigint not null, name varchar(255), primary key (id));
create table city_school_table (city_id bigint not null, school_id bigint not null, primary key (city_id, school_id));
create table director_super_director (last_name varchar(5), id bigint not null, address varchar(255), first_name varchar(255), phone varchar(255), primary key (id));
create table it_school (id bigint not null, secured_director_id bigint unique, version bigint, school_address varchar(255), school_name varchar(255), primary key (id));
create table item_tag (item_id bigint not null, tag varchar(255));
create table users (enabled boolean not null, created_at timestamp(6), expiration_date timestamp(6), id bigint not null, modified_at timestamp(6), full_name varchar(255), password varchar(255), token varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
alter table if exists city_school_table add constraint FK88pqkk6u3719kbwwy7gwnuv9o foreign key (school_id) references city;
alter table if exists city_school_table add constraint FKmdrol0ddml856obsvaq41q95c foreign key (city_id) references it_school;
alter table if exists it_school add constraint FK26k24aa662tyirwwf44uwr5xo foreign key (secured_director_id) references director_super_director;
alter table if exists item_tag add constraint FK4r7q9j1yudp9bhkduvsclcvqf foreign key (item_id) references it_school;
