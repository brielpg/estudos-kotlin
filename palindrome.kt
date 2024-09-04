fun main(args: Array<String>){
    if (args.isNotEmpty()){
        if (args[0] == args[0].reversed()){
            println("MAD Rocks!")
        } else {
            print("Oops! This word is a one-way street, can't read it backward!")
        }
    } else {
        println("Argumento Inválido")
    }
}