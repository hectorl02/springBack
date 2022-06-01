# springBack
Backend básico en JAVA con relacion manyToOne, inyección de dependencias y crud, se tiene 2 entidades: categoria y producto
// se crea manualmente las categorias de los productos
create database db_manytoone;

insert into categorias(nombre) values('LAPTOP');
insert into categorias(nombre) values('MOUSE');
insert into categorias(nombre) values('TECLADO');

insert into productos (nombre, precio, imagen, categoria_id) values ('LAPTOP GAMER ASUS', 4000.00, 'https://home.ripley.com.pe/Attachment..., 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('LAPTOP GAMER ACER', 3500.00, 'https://home.ripley.com.pe/Attachment..., 1);
