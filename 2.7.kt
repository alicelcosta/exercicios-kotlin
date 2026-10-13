fun main() {

    var soma = 0.0
    val numeros = DoubleArray(6)

    for (i in 0..5) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toDouble()


        if (numeros[i] < 72) {
            soma += numeros[i] }

    }

    println("\nValores informados:\n")

    for (numero in numeros) {

        println(numero)
    }


    println("\nSoma dos valores menores que 72: $soma")
}

