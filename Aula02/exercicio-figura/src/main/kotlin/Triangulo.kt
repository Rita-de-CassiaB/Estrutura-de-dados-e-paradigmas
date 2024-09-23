class Triangulo (
    var base:Double,
    var altura:Double,
    cor:String,
    espessura:Int
):Figura (cor, espessura){

    override fun calculaArea(): Double {
        return base*altura/2
    }

    override fun toString(): String {
        return """
            Figura:
            
            cor - $cor
            espessura - $espessura
            base - $base
            altura - $altura
            área - ${calculaArea()}
            
        """.trimIndent()
    }
}