fun main(){

    var soma = 0
    var contador = 1

    while (contador <= 4) {

        print("Digite o $contador° número: ")
        val number = readln().toInt()


        if (number < 0 || number > 10) {
            println("Digite um número maior que 0 e menor que 10!!")
        }

        else {
            soma += number
            contador++
        }
    }

    val media = soma.toDouble() / 4
    print("A média dos números é: $media")


    if (media >= 5) {
        println("Você passou no teste parabéns!")

    }

    else {
        println("Tente novamente:(")

    }
}