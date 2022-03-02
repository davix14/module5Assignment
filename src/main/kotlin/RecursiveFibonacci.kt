import java.util.concurrent.TimeUnit

class RecursiveFibonacci(private val numberIn: Double): Runnable {
    override fun run() {
        println("Recursive fibonacci method starting!\n")
        val startTime = System.nanoTime()

        val result = fibonacci(numberIn)

        val elapsedTime = System.nanoTime() - startTime
        println("End of recursive fibonacci method! Result: $result \nELAPSED TIME: ${TimeUnit.NANOSECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)} Nanoseconds")
    }

    companion object{
        fun fibonacci(n: Double): Double {
            if ((n.toInt() == 1) || (n.toInt() == 0)) {
                return n
            }
            return fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

}