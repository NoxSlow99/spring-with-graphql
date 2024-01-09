USE graphql;

CREATE TABLE courses
(
    id       bigint auto_increment,
    name     varchar(100) not null,
    category varchar(50)  not null,
    teacher  varchar(100) not null,

    primary key (id)
);

CREATE TABLE students
(
    id        bigint auto_increment,
    name      varchar(50) not null,
    last_name varchar(50) not null,
    age       int         not null,
    course_id bigint      not null,

    primary key (id),
    foreign key (course_id) REFERENCES courses (id)
);