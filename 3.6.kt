fun main() {

    var soma: Double = 0.0
    var contador = 1


    while (contador <= 6) {
        print("Digite a nota $contador (0 a 10): ")

        val entrada = readln()
        val nota = entrada.toDoubleOrNull()

        if (nota != null && nota in 0.0..10.0) {
            soma += nota
            contador++

        }

        else {
            println("Nota inválida! Digite um número de 0 a 10.")
        }
    }

    val media = soma / 6
    print("A média final é: $media")
}
