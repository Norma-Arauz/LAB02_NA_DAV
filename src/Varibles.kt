
//Ejercicio 1: practica de variables globales y locales

//Tipos de datos
//Variables globales no modificable
val edad: Int = 28 //Val no permite cambiar el valor una vez declarado
val num: Int = 1_000_000 //el _ ayuda a identificar la cantidad de seros
val number: Double = 10.5 //el sistema lee un numero con punto como si fuera un double
val fnumber: Float = 5.3f //Para definir un flotante debemos especificar la f al final
val letra = 'A' //cuando se usa un char hay que colocarlo entre comillas simples
val cadena = "Laboratorio dos"
val estado:Boolean = true

//Variable global modificable
var num1: Int = 0
var frase:String = ""

fun main(args: Array<String>) {

    num1 = 15
    frase = "Bienvenido al Lab02"

    println("Variables Globales No modificables")
    println(edad)
    println(num)
    println(number)
    println(fnumber)
    println(letra)
    println(cadena)
    println(estado)

    println("Variables Globales Modificables")
    println(num1)
    println(frase)

    //Funciones locales provadas en otra funcion
    locales()
}

fun locales()
{
    num1 = 15
    frase = "Bienvenido"
    println("Variables globales modificadas en otra funcion")
    println(num1)
    println(frase)

    //Variables Locales
    val numL = 5
    println(numL)
    val fl = "Hola a todos soy local"
    println(fl)
}