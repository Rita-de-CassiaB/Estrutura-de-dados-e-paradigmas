class Imagem(
    var nome:String
){
    var figuras = mutableListOf<Figura>()

    fun adicionaFigura(f:Figura) {
        figuras.add(f)
    }

    fun exibeFiguras(){
        for (f in figuras){
            println(f)
        }
        println()
    }

    fun exibeSomaArea():Int{
        var soma = 0
        for (f in figuras){
            soma = (soma + f.calculaArea()).toInt()
        }
        return soma
    }

    fun exibeQuadrado(){
        for (f in figuras){
            println(f.toString())

            if (f is Quadrado){
                println(figuras.toString())
            }
        }
    }

    fun exbeFiguraAreaMaior20(figura: Figura){

        if ( figura.calculaArea() > 20){
            println()
        }
        println()
    }

}