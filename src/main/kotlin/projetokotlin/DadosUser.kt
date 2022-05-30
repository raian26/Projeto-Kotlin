package projetokotlin

abstract class DadosUser(
    var nome:String,
    var email:String,
    var senha:String,
    var cpf:String,
    var tel:String
) {

    abstract fun cadastroUser()


    abstract fun loginUser()


    abstract fun doarNota()

    abstract fun resgatarProduto()


  abstract fun mostrarSaldopontos()

abstract fun listarProdutos()

abstract fun infoApp()


}

