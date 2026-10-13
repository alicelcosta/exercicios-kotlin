fun main(){

    var numero: Double
    var soma: Double = 0.00
    var quantidade: Double = 0.0

    for(numero in 15..100) {

        soma += numero
        quantidade = quantidade +1
    }

    var media = soma /quantidade

    print("A média dos números é $media")
    print("\nA quantidade de números é $quantidade")
    print("\nA soma total dos valores é $soma")


}