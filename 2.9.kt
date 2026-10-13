fun main(){

    var ano: Int

    print("Qual seu ano de nascimento? ")
    ano = readln().toInt()

    if ( ano <= 2010){
        println("Parabéns, você já pode votar esse ano!") }

    else {
        println("Você não pode votar esse ano!") }

}