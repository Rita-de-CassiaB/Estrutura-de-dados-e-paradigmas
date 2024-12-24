 fun main () {

     println("Boas vindas ao sistema de lista de contatos")

     println("Quantos contatos deseja cadastrar?")
     val quantidade = readln().toInt()

     var listaContatos = mutableMapOf<String,String>()

     for (i in 1..quantidade) {

         println("Digite o nome do seu contato")
         var contatonome = readln()
         println("Digite o número do seu contato, considerando DD e sem espaços ou traços")
         var contatonumero = readln()

         listaContatos[contatonome] = contatonumero

         var salvar = listaContatos.keys.last()
         println(listaContatos)

         println("Contato salvo: $contatonome - $contatonumero")
     }

     println("Lista de contatos atualizada: $listaContatos")

     println("Insira um contato para pesquisar")
     var contatoescolhido = readln()


     if (listaContatos.containsKey(contatoescolhido)) {
         println("O telefone de $contatoescolhido é ${listaContatos[contatoescolhido]}")
     } else {
         println("Amigo não encontrado!")
     }
 }