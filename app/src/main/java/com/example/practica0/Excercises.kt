package com.example.practica0

/**
 * Practica 0, Formacion ALTEN
 *
 * @author Ivan Cabrerizo
 */

fun main() {

    //Aqui coloco las instancias funciones
    tarea1(9229)
    tarea2Uno(10, 34, 5, 1, 20, 34)
    tarea2Dos(10, 34, 5, 1, 20, 34)
    tarea2Tres(10, 34, 5, 1, 2, 34)
    tarea3("Paco", "Juan", "Pedro", "Supercalifragilisticoespialidoso")
    tarea4(10)
    tarea5("Paco23.")
    tarea6("Ivan")
    tarea7(
        p1 = listOf("lagarto", "piedra", "lagarto", "spock"),
        p2 = listOf("papel", "spock", "piedra", "lagarto")
    )
    tarea8()
    tarea9(playList = listOf("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"))
    tarea10(20)
}

/**
 * Funcion que comprueba si el numero recibido es capicua
 *
 * @param num Es el numero Int que se va comprobar
 *
 * @author Ivan Cabrerizo
 */
fun tarea1(num: Int) {
    //numText es el numero recibido por paramtro pasado a String
    val numText = num.toString()
    //sizeText es el tamaño de del numero introducido por paramtro
    val sizeText = numText.length
    //Una variable boolean para controlar el resultado final
    var boolean = true
    //Un bucle for para recorrer el propio numero y comprobar si es igual el principio con el final
    // dividiendo en dos mitades
    for (i in 0 until sizeText / 2) {
        if (numText[i] != numText[sizeText - i - 1]) {
            boolean = false
        }
    }
    //Una if Else que controla si el booleano es o no true para saber si es capicua e imprimir el resultado
    if (boolean) {
        println("$num es un numero capicua")
    } else {
        println("$num no es un numero capicua")
    }
}

/**
 * Funcion que obtiene la media de una lista de numeros enteros
 *
 * @param num1 Numero entero para la lista de Int
 * @param num2 Numero entero para la lista de Int
 * @param num3 Numero entero para la lista de Int
 * @param num4 Numero entero para la lista de Int
 * @param num5 Numero entero para la lista de Int
 * @param num6 Numero entero para la lista de Int
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Uno(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    //listNum es la lista de numeros Int con los numeros pasados por parametros
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    //media es la variable donde se almacenara la suma de los numeros de la lista
    var media = 0
    //Un for que recorre la listNum y va sumando el contenido en la variable media
    for (i in listNum) {
        media += i
    }
    //Aqui se divide el total obtenido en el For y se divide entre el tamaño de listNum
    media /= listNum.size
    //Aqui se imprime el resultado final
    println("La media de ($num1, $num2, $num3, $num4, $num5, $num6) es: $media")
}

/**
 * Funcion que obtiene la moda de una lista de numeros enteros
 *
 * @param num1 Numero entero para la lista de Int
 * @param num2 Numero entero para la lista de Int
 * @param num3 Numero entero para la lista de Int
 * @param num4 Numero entero para la lista de Int
 * @param num5 Numero entero para la lista de Int
 * @param num6 Numero entero para la lista de Int
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Dos(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    //listNum es la lista de numeros Int con los numeros pasados por parametros
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    //actualNum representa el numero actual en el For
    var actualNum = 0
    //actualCount es un contador temoral para el almacenar el dato del segundo For
    var actualCount = 0
    //saveCount es el contador en el que se almacena el dato si es mayor al ya almacenado
    var saveCount = 0
    //la variable que almacena el resultado obtenido
    var moda = 0
    //Un bucle for que recorre listNum y va almacenado por vuelta el valor en actualNum
    for (i in listNum) {
        actualNum = i
        //Un for que recorre de nuevo la lista y va comparando el actualNum con el resto de la lista
        // y lo almacena en actualCount
        for (a in listNum) {
            if (actualNum == a) {
                actualCount++
            }
        }
        //Un if que comprueba si actualCount es mayor o igual a saveCount y en caso afirmativo guardarlo
        //en moda y en actualcount para compararlo en el anterior for en la proxima vuelta
        if (actualCount >= saveCount) {
            moda = actualNum
            saveCount = actualCount
        }
        //Reinicio a 0 del contador para asi poder usarlo de nuevo en cada vuekta del for
        actualCount = 0
    }
    //Aqui se imprime la variable moda con el resultado final
    println("La moda es: $moda")
}

/**
 * Funcion que obtiene la mediana de una lista de numeros enteros,
 * con difereciacion entre par e impar segun se le pase una cantidad,
 * par o impar de numeros enteros.
 *
 * @param num1 Numero entero para la lista de Int
 * @param num2 Numero entero para la lista de Int
 * @param num3 Numero entero para la lista de Int
 * @param num4 Numero entero para la lista de Int
 * @param num5 Numero entero para la lista de Int
 * @param num6 Numero entero para la lista de Int
 *
 * @author Ivan Cabrerizo
 */
