Algoritmo numero_primo
	Definir num,i Como Entero
	Definir primo Como Logico
	i <- 2
	primo <- true
	Escribir 'Introduce un numero para saber si es primo'
	Leer numero
	Mientras (primo Y i<num) Hacer
		primo <- (num MOD i)<>0
		i <- i+1
	FinMientras
	Si primo Entonces
		Escribir 'Si es primo'
	SiNo
		Escribir 'No es primo'
	FinSi
FinAlgoritmo
