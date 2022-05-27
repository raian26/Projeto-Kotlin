import projetokotlin.User

fun main(){
    var user1 = User("","","","","")
      println("Olá!!!\n" +
              "Bem vindo ao app Fome Zero\n" +
              "MENU\n" +
              "1-Cadastro\n" +
              "2-Login\n")
        var resp = readln().toInt()
    /* when(resp){
         1->{
                println("***Cadastro de novo usuario***\n")
              user1.cadastroUser()
                    }
          2->{ user1.loginUser()

          }
      }*/
    do {
    println("Bem vindo ao app Fome Zero")
    println("Informe o que deseja fazer\n:" +
            "1-Doar NF\n" +
            "2-Ver produtos\n" +
            "3-Consultar seu saldo de pontos:\n" +
            "4-Resgatar produtos\n")
          var aux= readln().toInt()

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
           3->{
               user1.mostrarSaldopontos()
               println()
           }
           4->{
               user1.trocarProduto()
           }

       }
   }while(aux!=7)

    }

