fun main(){

    print("Digite o Primeiro número: ")
    val n1 = readln().toDouble()

    print("Digite o Segundo número: ")
    var n2 = readln().toDouble()

    while (n2 <= 0) {

        print("O valor deve ser maior que zero. Digite o Segundo número novamente: ")
        n2 = readln().toDouble()
    }

    val divisao = n1 / n2
    print("A divisão dos números é: $divisao")
}