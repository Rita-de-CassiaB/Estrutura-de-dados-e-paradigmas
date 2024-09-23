abstract class Figura (
    var cor:String,
    var espessura:Int
) {

    abstract fun calculaArea(): Double

    override fun toString(): String {
        return """
            Figura:
            
            cor - $cor
            espessura - $espessura
        """.trimIndent()
    }
}