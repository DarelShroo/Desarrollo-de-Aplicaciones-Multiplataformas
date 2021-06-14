Algoritmo BucleNumeros
	Escribir 'Escribe un numero necesariamente menor que le siguiente'
	Leer i
	Escribir 'Escribe un numero'
	Leer j
	Escribir 'Pares'
	Para i<-i Hasta j Hacer
		Si (i MOD 2)==0 Entonces
			Escribir i,' par'
		SiNo
			Escribir i,' impar '
		FinSi
	FinPara
FinAlgoritmo
