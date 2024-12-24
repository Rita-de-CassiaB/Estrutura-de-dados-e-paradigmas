fun main() {

    //map vazio
    var mapVazio = LinkedHashMap<String, String>()

    //map de configuração
    var mapConfiguracao = mutableMapOf(
        "linguagem" to "kotlin",
        "versão" to "1.16.0"
    )

    // Exibindo map inteiro
    println(mapConfiguracao)

    //map informação chave
    mapConfiguracao["linguagem"] = "java"
    println(mapConfiguracao)

    //Adicionando outra informação
    mapConfiguracao["modo"] = "debug"
    println(mapConfiguracao)

    //Armazenando ultimo valor
    var ultimaChave = mapConfiguracao.keys.last()

    //Removendo o valor do map
    mapConfiguracao.remove(ultimaChave)
    println(mapConfiguracao)

    //Map de valores ímpares e pares a partir de uma lista
    var lista = listOf(6,5,4,3,2,1)
    var mapNumeros = lista.groupBy {
        numeroDaVez -> if (numeroDaVez % 2 == 0) "Par" else "Ímpar"
    }

    println(mapNumeros)

    println(mapConfiguracao.getOrElse("linguagem"){"Linguagem não definida"})
    println(mapConfiguracao.getOrElse("software"){"software não definido"})

    //exibição
    println("Exibindo os valores do mapConfiguração")
    for (valor in mapConfiguracao.values){
        println(valor)
    }

    //filtragem da exibição
    println("Exibindo os valores do mapConfiguração pelas chaves")
    for (chave in mapConfiguracao.keys){
        println(mapConfiguracao[chave])
    }



}