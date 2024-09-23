class Retangulo (
    var base:Double,
    var altura:Double,
    cor:String,
    espessura:Int
):Figura (cor, espessura){

    override fun calculaArea(): Double {
        return base*altura
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