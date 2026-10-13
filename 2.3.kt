fun main() {

    var n1: Int
    var n2: Int
    var n3: Int

    print("Digite o primeiro número: ")
    n1 = readln().toInt()


    print("Digite o segundo número: ")
    n2 = readln().toInt()


    print("Digite o terceiro número: ")
    n3 = readln().toInt()


    val maior = maxOf(n1,n2,n3)
    print("O maior número é $maior")

}