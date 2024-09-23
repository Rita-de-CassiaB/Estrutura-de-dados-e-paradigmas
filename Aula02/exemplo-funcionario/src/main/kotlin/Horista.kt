 class Horista(
     cpf:String,
     nome:String,
     var qtdHora:Int,
     var valorHora:Double
 ):Funcionario(cpf, nome){
     var funcionarios = mutableListOf<Funcionario>()

     override fun calSalario():Double{
         return qtdHora*valorHora
     }

     fun adicionarFun (f:Funcionario){
         funcionarios.add(f)
     }





 }