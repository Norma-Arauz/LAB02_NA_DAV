//Ejercicio 6: uso de la estructura de control If

val sesionIn = false
val age1 = 18
val age2 = 21
val credencialD = false


fun main (args: Array<String>) {
    if(sesionIn)
        println("bienvenido")
    else
        println("Inicia sesion")

    println("Segundo condicional")
    if(age1 <=18)
        println("Menor de edad")
    else
        println("Mayor de edad")

    //If anidado 
    println("Tercer condicional")
    if(age2 < 18)
        println("menor de edad")
    else if(age2 < 60 )
        println("Mayor de edad")
    else
        println("Tercera de edad")

    println("Cuarto condicional")
    if(age1 >= 60 || credencialD) {
        println("Descuento")
    }else{
        println("No aplica ")
    }

    //Condicional resumido en una linea
    println("condicional 5")
    println(if(age2 >= 18) "MAyor de edad" else "Menor de edad")
}