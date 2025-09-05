//Ejercicio 5: Uso de funciones

import java.math.BigDecimal
import java.util.Date

//Funcione principal
fun main(args: Array<String>){

    println("Funcion 1")
    mostrarFecha()

    println("Funcion 2")
    calcularImpuesto(BigDecimal("999"), BigDecimal("14"))

    println("Funcion 3")
    saludo()

    println("Funcion 4")
    descuento(500.0,10.0)
}

//Funcion 1: No recibe ni envia nada
fun mostrarFecha(){
    println("--------------------")
    println(Date())
    println("--------------------")
}

/*
    BigDecimal es una clase de la biblioteca estándar de Java
     que se utiliza para realizar cálculos precisos y manejar
     números decimales de tamaño teóricamente ilimitado
 */
//Funcion 2: Recibe dos parametros y no retorna nada
fun calcularImpuesto(valor: BigDecimal, impuesto: BigDecimal) {
    var resul = valor.divide(BigDecimal("100"))
    resul = resul.multiply(impuesto)

    println(resul)
}

//Funcion 3: No recibe parametro pero si retorna un dato
fun saludo(): String{

    return "Saludo soy una funcion que retorna un saludo"
}

//Funcion 4: Recibe parametros y retorna un valor
fun descuento(precio:Double, des:Double):Double{

    return precio- (precio * (des/100))
}
