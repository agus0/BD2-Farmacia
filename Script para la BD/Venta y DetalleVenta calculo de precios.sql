update detalleventa dv
inner join producto p
on dv.idProducto = p.id
set dv.precioUnitario = p.precio

update detalleventa dv
set dv.subtotal = dv.precioUnitario * dv.cantidad

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