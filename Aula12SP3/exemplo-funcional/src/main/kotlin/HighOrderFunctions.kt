fun main() {
    val hello = { println("Hello!")}

    hello()

    val soma = fun(a: Double, b: Double): Double {
        return a + b
    }

    val subtracao = {a: Double, b: Double -> a - b}

    fun divisao (a:Double, b: Double): Double {
        return a / b
    }
    val div = ::divisao

    class CalculadoraDoisNumeros(var a: Double, var b: Double){
        fun executarOperacao(funcao: (Double, Double) -> Double):Double {
            return funcao(a,b)
        }
    }

    val calculadoraNumeros = CalculadoraDoisNumeros (8.0, 4.0)
    println(calculadoraNumeros.executarOperacao(soma))
    println(calculadoraNumeros.executarOperacao(subtracao))
    println(calculadoraNumeros.executarOperacao(div))
    println(calculadoraNumeros.executarOperacao {a, b -> a * b})

}