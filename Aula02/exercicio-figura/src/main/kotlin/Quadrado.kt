class Quadrado (
    var lado:Double,
    cor:String,
    espessura:Int
):Figura (cor, espessura) {

    override fun calculaArea(): Double {
        return lado * lado
    }

    override fun toString(): String {
        return """
            Figura:
            
            cor - $cor
            espessura - $espessura
            lado - $lado
            área - ${calculaArea()}
            
        """.trimIndent()
    }

}