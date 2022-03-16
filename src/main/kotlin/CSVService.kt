import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.BufferedWriter
import java.io.FileWriter

class CSVService() {
    val writer = BufferedWriter(FileWriter("/fibonacciResults.csv"))
    val csvPrinter = CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("n", "nanoseconds Elapsed"))

    companion object{
        //  list to collect n and time of respective
        var dataCollected = mutableListOf<singleGraphEntry>()
    }

    fun writeDataToCSV(): Boolean{

        var success: Boolean = try {
            for (entry in dataCollected){
                val rowData = listOf(
                    entry.n,
                    entry.recursiveTimeElapsed,
                    entry.iterativeTimeElapsed)

                csvPrinter.printRecord(rowData)
            }
            true
        } catch (e: Exception){
            println("ERROR writing to CSV! Exception:\n$e")
            false
        }

        return success
    }
}