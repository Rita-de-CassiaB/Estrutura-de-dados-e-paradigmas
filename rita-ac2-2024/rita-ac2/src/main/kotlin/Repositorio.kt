import java.util.*
import java.util.concurrent.ArrayBlockingQueue

class Repositorio (){
    var pilha: Stack<String> = Stack<String>()
    val listaAlunos = mutableMapOf<String,String>()
    var fila: ArrayBlockingQueue<Info> = ArrayBlockingQueue<Info>(10)


    fun salvar(raAluno: String, nomeAluno:String ) {

        listaAlunos[raAluno] = nomeAluno
        pilha.add(raAluno)

        println("Contato salvo: $raAluno - $nomeAluno ")
    }

    fun desfazer(){
        if (pilha.isEmpty()){
            println("Não há o que desfazer")
        }else {
            println("Desfazendo ${deletar(pilha.pop())}")
        }
    }

    fun deletar(ra: String) {
        if (listaAlunos.containsKey(ra)) {
            listaAlunos.remove(ra)
        } else {
            println("Aluno inexistente!")
        }
    }

    fun exibir (){
        if (listaAlunos.isEmpty()){
            println("Repositório Vazio")
        }else{
           println("A lista é :$listaAlunos")
        }
    }

    fun agendarSalvar(raAluno: String, nomeAluno: String){
        fila.add(Info(raAluno, nomeAluno))
    }

    fun executarAgendado(qtdOperacoes:Int) {
        if (fila.isEmpty()){
            println("Não há operações agendadas")
        }else if (qtdOperacoes <= 0 || qtdOperacoes > fila.size){
            println( "Quantidade inválida")
        } else {
               println("Executando $qtdOperacoes agendados ${fila.poll()}")
        }

    }
}