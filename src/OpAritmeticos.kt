//Ejercicio 2: Practica de operadores aritmeticos


//Los operadores aritmeticos se usan para operaciones basicas
//Para incremento y decremento
fun main(array: Array<String>) {
    val resul1 = (35 -15 ) /5
    var resul2: Int = 25
    var resul3: Int = 3
    val num ="3"

    //Conversion de una String a un entero
    val resul4 = num.toInt() * 5

    resul2 /= 5
    resul2 *= 2
    resul3++

    //Las operaciones se pueden almacenar y mostrar a traves de una
    //Variable
    println(resul1)
    println(resul2)
    println(resul3)
    println(resul4)

    //Pero si son operaciones ya conocidas se pueden mostrar
    //directamente en la instruccion de salida a pantalla
    println("Suma: " + (5 + 8) + "  REsta: " + (4-3))
    println("Multiplicacion: " + (14 *6) + " Division: " + (10/2))

}