fun tarea2Tres(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int, num6: Int) {
    //listNum es la lista de numeros Int con los numeros pasados por parametros
    val listNum = listOf(num1, num2, num3, num4, num5, num6)
    //mediana es la variable en la cual se almacenara el resultado
    var mediana = 0
    //orderList es la lista de numeros anteriormente creada pero ordenada de manera descendente
    val orderList = listNum.sortedDescending()
    //Un if else el cual comprueba por un lado si el tamaño de la lista es par o impar puesto que
    //la obtencion de la mediana difiere segun sea par o impar
    if (orderList.size % 2 == 0) {
        //m1 es el valor que esta situado al medio de listNum
        val m1 = orderList.size / 2
        //m2 es el valor que esta situado al medio + 1 de listNum
        val m2 = (orderList.size / 2) + 1
        //Aqui simplemente se hace la media de ambos para asi obtener la mediana
        mediana = (orderList[m1] + orderList[m2]) / 2
        //Aqui se imprime el resultado
        println("La mediana es : $mediana")
    } else {
        //medio es el valor de dividir el total - 1 entre dos para saber la mitad par
        val medio = (orderList.size - 1) / 2
        //Aqui simplemente se le suma uno a medio para asi obtener la mediana real
        mediana = orderList[medio + 1]
        //Aqui se imprime el resultado
        println("La mediana es : $mediana")
    }
}

/**
 * Funcion que determina la cadena de caracteres mas larga,
 * de una lista de cadenas.
 *
 * @param s1 Una cadena para realizar luego la lista de cadenas
 * @param s2 Una cadena para realizar luego la lista de cadenas
 * @param s3 Una cadena para realizar luego la lista de cadenas
 * @param s4 Una cadena para realizar luego la lista de cadenas
 *
 * @author Ivan Cabrerizo
 */
fun tarea3(s1: String, s2: String, s3: String, s4: String) {
    //listString es una lista de String con los parametros recibidos
    val listString = listOf<String>(s1, s2, s3, s4)
    //mayor es donde se almacenara el tamaño de la cadena mas larga
    var mayor = 0
    //posicion es una variable para guardar la posicion del String en listString
    var posicion = 0
    //Un for que recorre la listString y mediante un if va quedandose con la de mayor tamaño
    for (i in listString.indices) {
        if (listString[i].length > mayor) {
            mayor = listString[i].length
            posicion = i
        }
    }
    //Aqui se imprime la String mas larga
    println("La cadena mas largas es: ${listString[posicion]}")
}

/**
 * Funcion que realiza la sucesion de fibonacci
 *
 * @param num Es el numer Int que limitara la cantidad de la sucesion
 *
 * @author Ivan Cabrerizo
 */
fun tarea4(num: Int) {
    //secuencia es la lista que empieza en 0, 1 en la que se almacenara la sucesion
    val secuencia = mutableListOf<Int>(0, 1)
    //Un for el cual recocrre de 0 hasta el numero dado y va sumando los numeros y añadiendolos a secuencia
    for (i in 0 until num) {
        val fibonacci = secuencia[i] + secuencia[i + 1]
        secuencia.add(fibonacci)
    }
    //Aqui se imprimen los datos
    println(secuencia)
}

/**
 * Funcion que transforma la cadena recibida a lenguaje hacker
 *
 * @param word Es la palabra recibida para traducir
 *
 * @author Ivan Cabrerizo
 */
fun tarea5(word: String) {
    //hackerKey es un map que almacena las equivalencias entre el abecedario y numeros normales
    //con el lenguaje Let hacker
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
        "0" to "o"
    )
    //wordEncrypted es la variable que almacenara la palabra traducida
    var wordEncrypted = ""
    //Un for que recorre la palabra por caracter
    for (i in word) {
        //translate es la variable que se encarga de intercambiar el caracter actual en el for
        //por el correspondiente en hackerKey
        val translate = hackerKey[i.lowercase()]
        //Aqui vamos sumando el caracter traducido a la variable que almacena el resultado final
        wordEncrypted += translate ?: ""
    }
    //Aqui imprimimos el resultado final
    println("La palabra secreta es: $wordEncrypted")
}

/**
 * Funcion que transforma una cadena en su version espejo
 *
 * @param word Es la palabra que se va transformar
 *
 * @author Ivan Cabrerizo
 */
fun tarea6(word: String) {
    //Aqui imprimos el resultado al cual aplicando dropLast(1) retiramos la ultima y aplicando reversed()
    //obtenemos la palabra con efecto espejo
    println("La palabra modificada seria: $word${word.dropLast(1).reversed()}")
}

/**
 * Funcion que analiza dos listas de jugadas de piedra, papel, tijera...
 * y te da el ganador por ronda y luego la puntuacion final.
 *
 * @param p1 Es la lista de jugadas en String del jugador 1
 * @param p2 Es la lista de jugadas en String del jugador 2
 * @author Ivan Cabrerizo
 */
