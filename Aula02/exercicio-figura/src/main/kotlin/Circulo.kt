class Circulo (
    var raio:Double,
    cor:String,
    espessura:Int
):Figura (cor, espessura){

    override fun calculaArea(): Double {
        return (3.14 * raio * raio)
    }

    override fun toString(): String {
        return """
            Figura:
            
            cor - $cor
            espessura - $espessura
            raio - $raio
            área - ${calculaArea()}
            
        """.trimIndent()
    }
}