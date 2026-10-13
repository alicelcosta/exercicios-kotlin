fun main(){

    print("Digite o 1° número: ")
    val n1 = readln().toInt()

    print("Digite o 2° número: ")
    val n2 =readln().toInt()

    print("Digite o 3° número: ")
    val n3 =readln().toInt()

    print("Digite o 4° número: ")
    val n4 = readln().toInt()


    val primeiro = n1
    val ultimo = n4
    var maior = n1


    if (n2 > maior) {
        maior = n2
    }


    if (n3 > maior) {
        maior = n3
    }


    if (n4 > maior) {
        maior = n4
    }

    print("O primeiro número é $n1, o último é $n4 e o maior deles é o $maior.")

}