class Numero(val valor: Double) {

    // Método operacao
    fun operacao(outroNumero: Double, operacao: (Double, Double) -> Double): Numero {
        return Numero(operacao(this.valor, outroNumero))
    }

    // Método finalizar
    fun finalizar(funcao: (Double) -> Unit) {
        funcao(this.valor)
    }
}