fun tarea7(p1: List<String>, p2: List<String>) {
    //scoreP1 almacena la puntuacion del jugador 1
    var scoreP1 = 0
    //scoreP1 almacena la puntuacion del jugador 2
    var scoreP2 = 0
    //Un for que recorre la cantidad de jugadas
    for (i in p1.indices) {
        //Un When que mediante condiciones comprueba cada caso de juego posible comparando las jugadas
        //y en cada caso imprime el resultado de la jugada
        when {
            p1[i] == p2[i] -> println("Ambos jugadores empataron")
            p1[i] == "piedra" && (p2[i] == "tijera" || p2[i] == "lagarto") -> {
                scoreP1++
                println("Gana el jugador 1")
            }
            p1[i] == "papel" && (p2[i] == "piedra" || p2[i] == "spock") -> {
                scoreP1++
                println("Gana el jugador 1")
            }
            p1[i] == "tijera" && (p2[i] == "papel" || p2[i] == "lagarto") -> {
                scoreP1++
                println("Gana el jugador 1")
            }
            p1[i] == "lagarto" && (p2[i] == "papel" || p2[i] == "spock") -> {
                scoreP1++
                println("Gana el jugador 1")
            }
            p1[i] == "Spock" && (p2[i] == "piedra" || p2[i] == "tijera") -> {
                scoreP1++
                println("Gana el jugador 1")
            }
            else -> {
                scoreP2++
                println("Gana el jugador 2")
            }
        }
    }
    //Un if else if else, que se encarga de ver quien ha tenido mas puntos o si ha sido empate e imprimirlo
    if (scoreP1 > scoreP2) {
        println("\nEl ganador es el jugador 1 con $scoreP1 puntos ")
    } else if(scoreP1 < scoreP2){
        println("\nEl ganador es el jugador 2 con $scoreP2 puntos ")
    }
    else{
        println("Empate")
    }
}

/**
 * Funcion que sustituye numeros por palabras segun un criterio
 *
 * @author Ivan Cabrerizo
 */
fun tarea8() {
    //Un for que recorre del 1 al 100
    for (i in 1..100) {
        //Un when que segun el resto obtenido con 3 o 5 segun dependa te imprime una fras
        //o en caso contrario simplemente el numero
        when {
            i % 3 == 0 && i % 5 == 0 -> println("triplepremio")
            i % 3 == 0 -> println("triple")
            i % 5 == 0 -> println("premio")
            else -> println(i)
        }
    }
}

/**
 * Funcion que muestra el transcurso de un partido de tenis y quien gana
 *
 * @param playList Es una lista de String mediante P1 o P2 se indica el ganador de la ronda
 *
 * @author Ivan Cabrerizo
 */
fun tarea9(playList: List<String>) {
    //scoreList es un map que incluye la nomenclatura de los puntos
    val scoreList = mapOf(0 to "Love", 1 to "15", 2 to "30", 3 to "40")
    //p1Score y p2Score es la puntuacion de los jugadores
    var p1Score = 0
    var p2Score = 0
    //diferenciaP1 y difrenciaP2 es la variable que almacena la diferencia de puntos entre P1 y P2
    var diferenciaP1 = 0
    var diferenciaP2 = 0
    //Un for que recorre playList para asi poder trabajar con las jugadas
    for(i in playList){
        //Un when que simplemente va asignadno 1 mas si ha ganado en el contrador
        when(i){
            "P1" -> p1Score++
            "P2" -> p2Score++
        }
        //Aqui se opera con las diferencias para ir almacenandolas
        diferenciaP1 = p1Score - p2Score
        diferenciaP2 = p2Score - p1Score
        //Un when que es el que controla todos los posibles casos e imprime la puntuacion
        //o en caso de cumplir una condicion especifica imprime Deuce, ventaja etc..
        when{
            p1Score < 3 || p2Score < 3 ->println("${scoreList[p1Score]} - ${scoreList[p2Score]}")
            p1Score >= 3 && p2Score >= 3 && p1Score == p2Score -> println("Deuce")
            p1Score >= 4 && diferenciaP1 == 1 -> println("Ventaja P1")
            p2Score >= 4 && diferenciaP2 == 1 -> println("Ventaja P2")
            //Aqui en caso de ganar uno de los dos jugadores imprime que gana y un break para salir del when
            p1Score >= 4 && diferenciaP1 == 2 -> {
                println("Gana P1")
                break
            }
            p2Score >= 4 && diferenciaP2 == 2 -> {
                println("Gana P2")
                break
            }
        }
    }
}

/**
 * Funcion que realiza la puntuacion de un pequeño juego de mesa con cartas
 *
 * @param p Es el numero de puntos maximos que puede haber
 *
 * @author Ivan Cabrerizo
 */
fun tarea10(p: Int){
    //cards es una lista de eneteros que almacenara las cartas de puntos
    val cards = mutableListOf<Int>()
    //Un for que recorre del 1 al p indicado por parametro
    for (actualNum in 1..p) {
        //suma es la suma de todo el contenido de cards
        val suma = cards.sum()
        //Un if else que comprueba si la suma actual es menor o no que el resto de p
        if (actualNum + actualNum < p - suma) {
            //Aqui se añade a cards
            cards.add(actualNum)
        } else {
            //rest almacena el resto de p - suma
            val rest = p - suma
            //Aqui se añade a cards
            cards.add(rest)
            //Aqui se imprime el resultado final
            println(cards)
            //Esto cierra el bucl
            break
        }
    }
}