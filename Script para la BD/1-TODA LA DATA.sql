SET FOREIGN_KEY_CHECKS=0;
insert into cliente (idCliente,descripcion) values (1,'');
insert into cliente (idCliente,descripcion) values (2,'');
insert into cliente (idCliente,descripcion) values (3,'');
insert into cliente (idCliente,descripcion) values (4,'');
insert into cliente (idCliente,descripcion) values (5,'');
insert into cliente (idCliente,descripcion) values (6,'');
insert into cliente (idCliente,descripcion) values (7,'');
insert into cliente (idCliente,descripcion) values (8,'');
insert into cliente (idCliente,descripcion) values (9,'');
insert into cliente (idCliente,descripcion) values (10,'');
;
insert into empleado (idEmpleado, cuil, idSucursal) values (11, '32-4606357',1);
insert into empleado (idEmpleado, cuil, idSucursal) values (12, '03-2533634',1);
insert into empleado (idEmpleado, cuil, idSucursal) values (13, '74-3269699',1);
insert into empleado (idEmpleado, cuil, idSucursal) values (14, '40-4830810',2);
insert into empleado (idEmpleado, cuil, idSucursal) values (15, '08-2495125',2);
insert into empleado (idEmpleado, cuil, idSucursal) values (16, '89-5272041',2);
insert into empleado (idEmpleado, cuil, idSucursal) values (17, '49-4733675',3);
insert into empleado (idEmpleado, cuil, idSucursal) values (18, '71-3970306',3);
insert into empleado (idEmpleado, cuil, idSucursal) values (19, '44-2191730',3);
;

