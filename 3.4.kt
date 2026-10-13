fun main(){


    print("Digite o Primeiro número: ")
    var primeiro = readln().toInt()

    print("Digite o Segundo número: ")
    var segundo = readln().toInt()


    while (primeiro > segundo) {

        print("O segundo número deve ser Maior que o primeiro. Digite um novo valor: ")
        segundo = readln().toInt()

    }


    var soma = 0.0
    var quantidade = 0.0
    var real = primeiro


    while (real <= segundo) {
        soma += real
        quantidade++
        real++

    }


    val media = soma / quantidade
    println("A média aritmética entre $primeiro e $segundo é: $media")
}