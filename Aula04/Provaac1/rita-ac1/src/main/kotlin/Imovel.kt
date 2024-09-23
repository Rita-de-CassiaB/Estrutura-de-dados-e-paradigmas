class Imovel (
    var valorM2:Double,
    var area:Int,
    var bairro:String
):Tributável {
    override fun getImposto(): Double {
        var IPTU = 0.05* getValorImovel()
        return IPTU
    }

    fun getValorImovel ():Double{
       return area*valorM2
    }

    override fun toString(): String {
        return """
            Olá imóvel do bairro $bairro
            Seu valor por m2 é $valorM2
            Sua área é de $area
            Seu valor é ${getValorImovel()}
            Seu IPTU é ${getImposto()}
            
        """.trimIndent()
    }

}