;
insert into sucursal (idDomicilio, idEncargado) values (20, 11);
insert into sucursal (idDomicilio, idEncargado) values (21, 14);
insert into sucursal (idDomicilio, idEncargado) values (22, 17);
;
insert into domicilio (id, calle, numero, localidad, provincia) values (1, 'Rutledge', '5204', 'Reading', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (2, 'Haas', '3585', 'Buffalo', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (3, 'Kim', '4', 'Philadelphia', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (4, 'Larry', '61', 'New York City', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (5, 'Lien', '8935', 'Pittsburgh', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (6, 'Steensland', '367', 'Wilkes Barre', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (7, 'Loftsgordon', '8654', 'New York City', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (8, 'Waubesa', '45622', 'Albany', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (9, 'Continental', '7', 'Albany', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (10, '1st', '21', 'Erie', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (11, 'Clarendon', '10', 'Syracuse', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (12, 'Debs', '44759', 'Rochester', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (13, 'Carioca', '23379', 'Philadelphia', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (14, 'Anniversary', '7949', 'Brooklyn', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (15, 'School', '29', 'Harrisburg', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (16, 'David', '38515', 'Buffalo', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (17, 'Dixon', '4173', 'Erie', 'Pennsylvania');
insert into domicilio (id, calle, numero, localidad, provincia) values (18, 'Dottie', '34090', 'Buffalo', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (19, 'Independence', '7347', 'New York City', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (20, 'Forest', '7', 'Schenectady', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (21, 'Northwestern', '9305', 'Rochester', 'New York');
insert into domicilio (id, calle, numero, localidad, provincia) values (22, 'Fieldstone', '9', 'New York City', 'New York');

insert into perfume (idPerfume, comentario) values (8, 'Eau de toilette');
insert into perfume (idPerfume, comentario) values (9, 'A fragrance as intense as sensual');
insert into perfume (idPerfume, comentario) values (10, 'The very best');
insert into producto (id, descripcion, laboratorio, precio) values (1, 'Flutamide', 'Golden State Medical Supply, Inc.', 502);
insert into producto (id, descripcion, laboratorio, precio) values (2, 'Baby  Rash', 'DSE Healthcare Solutions, LLC.', 553);
insert into producto (id, descripcion, laboratorio, precio) values (3, 'Halobetasol', 'Taro Pharmaceuticals U.S.A., Inc.', 406);
insert into producto (id, descripcion, laboratorio, precio) values (4, 'PHOMA DESTR', 'Allergy Laboratories, Inc.', 1002);
insert into producto (id, descripcion, laboratorio, precio) values (5, 'Venlafaxine', 'Aphena Pharma Solutions - Tennessee, LLC', 1212);
insert into producto (id, descripcion, laboratorio, precio) values (6, 'Mattifying', 'JAFRA COSMETICS INTERNATIONAL', 710);
insert into producto (id, descripcion, laboratorio, precio) values (7, 'Griseofulvin', 'Oceanside Pharmaceuticals', 469);
insert into producto (id, descripcion, laboratorio, precio) values (8, '1 Million', 'Paco Rabanne', 1700);
insert into producto (id, descripcion, laboratorio, precio) values (9, 'Good Girl', 'Carolina Herrera', 1800);
insert into producto (id, descripcion, laboratorio, precio) values (10, 'Invictus', 'Paco Rabanne', 700);

insert into medicamento (idMedicamento, comentario) values (1, 'optimize transparent infrastructures');
insert into medicamento (idMedicamento, comentario) values (2, 'incentivize interactive metrics');
insert into medicamento (idMedicamento, comentario) values (3, 'maximize real-time ROI');
insert into medicamento (idMedicamento, comentario) values (4, 'revolutionize compelling vortals');
insert into medicamento (idMedicamento, comentario) values (5, 'repurpose B2B communities');
insert into medicamento (idMedicamento, comentario) values (6, 'engage cross-media bandwidth');
insert into medicamento (idMedicamento, comentario) values (7, 'architect holistic e-services');

insert into persona (id, dni, nombre, apellido, idDomicilio) values (1, '17-919-4919', 'Feliks', 'Barrat', 1);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (2, '37-063-2087', 'Krystalle', 'Cranna', 2);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (3, '85-609-0626', 'Aldous', 'Shale', 3);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (4, '17-434-5231', 'Harli', 'Crichmere', 4);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (5, '04-060-0561', 'Marco', 'Torrie', 5);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (6, '44-576-4167', 'Dot', 'Cheley', 6);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (7, '15-366-5628', 'Kathryn', 'O''Scanlan', 7);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (8, '20-324-6822', 'Drucill', 'Schaben', 8);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (9, '39-627-9152', 'Natividad', 'Mebius', 9);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (10, '46-689-2428', 'Nettie', 'Tollady', 10);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (11, '72-756-7606', 'Minni', 'MacEveley', 11);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (12, '36-467-7831', 'Shawna', 'Minihan', 12);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (13, '66-996-5993', 'Nicky', 'Franssen', 13);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (14, '33-472-8701', 'Gifford', 'Skelhorne', 14);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (15, '14-986-7318', 'Nancee', 'Avramovich', 15);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (16, '51-658-4269', 'Shaylah', 'Izzatt', 16);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (17, '43-168-8693', 'Pauline', 'Fronzek', 17);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (18, '85-552-5321', 'Malia', 'Paulot', 18);
insert into persona (id, dni, nombre, apellido, idDomicilio) values (19, '93-851-3951', 'Alain', 'Lewson', 19);

insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-30 11:47:36', 1, 11, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-01 09:59:37', 2, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-14 08:19:31', 6, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-02 06:11:12', 1, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-18 10:00:44', 9, 12, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-03 08:21:21', 7, 12, 12, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-15 12:50:00', 5, 12, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-25 08:00:21', 1, 12, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-25 10:56:09', 9, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-06 02:04:01', 4, 13, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-10 13:53:07', 6, 11, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-30 06:01:00', 5, 11, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-05 15:30:16', 2, 12, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-17 11:50:17', 4, 12, 12, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-06 04:29:01', 9, 13, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-13 09:53:24', 4, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-07 16:57:29', 2, 12, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-18 01:50:15', 10, 11, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-01 02:13:48', 9, 11, 12, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-06 08:18:25', 8, 12, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-02 14:23:30', 6, 13, 13, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-15 10:13:01', 2, 12, 12, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-07 01:44:47', 1, 11, 11, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-11 07:13:25', 6, 13, 12, 1);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-27 21:08:46', 5, 11, 12, 1);

insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-03 14:27:51', 6, 16, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-23 03:38:50', 2, 15, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-11 20:58:15', 5, 15, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-19 13:30:35', 2, 14, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-14 10:15:53', 1, 14, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-21 00:04:06', 1, 15, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-03 16:37:03', 7, 15, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-09 02:00:23', 9, 14, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-08 04:05:53', 1, 14, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-06 19:58:17', 5, 16, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-02 00:45:06', 2, 15, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-30 20:46:07', 5, 16, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-10 13:03:17', 2, 14, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-07 04:55:32', 7, 16, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-08 05:45:36', 4, 15, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-18 09:43:18', 10, 16, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-11 06:03:32', 4, 15, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-23 01:52:15', 2, 16, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-31 03:33:12', 10, 14, 15, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-29 18:39:52', 4, 14, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-15 20:35:34', 1, 14, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-03 21:46:46', 9, 16, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-18 12:31:19', 4, 16, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-13 04:40:58', 9, 14, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-07 19:15:09', 9, 16, 16, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-10 05:24:25', 3, 16, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-26 10:23:01', 4, 16, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-02 17:15:46', 6, 16, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-03 04:41:52', 6, 15, 14, 2);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-19 13:47:31', 7, 15, 16, 2);


insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-07 10:55:09', 10, 18, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-17 04:58:18', 10, 19, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-06 10:09:12', 4, 17, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-07 17:28:36', 1, 19, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-23 16:11:28', 7, 17, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-12 20:06:10', 8, 19, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-09 18:04:50', 10, 18, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-20 17:14:40', 9, 18, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-17 16:18:35', 9, 19, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-28 10:41:22', 9, 18, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-19 14:59:08', 9, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-11 16:04:48', 7, 18, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-06 02:24:59', 10, 18, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-22 15:14:47', 6, 17, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-17 16:51:24', 3, 17, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-08 10:50:07', 3, 18, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-06 06:58:57', 8, 17, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-25 12:27:18', 9, 17, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-15 23:03:49', 10, 18, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-20 22:42:03', 10, 18, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-12 14:05:21', 5, 17, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-21 20:19:41', 10, 19, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-20 09:58:11', 5, 18, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-15 17:52:17', 1, 17, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-06-02 10:03:25', 7, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-18 15:59:11', 5, 18, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-10 02:45:00', 3, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-04-08 18:01:52', 8, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-02 04:14:42', 7, 17, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-14 15:58:29', 10, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-09 22:55:25', 1, 19, 17, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-05-22 07:41:59', 9, 17, 19, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-05-25 07:30:03', 9, 19, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Tarjeta', '2018-04-08 15:30:12', 10, 17, 18, 3);
insert into venta (formaPago, fecha, idCliente, idVendedor, idCajero, idSucursal) values ('Efectivo', '2018-06-06 00:43:38', 2, 17, 17, 3);


insert into detalleventa (cantidad, idProducto, idVenta) values (1, 4, 1);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 4, 2);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 3);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 2, 4);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 2, 5);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 1, 6);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 7);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 8);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 9);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 10);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 11);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 12);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 4, 13);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 14);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 2, 15);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 2, 16);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 17);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 2, 18);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 1, 19);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 4, 20);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 21);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 22);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 23);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 1, 24);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 25);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 2, 26);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 27);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 28);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 29);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 30);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 31);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 32);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 3, 33);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 3, 34);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 1, 35);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 36);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 37);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 38);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 39);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 40);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 3, 41);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 42);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 43);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 44);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 3, 45);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 46);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 2, 47);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 3, 48);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 49);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 50);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 2, 51);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 52);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 4, 53);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 54);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 1, 55);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 1, 56);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 2, 57);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 1, 58);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 3, 59);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 4, 60);

