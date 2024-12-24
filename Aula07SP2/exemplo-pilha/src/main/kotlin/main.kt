import java.util.Stack

fun main() {

    var vetor1 = arrayOf(1,4,4,1)
    var vetor2 = arrayOf(50,20,30,10)
    var vetor3 = arrayOf(10,20,30,40,40,30,20,10)
    var vetor4 = arrayOf(1,2,3,2,1)

    println("Boas Vindas ao Exercicio 1 sobre números palindromos - ")
    println("1,4,4,1 - "+ ehPalindromoInt(vetor1))
    println("50,20,30,10 - "+ehPalindromoInt(vetor2))
    println("10,20,30,40,40,30,20,10 - "+ehPalindromoInt(vetor3))
    println("1,2,3,2,1 - "+ehPalindromoInt(vetor4))
    println()

    println("Boas Vindas ao Exercicio 2 sobre conversão binária -")
    converterBinario(9)
    converterBinario(12)
    converterBinario(32)
    println()

    println("Boas Vindas ao Exercicio 3 sobre inversão de frases - ")
    lerFrase()
    println()

    println("Boas Vindas ao Exercicio 4 sobre palavras/frases palindromas - ")
    println("arara - " + ehPalindromoString("arara"))
    println("teste - " + ehPalindromoString("teste"))
    println("Socorram me subi no ônibus em Marrocos - " + ehPalindromoString("Socorram me subi no ônibus em Marrocos"))

}

fun ehPalindromoInt(array:Array<Int>):Boolean{

    var pilha = Stack<Int>()

    for (a in array){
        pilha.push(a)
    }

    for (a in array){

        if(pilha.pop() != a){
            return false
        }

    }
    return true

}

fun lerFrase(){

    println("Escreva a frase para inverter")
    var frase = readln()

    var pilha = Stack<Char>()

    for (indice in frase.indices){
        pilha.push(frase[indice])
    }

    while (pilha.isNotEmpty()){
        print(pilha.pop())
    }

}

fun ehPalindromoString(frase:String):Boolean{

    val fraseLimpa = frase.replace(Regex("[^A-Za-z0-9]"), "").lowercase()

    var pilha = Stack<Char>()

    for (char in fraseLimpa){
        pilha.push(char)
    }

    for (char in fraseLimpa){

        if(pilha.pop() != char){
            return false
        }
    }

    return true
}
    fun converterBinario(numero:Int){

        var num = numero

        var result = Stack<Int>()

        var divisoes = true

        while (divisoes){

            if (num>=2){
                result.push(num%2)
                num=num/2
            }else{
                result.push(num%2)
                divisoes=false
            }

        }

        while (result.isNotEmpty()){
            print("${result.pop()}, ")
        }

    }
