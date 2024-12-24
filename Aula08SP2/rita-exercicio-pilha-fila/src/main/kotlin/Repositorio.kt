import java.util.*
import java.util.concurrent.ArrayBlockingQueue

class Repositorio (
    var list: MutableList<Brinquedo> = mutableListOf(),
    var pilha: Stack<Int> = Stack<Int>(),
    var fila: ArrayBlockingQueue<Brinquedo> = ArrayBlockingQueue<Brinquedo>(10)
){

    fun salvar(brinquedo: Brinquedo){
        pilha.add(brinquedo.codigo)
        list.add(brinquedo)
    }

    fun deletar(codigo: Int) {
        val remover = list.find {it.codigo == codigo}

        if (remover != null) {
            list.remove(remover)
            println("Brinquedo com ID $codigo removido.")
        } else {
            println("ID inexistente.")
        }
    }

    fun exibir():String{
        if (list.isEmpty()){
            return "Repositório Vazio"
        }else{
            return "A lista é :$list e a fila $fila"
        }
    }

    fun desfazer():String{
        if (pilha.isEmpty()){
            return "Não há o que desfazer"
        }else {
            return "Desfazendo ${deletar(pilha.pop())}"
        }
    }

    fun agendarSalvar(brinquedo: Brinquedo){
        fila.add(brinquedo)
    }

    fun executarAgendado(qtdOperacoes:Int):String{
        if (fila.isEmpty()){
            return "Não há operações agendadas"
        }else if (qtdOperacoes <= 0 || qtdOperacoes > fila.size){
            return "Quantidade inválida"
        } else {
            return "${salvar(fila.remove())}"
        }
    }

    fun verificarId(codigo: Int): Boolean {
        return list.any { it.codigo == codigo }
    }


}

