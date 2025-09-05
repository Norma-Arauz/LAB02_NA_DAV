//Ejercicio 4: Practica de redondeo y formato de salida

/*Al mostrar resultados numericos decimales en pantalla
  es importante darle un formato o una estructura especifica
  de como deseamos que se observe en pantalla para evitar
  que los decimales sean infinitos o sean dificiles de leer
  debido a su longitud por lo que en este ejercicio
  practicamos los distintos metodos para modificar el formato
 */

//Librerias requeridas para aplicar formato
import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>){
    val resul = 35.9 /4.0

    //MEtodos para redondear un numero
    println("Numero sin redondear: $resul")
    //Redondeo opcion 1
    println("Opcion 1: " + Math.round(resul))

    //Redondeo  opcion 2
    println("Opcion 2: " +Math.ceil(resul))

    //Redondeo opcion 3
    println("opcion 3: " + Math.floor(resul))

    //Dar formato
    println("Formato de numero")
    val formato = DecimalFormat("#.##")

    println(formato.format(resul))

    formato.roundingMode = RoundingMode.CEILING
}