insert into detalleventa (cantidad, idProducto, idVenta) values (1, 9, 61);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 62);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 63);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 64);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 65);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 66);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 9, 67);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 9, 68);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 8, 69);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 8, 70);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 8, 71);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 9, 72);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 9, 73);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 8, 74);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 75);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 76);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 9, 77);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 9, 78);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 8, 79);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 9, 80);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 81);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 8, 82);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 83);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 84);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 9, 85);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 9, 86);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 9, 87);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 88);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 8, 89);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 8, 90);

insert into detalleventa (cantidad, idProducto, idVenta) values (2, 7, 1);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 6, 2);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 7, 3);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 5, 4);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 7, 5);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 6, 6);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 6, 7);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 7, 8);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 6, 9);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 6, 10);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 6, 11);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 7, 12);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 5, 13);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 6, 14);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 7, 15);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 5, 16);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 7, 17);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 6, 18);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 7, 19);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 5, 20);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 5, 21);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 5, 22);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 6, 23);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 7, 24);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 6, 25);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 7, 26);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 6, 27);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 7, 28);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 5, 29);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 5, 30);

insert into detalleventa (cantidad, idProducto, idVenta) values (3, 10, 61);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 62);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 63);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 10, 64);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 10, 65);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 66);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 10, 67);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 68);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 69);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 10, 70);
insert into detalleventa (cantidad, idProducto, idVenta) values (1, 10, 71);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 10, 72);
insert into detalleventa (cantidad, idProducto, idVenta) values (3, 10, 73);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 10, 74);
insert into detalleventa (cantidad, idProducto, idVenta) values (2, 10, 75);





