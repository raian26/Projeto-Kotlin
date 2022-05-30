import projetokotlin.User


fun main() {
    var user1 = User("", "raian.guilherme@gmail.com", "1234", "", "")
    println(
        "Olá!!!\n" +
                "Bem vindo ao app Not + Hungry\n" +
                "MENU\n" +
                "1-Cadastro\n" +
                "2-Login\n" +
                "3-Sair\n"
    )
    var resp = readln().toInt()
    when (resp) {
        1 -> {
            println("***Cadastro de novo usuário***\n")
            user1.cadastroUser()
            user1.loginUser()
        }
        2 -> {
            user1.loginUser()

        }
        3 -> {
            println("Até mais!!!")
        }
        else -> {
            println("Opção inválida!")
        }
    }

    while (resp != 3)

        do {
            println("Not + Hungry\n")
            println(
                "Informe o que deseja fazer\n" +
                        "1-Doar NF\n" +
                        "2-Ver produtos\n" +
                        "3-Consultar seu saldo de pontos:\n" +
                        "4-Resgatar produtos\n" +
                        "5-Informações sobre o app\n" +
                        "6-Deslogar"
            )
            var aux = readln().toInt()

            when (aux) {
                1 -> {
                    user1.doarNota()

                }
                2 -> {
                    var listProdutos = mutableListOf<String>("1-Camiseta", "2-Boné", "3-Vouncher15%", "4-Caneca")
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
                    println("Opção inválida!\n")
                }
            }
        } while (aux != 6)

}

