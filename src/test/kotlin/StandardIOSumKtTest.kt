import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

internal class StandardIOSumKtTest {
    @Test
    fun testValidUserInput_ShouldResultInExpectedOutput() {
        val userInput: String = String.format("4%s1 5%s314 15%s-99 99%s123 987%s",
            System.lineSeparator(), System.lineSeparator(), System.lineSeparator(),
            System.lineSeparator(), System.lineSeparator())
        val bais: ByteArrayInputStream = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)
        val expected: String = String.format("6%s329%s0%s1110%s",
            System.lineSeparator(), System.lineSeparator(), System.lineSeparator(),
            System.lineSeparator())
        val baos: ByteArrayOutputStream = ByteArrayOutputStream()
        val printStream: PrintStream = PrintStream(baos)
        System.setOut(printStream)
        readAndWriteSum()
        val actual: String  = baos.toString()
        assertEquals(expected, actual)
    }
}