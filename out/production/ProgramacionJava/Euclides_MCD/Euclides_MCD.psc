Algoritmo Euclides_MCD
	Escribir 'Introduzca un numero'
	Leer primerNumero
	Escribir 'Introduzca otro numero'
	Leer segundoNumero
	Mientras (primerNumero>0) Hacer
		resto <- primerNumero
		primerNumero <- segundoNumero MOD primerNumero
		segundoNumero <- resto
	FinMientras
	Escribir 'El MCD de los numeros introducidos es ',segundoNumero
FinAlgoritmo
