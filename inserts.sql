-- create database gestionpyme;
use gestionpyme;

INSERT INTO usuario (email,nombre,password) values("a@mail.com","Nicolas","1234"),
						  ("b@mail.com","Juan","1234");
						
INSERT INTO administrador values(false,2);

INSERT INTO empleado values(25784,1,2);

insert into pais (descripcion) values ("ARGENTINA");

insert into provincia (descripcion,pais) values ("BUENOS AIRES",1);

insert into partido (descripcion,provincia) values ("LA MATANZA",1);

insert into localidad (descripcion,partido) values ("SAN JUSTO",1);

insert into calle (descripcion) values ("ARIETA"),
									   ("MARMOL"),
                                       ("ALMAFUERTE");
                                       
insert into situacionafip (codigo,descripcion) values ("RI","RESPONSABLE INSCRIPTO"),
													  ("CF","CONSUMIDOR FINAL"),
                                                      ("MT","MONOTRIBUTISTA");
