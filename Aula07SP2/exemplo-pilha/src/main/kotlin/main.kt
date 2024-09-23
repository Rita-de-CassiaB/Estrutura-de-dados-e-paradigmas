import java.util.Stack

fun main(){
    var pilha = Stack<String>()

    pilha.push("Item 1")
    pilha.push("Item 2")
    pilha.push("Item 3")
    pilha.push("Item 4")

    println("Desempilhando um elemento da pilha: ${pilha.pop()}")
    println("Espiando o topo da pilha ${pilha.peek()}")

    var pilhaLetras = Stack<String>()

    pilhaLetras.push("P")
    pilhaLetras.push("I")
    pilhaLetras.push("L")
    pilhaLetras.push("H")
    pilhaLetras.push("A")

    while(pilhaLetras.isNotEmpty()){
        println(pilhaLetras.pop())
    }



}