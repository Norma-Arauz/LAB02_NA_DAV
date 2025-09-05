//Ejercicio 7: Uso de la expresion when

/*
    La expresion when nos permite evaluar diferentes rangos
    sin necesidad de un if anidado por lo que es mas facil de leer.
    Esta es igual a la expresion switch de C y el case en algoritmo
 */
val ageM = 60
val ageMN = 40
val nomb ="maria"
val variable: Any = 10.0

fun main(args: Array<String>){

    println("when 1")
    when {
        ageM < 18 -> println("Menor de edad")
        ageM > 60 -> println("Mayor de edad")
        else -> println("Tercera de edad")
    }

    println("when 2")
    when (ageMN) {
        in 1..17 -> println("Menor de edad")
        in 18..59 -> println("Mayor de edad")
        in 59..100 -> println("Tercera de edad")
        else -> println("Incorrecto")
    }

    println("when 3")
    when (nomb.uppercase()) {
        "juan".uppercase(),"Alejandro".uppercase() -> println("hombre")
        "maria".uppercase() -> println("mujer")
        else -> println("No esta en la lista")
    }

    println("when 4")
    when (variable) {
        /*la palabra reservada is es un operador que se utiliza
          para la comprobación de tipos en tiempo de ejecución.
          Determina si un objeto cumple con un tipo determinado.
         */
        is Int -> println("Entero")
        is String -> println("Cadena")
        is Double -> println("double")
    }
}