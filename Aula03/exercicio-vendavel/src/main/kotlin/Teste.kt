class Teste {
    fun main(){
        var l1 = Livro(65, 26.50, "Alice nos paises maravilhosos", "Divas divonicas", "226555689" )

        var dvd1 = Dvd(76, 5000.00, "Maravilha e seus paises alísticos", "Divos da divolandia")

        var se1 = Servico("Gravadora e Editora, livros e filmes de divas atuárias", 7070, 50000, 2020.20)

        var carrinho = Carrinho("Ana Maria")

        carrinho.adicionaVendavel(l1)
        carrinho.adicionaVendavel(dvd1)
        carrinho.adicionaVendavel(se1)
        println()
        carrinho.exibeItensCarrinho()
        println()
        println("total da sua venda: "+carrinho.calculaTotalVenda())
        println()

    }
}