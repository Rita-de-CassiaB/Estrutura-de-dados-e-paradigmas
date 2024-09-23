class Carrinho (
    nome:String,
) {
    var carrinho = mutableListOf<Vendável>()

    fun adicionaVendavel(v:Vendável){
        carrinho.add(v)
    }

    fun calculaTotalVenda():Double{
        var total = 0.0

        carrinho.forEach{ carrinho ->
            total += carrinho.getValorVenda()
        }
        return total
    }

    fun exibeItensCarrinho(){
        for (i in carrinho){
            println(i)
        }
        println()
    }
}