fun main(){

    val n1 = 6
    var soma = 0

    for (contador in 1..6) {

        print("Digite o ${contador}° número: ")
        val n2 = readln().toInt()
        soma += n2

    }

    val media_aritmetica = soma.toDouble()/n1
    println("A Média Aritmética dos números é: $media_aritmetica")

}