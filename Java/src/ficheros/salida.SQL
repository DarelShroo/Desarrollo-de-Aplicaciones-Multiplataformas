
--Sucursal (CodS (numero entero autonum�rico), Direccion (de hasta 50 caracteres), Telefono (10 caracteres) 
--Cuenta (CCC (20 caracteres), Sucursal ( num�rica) , Estado (1 car�cter), Saldo (moneda))
--Cliente (DNI (12 caracteres), Nombre (hasta 30 caracteres), Direccion ( hasta 50 caracteres), Edad (numero entero))
--Cuenta_Cliente (DNI, CCC, Privilegios(1 caracter) )
--Apunte (Ref (autonum�rico), DNI, CCC, Concepto ( 1 car�cter), Importe (moneda), fecha(datetime))

--1. Inserta una sucursal a la que le asignamos los valores: Direccion : Avenida Paris 54 , Telefono: 922-556699--2. Inserta otra sucursal con los datos que quieras.
--3. Inserta una cuenta: CCC:11111222223333344444, Sucursal: 1 , Estado: null, Saldo: 100,00
--4. Inserta otra cuenta: en la sucursal 1 , sin bloquear y saldo por defecto.
--5. Inserta como m�nimo 2 registros en cada tabla


--6. Modifica la cuenta con c�digo 11111222223333344444 y pon su estado a bloqueada
--7. Crea una tabla llamada cuentasBloqueadas con los datos de las cuentas que est�n bloqueadas. (todo con una sola instrucci�n)
--8. Inserta una sucursal.
--9. Elimina la sucursal con c�digo 2

--10. Inserta otra sucursal.
--11. Elimina todos los apuntes de la fecha x
--12. A�ade un apunte. Visualiza todo y comprueba que los n�meros de referencia se pierden los eliminados.
--13. Elimina todos los registros de la tabla apuntes truncando
--14. A�ade un nuevo registro a apuntes y visualiza la numeraci�n de la referencia �Qu� ha pasado?--15. A�ade los registros de apuntes que has eliminado.
--16. Elimina los registros de apuntes que pertenezcan a todas las cuentas que est�n bloqueadas.
--17. C�mbiale a la cuenta x el saldo a 1200
--18. Decrementa el saldo de todas las cuentas en un 10 %.

--19. Incrementa el saldo de las cuentas en un 5% de aquellas cuentas de la sucursal 1. 




--1. Visualiza todos los DNIs que han hecho alg�n apunte, que no aparezcan repetidos.--2. Cual es el dni o dnis que ha hecho mas apuntes--3. Cual es el dni o dnis que ha hecho mas apuntes de concepto �I� por un importe mayor a 100--4. Que dnis han hecho mas de dos apuntes por un importe mayor a 100--5. Cual o cuales son los dni que han hecho apuntes a mas de una cuenta--6. Cuantas operaciones ha realizado el dni X

--7. El dni X cuanto dinero de media a Ingresado a la cuenta X
--8. De todos los dnis con letra X quien o quienes han hecho un reintegro mas alto en el a�o actual

--9. Cual es la cuenta en la que se ha ingresado mas en total en los �ltimos tres meses
--10. Visualiza todas las cuentas en las que se han realizado ingreso en el mes actual, sin repetirlas

--11. Cual o cuales son el dni y cuenta en el que se han hecho mas operaciones
/*12. Visualiza las operaciones de las cuentas que terminan en �xxxx� ordenadas por la fecha/*12. Visualiza las operaciones de las cuentas que terminan en �xxxx� ordenadas por la fechade la operaci�n , en primer lugar las mas cercanas al dia de hoy*/


/*13. Cual es el mes o meses de este a�o en el que se ha hecho mayor cantidad de ingresos/*13. Cual es el mes o meses de este a�o en el que se ha hecho mayor cantidad de ingresosen total*/ 
select top 1 with ties month(fecha) mes,count (ref) total from Apunte where year(fecha)=year(getdate()) and concepto = 'I' group by month(fecha) order by  total desc
SELECT TOP 1 WITH TIES SUM(Importe) as total, month(Fecha) as mes FROM APUNTEWHERE Concepto = 'I' AND year(Fecha) = year(getdate()) GROUP BY month(Fecha) ORDER BY total DESC
select*from apunte order by fechaupdate Apunte set fecha ='01-01-2020' where ref =1 or ref =2update Apunte set importe=5000 where ref =5
/*1. Visualizar los datos de todos los clientes (dni, nombre y direcci�n) cuyas cuentas/*1. Visualizar los datos de todos los clientes (dni, nombre y direcci�n) cuyas cuentastengan saldos negativos.*/

--2. Cu�l es la sucursal que tiene m�s cuentas bloqueadas. Visualizar el c�digo y direcci�n



--3. Visualizar el nombre del cliente que ha hecho el mayor movimiento de ingreso, as� como el ccc y nombre de la sucursal donde est� esta cuenta.


--4. Para todas las cuentas de la sucursal 1 visualizar todos sus apuntes y el saldo total.

--5. Visualizar del cliente x y cuenta x todos los apuntes del a�o actual.

--6. Visualizar los datos del cliente que tiene m�s cuentas.
--7. Visualizar las sucursales y la cantidad de cuentas de clientes menores de 30 a�os, pero solo visualizar aquellas sucursales que tengan m�s de 1 cliente menor de esa edad.


--8. Visualizar la cuenta que m�s movimientos de ingreso ha realizado en el a�o pasado, tambi�n queremos saber el nombre del due�o de esa cuenta.
--9. Visualizar la cuenta que m�s dinero ha ingresado en el a�o pasado y a que sucursal pertenece.

--10. Visualiza los datos de los clientes que no tengan ninguna cuenta asociada. /*11. Visualiza los datos de los clientes con edad entre 25 y 30 y tambi�n visualiza sus/*11. Visualiza los datos de los clientes con edad entre 25 y 30 y tambi�n visualiza susn�meros de cuentas*/

--12. Visualiza los datos de aquellos clientes que tienen mas de 1 cuenta

--13. Visualiza los datos del cliente o clientes con mas cuentas
--14. Visualiza los datos de los clientes que tengan el privilegio de Reintegro en alguna de sus cuentas.
/*15. Cuantos clientes tienen el permiso de Reintegro en alguna de sus cuentas, si un cliente/*15. Cuantos clientes tienen el permiso de Reintegro en alguna de sus cuentas, si un clientetiene el permiso de reintegro en varias cuentas solo lo contaremos una vez.*/

--16. Visualiza todos los dnis y nombres de clientes con la cantidad de cuentas que tiene cada uno

--17. Cual es la menor edad de los clientes que tienen mas de 1 cuenta


/*18. Visualiza las CCC y la cantidad de privilegios diferentes que tiene cada cuenta, si varias/*18. Visualiza las CCC y la cantidad de privilegios diferentes que tiene cada cuenta, si variaspersonas tienen el mismo privilegio sobre la misma cuenta lo contaremos como uno.*/

/*19. Visualiza los datos de los clientes con privilegio de Reintegro y con edad mayor de 20 y/*19. Visualiza los datos de los clientes con privilegio de Reintegro y con edad mayor de 20 yque hayan nacido en el primer semestre de su a�o de nacimiento. */


/*20. Visualiza la cuenta que tenga menos saldo, el CCC, el c�digo de la sucursal y todos los/*20. Visualiza la cuenta que tenga menos saldo, el CCC, el c�digo de la sucursal y todos losdnis asociados*/


--21. Igual al anterior pero tambi�n visualiza la direcci�n y tel�fono de la sucursal
--22. Cuantas cuentas no est�n bloquedas
--23. Visualiza los dnis de los due�os de las cuentas con saldo negativo , sin repetir ning�n dni
--24. Visualiza la direcci�n de las sucursales de las cuentas con saldos negativos y con estado no bloqueado. 

--25. Cuantas cuentas corrientes hay con saldo negativo y estado no bloqueado

--26. Visualiza las direcciones de las sucursales y la cantidad de cuentas que tiene cada una
--27. Visualiza los dnis de los clientes que tienen cuentas en mas de una sucursal

--28. �hay alguna cuenta sin dni asociado ?, si es as� visualiza todos los datos de esa cuenta y la direcci�n de la sucursal


--29. Visualiza la cuenta o cuentas y los nombres de los due�os con el saldo mayor ordenado por CCC

--30. Igual al anterior pero de aquellas cuentas con saldo entre 100 y 1000


--31. Visualiza los diversos estados posibles y cuantas cuentas hay en cada uno de ellos
--32. Visualiza el privilegio que tiene mas cuentas diferentes

--33. Visualiza el privilegio que lo tienen mas clientes

--34. Visualizar las cuentas que entre todos sus clientes tienen los dos privilegios

--De los clientes con m�s de veinte a�os visualiza sus ccc, dni y privilegios.





/*SUBCONSULTA*//*SUBCONSULTA*/


--1. De los clientes con m�s de veinte a�os visualiza sus ccc, dni y privilegios.



--2. Visualiza los datos de los clientes con mas de una cuenta.





--3. De todas las cuentas bloqueadas visualiza los datos (ccc y nombre del cliente) de--aquella que haya tenido m�s movimientos.




--4. Visualizar los datos de todos los clientes (dni, nombre y direcci�n) cuyas cuentas tengan saldos negativos.


--5. Cu�l es la sucursal que tiene m�s cuentas bloqueadas. Visualizar el c�digo y direcci�n
--Subconsulta




--6 Visualizar los datos del cliente que tiene m�s cuentas.
--7. Visualiza los datos de los clientes que no tengan ninguna cuenta asociada.




/*8. De todos los clientes con edad menor de 18 visualiza aquellos que tengan cuentas con/*8. De todos los clientes con edad menor de 18 visualiza aquellos que tengan cuentas consaldo mayor de 100 y que hayan realizado m�s de 2 movimientos de ingreso en el a�oanterior.*/

--SUBCONSULTAS
/*9. Visualiza los datos de los clientes junto con sus movimientos en las cuentas y adem�s/*9. Visualiza los datos de los clientes junto con sus movimientos en las cuentas y adem�sel saldo total que tienen en la cuenta. (El saldo total lo visualizaremos calcul�ndoloseg�n los movimientos)*/
/*10. Visualiza los datos de la sucursal cuyo sumatorios de los saldos de las cuentas sea/*10. Visualiza los datos de la sucursal cuyo sumatorios de los saldos de las cuentas seamayor que la media de los saldos de las cuentas de todas las sucursales, o sea, paracalcular la media, primero obtenemos el saldo total de cada sucursal y a esto leaplicamos la media. */






/* 12. Cu�l es el nombre del cliente que en total ha realizado mas importe en ingresos en el/* 12. Cu�l es el nombre del cliente que en total ha realizado mas importe en ingresos en ela�o actual. */


--Subconsulta









--14. Cual es la direcci�n de la sucursal con mas cuentas con apuntes
















/*17 Cual es el nombre de las personas que en total han ingresado m�s dinero a una cuenta.*//*17 Cual es el nombre de las personas que en total han ingresado m�s dinero a una cuenta.*/

/*18. Cual es el nombre de las personas que en total han ingresado m�s dinero*//*18. Cual es el nombre de las personas que en total han ingresado m�s dinero*/



/* subconsulta *//* subconsulta */


--20.- �hay alguna cuenta sin dni asociado ?, si es as� visualiza todos los datos de esa cuenta y la--direcci�n de la sucursal 



---SUBCONSULTA/* 21. Visualiza los datos del cliente o clientes con m�s cuentas. *//* 21. Visualiza los datos del cliente o clientes con m�s cuentas. */

--Subconsulta


--subconsulta






--subconsulta





/*25.- Visualiza todas las cuentas que tengan mas dnis asociados que la cuenta con ccc X*//*25.- Visualiza todas las cuentas que tengan mas dnis asociados que la cuenta con ccc X*//*26.- Visualiza todos los movimientos de las cuentas que pertenezcan a la sucursal con menos/*26.- Visualiza todos los movimientos de las cuentas que pertenezcan a la sucursal con menoscuentas.*/


--Subconsulta



/*27.- Visualiza los movimientos de la cuenta que tenga solo un dnis asociados *//*27.- Visualiza los movimientos de la cuenta que tenga solo un dnis asociados */
/*28.- Visualiza los dnis de los due�os de las cuentas con saldo negativo , sin repetir ning�n dni *//*28.- Visualiza los dnis de los due�os de las cuentas con saldo negativo , sin repetir ning�n dni */















--subconsulta








/*1. Crea una vista con todos los datos de los clientes y sus cuentas. Visual�zalo ordenado/*1. Crea una vista con todos los datos de los clientes y sus cuentas. Visual�zalo ordenadopor nombre de cliente. */

/*2. Crea una vista con la cuenta que tiene mas clientes y la cantidad de clientes que tiene. *//*2. Crea una vista con la cuenta que tiene mas clientes y la cantidad de clientes que tiene. */


/* 3. Crea una consulta utilizando la vista del primer ejercicio que visualice el nombre de los/* 3. Crea una consulta utilizando la vista del primer ejercicio que visualice el nombre de losclientes que m�s cuentas tenga y la cantidad de ellos. */

/* 4. Visualiza el contenido de la vista anterior. *//* 4. Visualiza el contenido de la vista anterior. */





--7. Utilizando la vista del primer ejercicio elimina un cliente que no tenga ninguna cuenta.


/*9. Modifica la vista del ejercicio uno a�adi�ndole Schemabinding. Intenta eliminar de la/*9. Modifica la vista del ejercicio uno a�adi�ndole Schemabinding. Intenta eliminar de latabla clientes el campo edad.*/
/*10. Ejecuta el comando exec sp_helptext nombredelavista*//*10. Ejecuta el comando exec sp_helptext nombredelavista*/
/*11. Modifica la vista a�adiendole with encryption. Vuelve a ejecutar el comando/*11. Modifica la vista a�adiendole with encryption. Vuelve a ejecutar el comandoexec sp_helptext nombredelavista*/
/*12. Crea una vista con todos los movimientos del d�a actual ordenado por n�meros de/*12. Crea una vista con todos los movimientos del d�a actual ordenado por n�meros decuentas, tambi�n debe aparecer el nombre de la persona que ha hecho la operaci�n.*/

/*13. Utilizando la vista anterior haz una vista que visualice el total de dinero ingresado en/*13. Utilizando la vista anterior haz una vista que visualice el total de dinero ingresado encada cuenta.*/

/*14. Utilizando la vista del ejercicio 12 visualiza la media del dinero ingresado en cada/*14. Utilizando la vista del ejercicio 12 visualiza la media del dinero ingresado en cadacuenta. */

/*Calcular la media total de todos las medias de ingresos por cuenta*//*Calcular la media total de todos las medias de ingresos por cuenta*/

--1. Base de datos. SQL. Procedimientos almacenados.--2. Sobre la base de datos de Cuentas bancarias./*3. Para todos los ejercicios, adem�s de hacer el procedimiento almacenado solicitado,/*3. Para todos los ejercicios, adem�s de hacer el procedimiento almacenado solicitado,deber�n aparecer las instrucciones necesarias para probar el procedimiento, tantasveces como casos posibles haya.*/
/*1. Haz un procedimiento que liste los datos de todos los clientes y los n�meros de sus/*1. Haz un procedimiento que liste los datos de todos los clientes y los n�meros de suscuentas ordenados por nombre de los clientes.*/--2. Haz un procedimiento igual al anterior pero de todos los clientes mayores de 20 A�os.


/*3. Igual al anterior pero pas�ndole la edad por par�metro de entrada y que visualice los/*3. Igual al anterior pero pas�ndole la edad por par�metro de entrada y que visualice losclientes mayores de la edad pasada por par�metro.*/


/*4. Haz un procedimiento que visualice la cantidad de clientes con edad mayor que un/*4. Haz un procedimiento que visualice la cantidad de clientes con edad mayor que unvalor que pasamos por par�metro.*/
--5. Igual al anterior pero devolveremos el resultado en un par�metro de salida.


/*6. Igual al anterior pero si el par�metro de entrada pasado es menor de 18 mostraremos/*6. Igual al anterior pero si el par�metro de entrada pasado es menor de 18 mostraremosmensaje no se permite menor de 18 y en otro par�metro de salida devolveremos 0 ; 1si el valor pasado es mayor o igual a 18 */



/*Haz un procedimiento almacenado que pas�ndole como par�metro la direcci�n de una sucursal nos visualice los nombres de los clientes propietarios, /*Haz un procedimiento almacenado que pas�ndole como par�metro la direcci�n de una sucursal nos visualice los nombres de los clientes propietarios, numero de la cuenta de las cuentas que tienen saldo negativo de la sucursal indicada.*/
/*8. Al procedimiento anterior a��dele par�metros de salida de modo que si la sucursal/*8. Al procedimiento anterior a��dele par�metros de salida de modo que si la sucursalpasado por par�metro no existe visualice en el select �no existe sucursal� y en elpar�metro de salida el valor -1 y si la sucursalexiste en el par�metro de salida tendr�el valor 0.*/



/*9. A�ade otro par�metro de salida con la cantidad de cuentas de dicha sucursal, si la/*9. A�ade otro par�metro de salida con la cantidad de cuentas de dicha sucursal, si lasucursal no existe pondremos en este par�metro el valor -1.*/
--IF NOT EXISTS(SELECT Direccion FROM SUCURSAL WHERE Direccion = @direccion)--IF @direccion NOT IN (SELECT Direccion FROM SUCURSAL)



--Crea un funci�n que devuelva la cantidad de clientes que hay.


/*Crea una funci�n que visualice todos los datos de todos los clientes de edad mayor de/*Crea una funci�n que visualice todos los datos de todos los clientes de edad mayor deuna edad introducida por par�metro. Hacerlo de dos formas.*/


/*Igual al anterior pero si la edad es menor de 16 visualizar no permitido clientes/*Igual al anterior pero si la edad es menor de 16 visualizar no permitido clientesmenores de 16.*/
-1, '01-01-1900'


--Otro modo sin insertar




--4. Crea una funci�n que devuelva el nombre del cliente cuyo dni pasamos por par�metro.




-------------- escalar ----------



/*5. Crea una funci�n que devuelva el nombre, edad y fecha de nacimiento del cliente que/*5. Crea una funci�n que devuelva el nombre, edad y fecha de nacimiento del cliente quele pasamos su dni por par�metro de entrada.*/


------- Otra forma

/*6. Crea una funci�n que devuelva los datos de los clientes que cumplen a�os en el mes/*6. Crea una funci�n que devuelva los datos de los clientes que cumplen a�os en el mesde la fecha que pasamos por par�metro.*/

--Otro modo


/*7. Igual al anterior pero si la fecha que pasamos por par�metro es mayor de �01-01-2010�/*7. Igual al anterior pero si la fecha que pasamos por par�metro es mayor de �01-01-2010�devuelva �fecha incorrecta�.*/

/*8. Haz una funci�n que recibe un car�cter, si este es null que devuelva * y en caso/*8. Haz una funci�n que recibe un car�cter, si este es null que devuelva * y en casocontrario el mismo valor que ha recibido.*/
-------------------------------
/*9. Visualiza todos los registros de la tabla cuenta y en estado si tiene valor null/*9. Visualiza todos los registros de la tabla cuenta y en estado si tiene valor nullvisualizaremos * utilizando la funci�n del ejercicio anterior.*/
/* 10. Haz una funci�n que devuelva el sumatorio de todos los importes de un concepto de/* 10. Haz una funci�n que devuelva el sumatorio de todos los importes de un concepto delos movimientos que hay en la tabla apunte de una cuenta que pasamos su ccc por par�metrode entrada y tambi�n pasaremos el concepto. */





/* 11. Haz una funci�n que devuelva todos los datos de las cuentas y adem�s el total de los/* 11. Haz una funci�n que devuelva todos los datos de las cuentas y adem�s el total de losimportes de los movimientos de ingreso por un lado y de reintegro en otra columna. Utilizandola funci�n anterior. */



--Otro modo



/*12. Hacer un procedimiento almacenado que actualice el saldo de la cuenta que pasamos/*12. Hacer un procedimiento almacenado que actualice el saldo de la cuenta que pasamospor par�metro de entrada , el saldo lo obtenemos con el c�lculo de los movimientos que tieneen la tabla apunte utilizando la funci�n del ejercicio 10.*/

/*13. Hacer una funci�n que devuelva la cadena correcto o incorrecto en funci�n si el saldo/*13. Hacer una funci�n que devuelva la cadena correcto o incorrecto en funci�n si el saldocoincide con el que corresponder�a con los movimientos de la tabla apunte, de la ccc quepasamos por par�metro. Utilizando las funciones anteriores.*/
/*14. Hacer una funci�n que devuelva todos los datos de las cuentas que no coincida su/*14. Hacer una funci�n que devuelva todos los datos de las cuentas que no coincida susaldo con el sumatorio de sus importes de integro menos las de reintegro.*/
/*15. Haz una funci�n que devuelva todos los datos de la sucursal a la que corresponda la/*15. Haz una funci�n que devuelva todos los datos de la sucursal a la que corresponda lacuenta indicada por par�metro de entrada. Si dicha cuenta no existe indicar�cuentainexistente�*/
/*16. Haz una funci�n que devuelva la direcci�n de la sucursal a la que corresponda la/*16. Haz una funci�n que devuelva la direcci�n de la sucursal a la que corresponda lacuenta indicada por par�metro de entrada. Si dicha cuenta no existe indicar�cuentainexistente�.*/





/* 17. Haz una funci�n que devuelva todas las direcciones de las sucursales que tengan m�s/* 17. Haz una funci�n que devuelva todas las direcciones de las sucursales que tengan m�sde X cuentas. El valor de X lo pasaremos por par�metro de entrada. */


/* 18. Haz una funci�n que devuelva cu�ntas sucursales tienen m�s de X cuentas. El valor de/* 18. Haz una funci�n que devuelva cu�ntas sucursales tienen m�s de X cuentas. El valor deX lo pasaremos por par�metro de entrada. */


/*19. Haz una funci�n que devuelva el n�mero de cuenta, saldo, estado, cantidad de/*19. Haz una funci�n que devuelva el n�mero de cuenta, saldo, estado, cantidad demovimientos de integro, cantidad de movimientos de reintegros, direcci�n de la sucursal a laque pertenece la cuenta, de todas las cuentas. */





-------------------------------------------------------------











-- Trigger Cuentas Bancarias/*1. Crear un trigger que no permita borrar ning�n registro de la tabla apunte. Hacerlo tipo for y/*1. Crear un trigger que no permita borrar ning�n registro de la tabla apunte. Hacerlo tipo for ytipo Instead off.*/--TIPO FOR




--TIPO INSTEAD OF

/*2. Crear un disparador que no permitir� realizar ning�n movimiento de reintegro sobre cuentas/*2. Crear un disparador que no permitir� realizar ning�n movimiento de reintegro sobre cuentasque est�n bloqueadas.*/


-- tipo instead of






/*3. Hacer un trigger para la inserci�n en la tabla Apunte de modo que en funci�n del tipo de/*3. Hacer un trigger para la inserci�n en la tabla Apunte de modo que en funci�n del tipo deconcepto actualizar el saldo en la tabla cuenta correspondiente.*/






--reset--
--instead of
/*4. Igual que el anterior pero para la modificaci�n y el borrado de un apunte.*//*4. Igual que el anterior pero para la modificaci�n y el borrado de un apunte.*/




--Sheila
--Trigger borrado





/*5. Crear un desencadenador que cada vez que eliminemos un registro de la tabla apunte lo/*5. Crear un desencadenador que cada vez que eliminemos un registro de la tabla apunte loa�adiremos a una tabla llamada Apuntes_Borrados. Esta tabla la tienes que crearpreviamente y los campos deber�n ser iguales a la tabla apunte.*/










/*6. Crear un trigger que no permita ning�n reintegro a ning�n cliente que sea menor de edad./*6. Crear un trigger que no permita ning�n reintegro a ning�n cliente que sea menor de edad.Para la inserci�n y modificaci�n de apunte. Hacerlo tipo for y tipo instead of y que funcionepara varios registros.*/
--TIPO INSERCION












/*7. Crear un trigger que ponga la cuenta al estado bloqueado si despu�s de un reintegro de una/*7. Crear un trigger que ponga la cuenta al estado bloqueado si despu�s de un reintegro de unacuenta se queda con saldo negativo. Para insertar y para modificar. Hacerlo tipo for y tipoinstead of y que funcione para varios registros.*/









--instead of


/*8. Crear un trigger que no permitir� un reintegro de una cuenta que despu�s de ese reintegro se/*8. Crear un trigger que no permitir� un reintegro de una cuenta que despu�s de ese reintegro sequede con saldo negativo . Para insertar y para modificar.*/



--guiermo--
--TIPO INSERCI�N--if exists(select ref from inserted inner join cuenta on cuenta.ccc=inserted.ccc where concepto='R' and saldo<0) Es lo mismo
----------------------------------------------------------------

--TIPO MODIFICACI�N



/*9. Hacer un trigger que al modificar la fecha de un apunte no permita que sea una fecha/*9. Hacer un trigger que al modificar la fecha de un apunte no permita que sea una fechaposterior al d�a de hoy. Hacerlo tipo for y tipo instead of. Si se insertan varios registros en eltipo instead of que se inserten solo los que si cumplen la condici�n.*/






-- Tipo for




-- Tipo instead of

/*10. Hacer un trigger que al modificar la fecha de un apunte no permita que sea una fecha/*10. Hacer un trigger que al modificar la fecha de un apunte no permita que sea una fechaposterior a la fecha que ten�a antes. Hacerlo tipo for y tipo instead of. Si se insertan variosregistros en el tipo instead of si alguno no cumple la condici�n no se insertar� ninguno.*/




--instead of




/*11. Crear un trigger que al insertar un cliente le asigne la edad (los a�os que cumplir�a en el a�o/*11. Crear un trigger que al insertar un cliente le asigne la edad (los a�os que cumplir�a en el a�oactual) calcul�ndola con la fecha de nacimiento.*/



-- Tipo instead of


/*12. Igual al anterior para la modificaci�n de la fecha de nacimiento.*//*12. Igual al anterior para la modificaci�n de la fecha de nacimiento.*/



--Tipo instead of


/*13. Crear un trigger que no permita eliminar ning�n registro de la tabla cliente si su edad es/*13. Crear un trigger que no permita eliminar ning�n registro de la tabla cliente si su edad esmenor de 50 a�os. Si eliminamos varios registros y uno cumple la condici�n y otro no soloeliminar los que cumplan la condici�n.*/
---instead of

/*14. Crear un trigger que al insertar un apunte ponga la fecha al d�a de hoy. (aunque en los datos/*14. Crear un trigger que al insertar un apunte ponga la fecha al d�a de hoy. (aunque en los datosa insertar o modificar sea otra fecha), que funcione para varios registros.*/




/*15. Crear un trigger que no permita asignar un cliente menor de edad a una cuenta en la cual no /*15. Crear un trigger que no permita asignar un cliente menor de edad a una cuenta en la cual no tenga ya asignado una persona mayor de edad. (o sea si la cuenta es de un menor de edad tambi�n tiene que tener otro propietario que sea mayor de edad, esto lo vemos en la tabla cuenta_cliente). Hacerlo para la inserci�n de la tabla cuentacliente*/



/*16. Vamos a hacer un trigger para realizar registro de log. Crea una tabla igual que la de las/*16. Vamos a hacer un trigger para realizar registro de log. Crea una tabla igual que la de lassucursales, y le a�adiremos tres campos m�s, uno de tipo datetime en la que pondremos lafecha y hora actuales , otro de tipo varchar(200) en el que escribiremos el usuario actualpara ello usaremos la variable del sistema system_user y otro char(1) en el que escribiremosuna I si se ha insertado, una A si se ha actualizado y una B si se ha borrado . Cada vez quehagamos una operaci�n (inserci�n, actualizaci�n o borrado) sobre esa tabla copiaremos elregistro en cuesti�n en la tabla nueva y le a�adiremos los valores correspondientes a laoperaci�n realizada.*/

--PARA BORRADO





-- PARA ACTUALIZAR



--PARA INSERTAR




---- EN UN SOLO TRIGGER







/*17. Crear un trigger de modo que los clientes s�lo pueden operar con las cuentas de las que son /*17. Crear un trigger de modo que los clientes s�lo pueden operar con las cuentas de las que son titulares y s�lo pueden operar seg�n sus privilegios, siempre podremos ingresar dinero pero solo sacar dinero si tenemos el privilegio R sobre esa cuenta. (Para poder hacer un reintegro el dni de la tabla apunte deber� tener privilegio de R sobre la cuenta de la que saco dinero) Hacerlo para insertar y para la modificaci�n del campo concepto.*/



--uno no permitido y otro si pero no hace ninguno-- dos si permitidos
--dos permitidos /*18. Igual al anterior pero para la modificaci�n del dni de la tabla apunte.*//*18. Igual al anterior pero para la modificaci�n del dni de la tabla apunte.*/


--19. Igual al anterior para la modificaci�n de los campos dni o la cuenta o el concepto de la tabla apunte.



/*20. Crear un trigger que al modificar el importe de apunte no permita que ese importe sea menor/*20. Crear un trigger que al modificar el importe de apunte no permita que ese importe sea menorque el importe anterior que ten�amos.*/

/*21. Crear un trigger que al modificar el concepto de apunte no permita pasar de I a R pero si lo /*21. Crear un trigger que al modificar el concepto de apunte no permita pasar de I a R pero si lo contrario.*/



/*22. Si inserto un cliente y la edad no coincide con la que le corresponde por su fecha de /*22. Si inserto un cliente y la edad no coincide con la que le corresponde por su fecha de nacimiento no permitir insertarlos. Que funcione para varios registros, insertar solo aquellos que cumplan la condici�n.*/



/*23. Hacer un trigger que si modificamos la edad de un cliente y no coincide con la edad /*23. Hacer un trigger que si modificamos la edad de un cliente y no coincide con la edad correspondiente por su fecha de nacimiento no permitirlo*/


--------------------------------------------------------------------------



--Si para varios registro uno no cumple la condicion no hace ninguno debido al for



/*24. Hacer un trigger para la modificaci�n del campo privilegio , no permitir cambiar de I a R. /*24. Hacer un trigger para la modificaci�n del campo privilegio , no permitir cambiar de I a R. Para varios registros si alguno no cumple la condici�n ese no lo modificamos pero los dem�s si.*//*25. No permitir borrar dos apuntes de una vez de la misma cuenta.*//*25. No permitir borrar dos apuntes de una vez de la misma cuenta.*/

/*26. Al insertar en cuenta_cliente no permitir privilegio de R si es menor de edad*//*26. Al insertar en cuenta_cliente no permitir privilegio de R si es menor de edad*/

