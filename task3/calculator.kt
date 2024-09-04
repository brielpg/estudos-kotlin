fun main(args: Array<String>) {
    if (args.size != 3) {
        return println("Erro: Número de argumentos inválido")
    }

    val num1 = args[0].toDoubleOrNull()
    val num2 = args[1].toDoubleOrNull()
    val operador = args[2]

    if (num1 == null || num2 == null) {
        return println("Erro: Argumento inválido")
    }

    if (num1 <= 0 || num2 <= 0) {
        return println("Erro: Divisão por zero ou números negativos não é permitido")
    }

    val resultado = when (operador) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> return println("Erro: Operador inválido")
    }

    println(resultado)
}