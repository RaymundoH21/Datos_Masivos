//RAYMUNDO HIRALES LAZARENO - 17212339
//PAULA ANDREA RAMOS VERDIN - 18210721
//Practica 2 - 05/03/22

//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
printf("Ingrese el diametro del circulo: ")
var D =

printf("El radio del circulo es: ")
val R = (D/2)

//2. Desarrollar un algoritmo en scala que me diga si un número es primo

printf("Ingrese numero que deseas revisar: ")
var num =

    if(num%2 == 0){
        println(s"$num es par")
    }else{
        println(s"$num es impar")
    } 

//3. Dada la variable  var bird = "tweet", utiliza interpolación de strings para imprimir "Estoy ecribiendo un tweet"

var im = "Estoy"
var writing = "escribiendo"
var a = "un"
var bird = "tweet"
var sentence = s"${im} ${writing} ${a} ${bird}"
println(sentence)

//4. Dada la variable var mensaje = "Hola Luke yo soy tu padre!" utiliza slice para extraer la secuencia "Luke"

var mensaje = "Hola Luke yo soy tu padre!"
mensaje slice  (5,9)

//5. Cúal es la diferencia entre value (val) y una variable (var) en scala?

//R:
// Values (val) es algo inmutable que no quiero que cambie.
// Values (var) es mutable y se puede modificar sin problema.

//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el número 3.1416
val tupla = (2,4,5,1,2,3,3.1416,23)
tupla._7