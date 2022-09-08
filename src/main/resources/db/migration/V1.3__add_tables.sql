create table vanzator(id int primary key auto_increment, first_name varchar(50)
                     ,last_name varchar(50),email varchar(50),password varchar(50));

create table cumparator(id int primary key auto_increment, first_name varchar(50)
    ,second_name varchar(50),email varchar(50),password varchar(50));

create table produs(id int primary key auto_increment,nume_produs varchar(50)
                   ,pret_produs varchar(50)
                   ,vanzator_id int
                    ,FOREIGN KEY (vanzator_id) REFERENCES vanzator(id));

create table factura(id int primary key auto_increment
                    , local_date_time date
                    ,pret_factura double precision
                    ,cumparator_id int
                    ,vanzator_id int
                    ,produs_id int
                    ,FOREIGN KEY (cumparator_id) REFERENCES cumparator(id)
                    ,FOREIGN KEY (vanzator_id) REFERENCES vanzator(id)
                    ,FOREIGN KEY (produs_id) REFERENCES produs(id));

