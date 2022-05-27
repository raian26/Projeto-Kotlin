package projetokotlin

class User(nome: String, email: String, senha: String, cpf: String, tel: String) :
    DadosUser(nome, email, senha, cpf, tel) {
    var saldo = 0
    var numeroNf: String = ""
    var listNF = mutableListOf<String>()
    var listProdutos =
        listOf<String>("1-Camiseta = 5 pontos", "2-Boné = 4 pontos", "3-Vouncher15% = 6 pontos", "4-Caneca = 3 pontos")

    override fun cadastroUser() {
        print("Me informe seu nome compeleto: ")
        nome = readln()
        print("Agora me informe um e-mail válido: ")
        email = readln()
        print("Cadastre uma senha: ")
        senha = readln()
        println("Informe seu CPF:")
        cpf = readln()
        print("Me informe o seu telefone:")
        tel = readln()
    }

    override fun loginUser() {
        println("Digite seu e-mail:")
        email = readln()
        println("Informe sua senha:")
        senha = readln()


        if (email != "raian.guilherme@gmail.com" && senha != "kkkk")
            println("E-mail ou senha incorreto!")
        else {
            println("Login efetuado com sucesso")
        }

    }

    override fun doarNota() {
        println("Informe o código da NF que deseja doar:")
        numeroNf = readln()
        if (numeroNf.length == 3) {
            println("Sua nota será analisada e validada!")
            saldo ++
            listNF.add(numeroNf)
        } else {
            println("Informações inválidas")

        }

    }

    override fun mostrarSaldopontos() {
        println("O seu saldo é:$saldo")

    }


    override fun listarProdutos() {
        println("Produtos disponíveis:")
        listProdutos.forEach {
            println(it)
        }
    }

    override fun trocarProduto() {

        listProdutos.forEach {
            println(it)
        }
        println("Escolha por qual produto deseja trocar seus pontos:")
        var aux1 = readln().toInt()
        when (aux1) {
            1 -> {
                if (saldo < 5) {
                    println("Você não tem pontos o suficiente")
                    println(saldo)
                } else {
                    saldo -= 5
                    println("Camiseta Adicionada")
                    println("Seu saldo é:$saldo")
                }
            }

        }
    }
}
