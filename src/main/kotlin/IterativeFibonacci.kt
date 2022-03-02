import java.util.concurrent.TimeUnit

class IterativeFibonacci(private val numberIn: Double) : Runnable {
    override fun run() {
        println("Iterative fibonacci method starting!\n")
        val startTime = System.nanoTime()

        val result = fibonacci(numberIn)

        val elapsedTime = System.nanoTime() - startTime
        println("End of iterative fibonacci method! Result: ${result}\nELAPSED TIME: ${TimeUnit.NANOSECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)} Nanoseconds")
    }

    companion object {
        fun fibonacci(n: Double): Double {
            var x: Double
            var y = 0.0
            var z = 1.0
            for (i in 1 until n.toInt()) {
                x = y
                y = z
                z = x + y
            }
            return z
        }
    }
}