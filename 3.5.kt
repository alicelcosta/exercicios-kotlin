fun main() {

    var aprovados = 0

    while (true) {
        print("Digite a primeira nota: ")
        var primeiranota = readln().toDouble()


        while (primeiranota < 0 || primeiranota > 10) {
            print("Nota inválida! Digite a primeira nota novamente 0 a 10: ")
            primeiranota = readln().toDouble()
        }


        print("Digite a segunda nota: ")
        var segundanota = readln().toDouble()


        while (segundanota < 0 || segundanota > 10) {

            print("Nota inválida! Digite a segunda nota novamente (0 a 10): ")
            segundanota = readln().toDouble()
        }


        val media = (primeiranota + segundanota) / 2
        print("Média final: $media")


        if (media >= 9.5) {
            print("\nStatus: APROVADO!")
            aprovados++
        }


        else {
            println("\nStatus: REPROVADO!")
        }


        print("\nDeseja calcular a média de outro aluno? (S/N): ")
        if (!readln().equals("S", ignoreCase = true)) {
            break }

    }

    print("Programa encerrado.")
    print("\nQuantidade de alunos aprovados: $aprovados")
}
