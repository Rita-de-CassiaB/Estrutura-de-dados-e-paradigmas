package Exercicio1
 fun main() {

     var valores = Array(7) { 0.0 }

     println("Boas Vindas ao vetor. Digite 7 números, um de cada vez")
     for (i in valores.indices) {
         println("Digite o número  ${i + 1} ")

         valores[i] = readln().toDouble()
     }

     println("A exibição na ordem inserida é")
     for (i in valores) {
         println(i)
     }

     println("A exibição na ordem contrária é")
     for (i in valores.indices.reversed()){
         println(valores[i])
     }



 }
