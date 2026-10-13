fun main() {
    println("Bomba Ativada")

    for (contador in 30 downTo 0) {

        println("Detonação em: $contador segundos")
        Thread.sleep(1000)
    }

    println("\nEXPLOSÃO!")
}