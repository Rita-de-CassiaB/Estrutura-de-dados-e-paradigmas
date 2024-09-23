class TestaFigura {
    fun main() {
        var fig1 = Quadrado(5.0, "azul", 2)
        var fig2 = Triangulo(6.0, 12.0, "roxo", 4)
        var fig3 = Circulo(26.9, "amarelo", 5)
        var fig4 = Retangulo(8.6, 15.0, "rosa", 12)
        var fig5 = Circulo(65.8, "preto", 2)
        var fig6 = Quadrado(100.8, "vinho", 2)

        var imagem = Imagem("grupos 1")

        imagem.adicionaFigura(fig1)
        imagem.adicionaFigura(fig2)
        imagem.adicionaFigura(fig3)
        imagem.adicionaFigura(fig5)
        imagem.adicionaFigura(fig6)
        imagem.adicionaFigura(fig4)
        imagem.adicionaFigura(fig1)

        println()

        imagem.exibeFiguras()
        println()
//        imagem.exbeFiguraAreaMaior20(figuras)
//        println()
        imagem.exibeQuadrado()
        println()
        imagem.exibeSomaArea()
        println()
    }


}