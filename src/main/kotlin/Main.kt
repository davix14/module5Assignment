fun main(args: Array<String>) {
    println("Welcome to the Fibonacci Races!\nSequence will run until the ${args[0]}th place\n")
    val argNumber = args[0].toDouble()
    Thread(RecursiveFibonacci(argNumber)).start()
    Thread(IterativeFibonacci(argNumber)).start()
}