package capitalize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import edu.ntnu.idi.idatt.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.Test;

public class CapitalizeTextCommandTest {

    CapitalizeTextCommand command = new CapitalizeTextCommand();


    @Test
    void testCapitalizeNormalText() {
        String input = "hello world";
        String expected = "Hello world";
        assertEquals(expected, command.execute(input));
    }

    @Test
    void testOneOrMultipleCapitalLetter() {
        String input1 = "hello World";
        String expected1 = "Hello World";

        String input2 = "HELLO world";
        String expected2 = "HELLO World";
        assertEquals(expected1, command.execute(input1));
    }

    @Test
    void testNumbersInString() {
        String input = "m4t3ja 7asic";
        String expected = "M4t3ja 7asic";
        assertEquals(expected, command.execute(input));
    }


    //NEGATIVE TEST -------------------------------------------
    @Test
    void testNullString() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> {
            command.execute(input);
        });
    }

    @Test
    void testBlankString() {
        String input = "";
        assertThrows(IllegalArgumentException.class, () -> {
            command.execute(input);
        });
    }






}
