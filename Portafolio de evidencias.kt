fun main (){
    //verifyAge()
    //gradoEscolar()
    //triangulos()
    tipoDato("dddd")
}

fun verifyAge(){
    println("Ingresa edad y presiona enter (Ingrese solo numeros)")
    val age = readLine()?.toInt()

    /*if (age?.equals(18)!!){
        println("Ya eres mayor de edad\n")
    }
    else{
        println("Eres menor de edad")
    }*/

    if(age!!>18){
        println("Ya eres mayor de edad")
    }else if(age!! ==18){
        println("Acabas de cumplir la mayoria de edad")
    }else{
        println("Eres menor de edad")
    }
}

fun gradoEscolar(){
    println("Ingresa edad y presiona enter (Ingrese solo numeros)")
    val age = readLine()?.toInt()

    when (age){
        0-> println("Apenas eres recien nacido")
        1-> println("Tienes un año de edad")
        in 2..5 -> println("Estàs en preescolar")
        in 6..11 -> println("Estàs en primaria")
        in 12..15 -> println("Estàs en Secundaria")
        in 16..19 -> println("Estàs en Preparatoria")
        in 20..25 -> println("Estàs en Universidad")
        else -> {
            println("Edad invàlida")
            println("Vuelve a correr el código")
        }
    }


}

fun triangulos(){

    println("Ingresa el valor del lado 1\n")
    val lado1 = readLine()?.toInt()
    println("Ingresa el valor del lado 2\n")
    val lado2 = readLine()?.toInt()
    println("Ingresa el valor del lado 3\n")
    val lado3 = readLine()?.toInt()

    if(lado1==lado2 && lado2==lado3){
        println("El triangulo es equilatero")
    }
    else if(lado1==lado2 && lado2!=lado3 || lado3==lado1 && lado2!=1){
        println("El triangulo es isoceles")
    }
    else{
        println("El triangulo es escaleno")
    }



}

fun tipoDato(dato:Any){
    when(dato){
        is String -> println("Es un string")
        is Int -> println("Es un entero")
        is Double -> println("Es un doble")
        else -> println("Dato no soportado")
    }
}