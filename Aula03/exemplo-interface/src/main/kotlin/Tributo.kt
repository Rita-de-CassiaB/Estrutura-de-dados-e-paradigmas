class Tributo (
    var nome:String
) {
    var listTrib = mutableListOf<Tributavel>()

    fun adicionaTributavel(t:Tributavel){
        listTrib.add(t)
    }

    fun calculaTotalTributo(): Double {
        var total = 0.0
        listTrib.forEach { tributo ->
            total += tributo.getValorTributo()
        }
        return total
    }

    fun exibeTodos() {
        for (t in listTrib) {
            print(t)
        }
        println()
    }


}