create table seller(id int primary key auto_increment, first_name varchar(50)
                     ,last_name varchar(50),email varchar(50),password varchar(50));

create table buyer(id int primary key auto_increment, first_name varchar(50)
    ,last_name varchar(50),email varchar(50),password varchar(50));

create table product(id int primary key auto_increment,product_name varchar(50)
                   ,product_price varchar(50)
                   ,seller_id int
                    ,FOREIGN KEY (seller_id) REFERENCES buyer(id));

create table invoice(id int primary key auto_increment
                    , local_date_time date
                    ,invoice_amount double precision
                    ,buyer_id int
                    ,seller_id int
                    ,product_id int
                    ,FOREIGN KEY (buyer_id) REFERENCES buyer(id)
                    ,FOREIGN KEY (seller_id) REFERENCES seller(id)
                    ,FOREIGN KEY (product_id) REFERENCES product(id));

