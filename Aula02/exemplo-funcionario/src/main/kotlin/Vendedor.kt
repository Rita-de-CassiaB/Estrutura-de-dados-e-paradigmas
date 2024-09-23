class Vendedor (
    cpf:String,
    nome:String,
    var venda:Double,
    var taxa:Double,
):Funcionario (cpf, nome) {
    var funcionarios = mutableListOf<Funcionario>()

    override fun calSalario():Double{
        return venda*taxa
    }

    fun adicionarFun (f:Funcionario){
        funcionarios.add(f)
    }


}