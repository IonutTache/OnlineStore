create table vanzator(id int primary key auto_increment, first_name varchar(50)
                     ,last_name varchar(50),email varchar(50),password varchar(50)
                     ,produs varchar(50));

create table cumparator(id int primary key auto_increment, first_name varchar(50)
    ,second_name varchar(50),email varchar(50),password varchar(50));

create table produs(id int primary key auto_increment,nume_produs varchar(50)
                   ,pret_produs varchar(50))