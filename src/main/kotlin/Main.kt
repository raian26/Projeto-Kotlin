import projetokotlin.User
//Por falta de banco de dados o usuario já está cadastrado com e-mail raian.guilherme@gmailcom
// e senha 1234
//para fazer o login utilize, ou modifique na class
// ja utilize a opçao login, e não a de cadastro
fun main() {



    val user1 = User("", "raian.guilherme", "77", "", "")




    while(true){

        println(
            "Olá!!!\n" +
                    "Bem vindo ao app Not + Hungry\n" +
                    "MENU\n" +
                    "1-Cadastro\n" +
                    "2-Login\n"
        )


      val  resp = readln().toInt()

        try {
            when (resp) {
                1 -> {
                    println("***Cadastro de novo usuário***\n")
                    user1.cadastroUser()
                    user1.loginUser()
                    break
                }
                2 -> {
                    user1.loginUser()
                    break
                }
                // miriam

                else -> {

                    println("Opcao invalida")

                }
            }
        } catch (e: Exception) {
            println("Por favor digite a opcao correta e nao insira valor vazio")

        }

    }
    //(resp!=1 || resp !=2)


// while (resp != 1 || resp != 2)
// catch (e: Exception){
// println("Digitar opcao correta, nao vazia e letras")
//}

//
    do {
        println("Bem vindo ao app Fome Zero")
        println(
            "Informe o que deseja fazer\n" +
                    "1-Doar NF\n" +
                    "2-Ver produtos\n" +
                    "3-Consultar seu saldo de pontos:\n" +
                    "4-Resgatar produtos\n" +
                    "5-Informações sobre o app\n" +
                    "6-Deslogar"
        )
      val aux   = readln().toInt()

        when (aux) {
            1 -> {
                user1.doarNota()

            }

            2
            -> {
                val listProdutos = mutableListOf<String>("1-Camiseta", "2-Boné", "3-Vouncher15%", "4-Caneca")
                listProdutos.forEach {
                    println(it)
                }


            }
            3 -> {
                user1.mostrarSaldopontos()
                println()
            }
            4 -> {
                user1.resgatarProduto()
            }
            5 -> {
                user1.infoApp()
            }
            6 -> {
                println("Até mais!!")
            }
            else -> {
                println("Opção inválida!")
            }
        }

    }while (aux!=6)

}