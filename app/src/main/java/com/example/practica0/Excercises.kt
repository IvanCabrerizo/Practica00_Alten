package com.example.practica0

/**
 * Practica 0, Formacion ALTEN
 *
 * @author Ivan Cabrerizo
 */

fun main() {

    tarea1(9229)
    tarea2Uno(10, 34, 5, 1, 20, 34)
    tarea2Dos(10, 34, 5, 1, 20, 34)
    tarea2Tres(10, 34, 5, 1, 2, 34)
    tarea3("Paco", "Juan", "Pedro", "Supercalifragilisticoespialidoso")
    tarea4(10)
    tarea5("Paco23.")
    tarea6("Ivan")
    tarea7(p1 = listOf("Piedra", "Piedra", "Papel"), p2 = listOf("Papel", "Tijera", "Piedra"))
}

/**
 * Funcion que comprueba si el numero recibido es capicua
 *
 * @author Ivan Cabrerizo
 */
fun tarea1(num: Int) {
    val numText = num.toString()
    val sizeText = numText.length
    var boolean = true
    for (i in 0 until sizeText / 2) {
        if (numText[i] != numText[sizeText - i - 1]) {
            boolean = false
        }
    }

    if (boolean) {
        println("$num es un numero capicua")
    } else {
        println("$num no es un numero capicua")
    }
}

/**
 * Funcion que obtiene la media de una lista de numeros enteros
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Uno(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    var media = 0

    for (i in listNum) {
        media += i
    }
    media /= listNum.size
    println("La media de ($num1, $num2, $num3, $num4, $num5, $num6) es: $media")
}

/**
 * Funcion que obtiene la moda de una lista de numeros enteros
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Dos(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    //Moda:
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    var actualNum = 0
    var actualCount = 0
    var saveCount = 0
    var moda = 0

    for (i in listNum) {
        actualNum = i

        for (a in listNum) {
            if (actualNum == a) {
                actualCount++
            }
        }

        if (actualCount >= saveCount) {
            moda = actualNum
            saveCount = actualCount
        }
        actualCount = 0
    }

    println("La moda es: $moda")
}

/**
 * Funcion que obtiene la mediana de una lista de numeros enteros,
 * con difereciacion entre par e impar segun se le pase una cantidad,
 * par o impar de numeros enteros.
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Tres(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    //La mediana:
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    var mediana = 0
    val orderList = listNum.sortedDescending()

    if (orderList.size % 2 == 0) {
        val m1 = orderList.size / 2
        val m2 = (orderList.size / 2) + 1
        mediana = (orderList[m1] + orderList[m2]) / 2
        println("La mediana es : $mediana")
    } else {
        val medio = (orderList.size - 1) / 2
        mediana = orderList[medio + 1]
        println("La mediana es : $mediana")
    }
}

/**
 * Funcion que determina la cadena de caracteres mas larga,
 * de una lista de cadenas.
 *
 * @author Ivan Cabrerizo
 */
fun tarea3(s1: String, s2: String, s3: String, s4: String) {
    val listString = listOf<String>(s1, s2, s3, s4)
    var mayor = 0
    var posicion = 0

    for (i in listString.indices) {
        if (listString[i].length > mayor) {
            mayor = listString[i].length
            posicion = i
        }
    }

    println("La cadena mas largas es: ${listString[posicion]}")
}

/**
 * Funcion que realiza la sucesion de fibonacci
 *
 * @author Ivan Cabrerizo
 */
fun tarea4(num: Int) {
    var secuencia = mutableListOf<Int>(0, 1)

    for (i in 0 until num) {
        val fibonacci = secuencia[i] + secuencia[i + 1]
        secuencia.add(fibonacci)
    }

    println(secuencia)
}

/**
 * Funcion que transforma la cadena recibida a lenguaje hacker
 *
 * @author Ivan Cabrerizo
 */
fun tarea5(encrypt: String) {
    val hackerKey = mapOf(
        "a" to "4",
        "b" to "I3",
        "c" to "[",
        "d" to ")",
        "e" to "3",
        "f" to "|=",
        "g" to "&",
        "h" to "#",
        "i" to "1",
        "j" to ",_|",
        "k" to ">|",
        "l" to "1",
        "k" to ">|",
        "m" to "/\\/\\",
        "n" to "^/",
        "o" to "0",
        "p" to "|*",
        "q" to "(_,)",
        "r" to "I2",
        "s" to "5",
        "t" to "7",
        "u" to "(_)",
        "v" to "\\/",
        "w" to "\\/\\/",
        "x" to "><",
        "x" to "j",
        "y" to "2",
        "1" to "L",
        "2" to "R",
        "3" to "E",
        "4" to "A",
        "5" to "S",
        "6" to "b",
        "7" to "T",
        "8" to "B",
        "9" to "g",
        "0" to "o")

    var wordEncrypted = ""

    for(i in encrypt){
        val translate  = hackerKey[i.lowercase()]
        wordEncrypted += translate ?: ""
    }

    println("La palabra secreta es: $wordEncrypted")
}

/**
 * Funcion que transforma una cadena en su version espejo
 *
 * @author Ivan Cabrerizo
 */
fun tarea6(word: String){
    println("La palabra modificada seria: $word${word.dropLast(1).reversed()}")
}

/**
 * Funcion que transforma una cadena en su version espejo
 *
 * @author Ivan Cabrerizo
 */
fun tarea7(p1: List<String>, p2: List<String>){
    for(i in p1.indices){
        when {
            p1[i] == "Piedra" && p2[i] == "Papel" -> println("Hola")
        }
    }
}