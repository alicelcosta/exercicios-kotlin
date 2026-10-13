fun main() {

    val n1:Int
    val n2: Int
    val n3: Int

    print("Digite o primeiro número: ")
    n1 = readln().toInt()

    print("Digite o segundo número: ")
    n2 = readln().toInt()

    print("Digite o terceiro número: ")
    n3 = readln().toInt()

    val maior = listOf(n1, n2, n3).sorted()
    val soma = maior [1] + maior [2]

    println("A soma dos dois maiores números é $soma") }