INSERT INTO `farmacia`.`obrasocial` (`nombre`, `descripcion`) VALUES ('OSECAC', 'Tu seguridad nos importa');
INSERT INTO `farmacia`.`obrasocial` (`nombre`, `descripcion`) VALUES ('IOMA', 'Una manera de vivir');

insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (9156724, '2018-02-28 01:24:59', 1);
insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (5681845, '2017-07-20 07:05:00', 2);
insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (8364389, '2017-09-25 03:26:37', 1);
insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (7528376, '2017-07-05 21:05:59', 2);
insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (6655953, '2018-03-24 05:36:46', 1);
insert into afiliado (numafiliado, fecafiliacion, idObraSocial) values (8363004, '2017-12-13 07:23:11', 2);


UPDATE `farmacia`.`persona` SET `idAfiliado`='1' WHERE `id`='1';
UPDATE `farmacia`.`persona` SET `idAfiliado`='2' WHERE `id`='2';
UPDATE `farmacia`.`persona` SET `idAfiliado`='3' WHERE `id`='3';
UPDATE `farmacia`.`persona` SET `idAfiliado`='4' WHERE `id`='4';
UPDATE `farmacia`.`persona` SET `idAfiliado`='5' WHERE `id`='5';
UPDATE `farmacia`.`persona` SET `idAfiliado`='6' WHERE `id`='6';


update detalleventa dv
inner join producto p
on dv.idProducto = p.id
set dv.precioUnitario = p.precio;

update detalleventa dv
set dv.subtotal = dv.precioUnitario * dv.cantidad;

UPDATE venta 
INNER JOIN
(
    SELECT v2.id, sum(dv.subtotal) as totalGastado
	FROM (select*from venta) v2
	INNER JOIN detalleventa dv
	ON dv.idVenta = v2.id
	GROUP BY v2.id
) B using (id)
SET venta.totalVenta = totalGastado;


SET FOREIGN_KEY_CHECKS=1;