fun main() {
    var dentro = 0
    var fora = 0

    for (i in 1..10) {
        print("Digite o ${i}º valor: ")
        val valor = readln().toInt()

        if (valor >= 24 && valor <= 42) {
            dentro++
        }

        else {
            fora++
        }
    }

    println("Valores dentro do intervalo (24 a 42): $dentro")
    println("Valores fora do intervalo: $fora")
}