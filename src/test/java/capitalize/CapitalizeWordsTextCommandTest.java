package capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.ntnu.idi.idatt.capitalize.CapitalizeWordsTextCommand;
import org.junit.jupiter.api.Test;

public class CapitalizeWordsTextCommandTest {

  CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();


  @Test
  void testCapitalizeWordInText() {
    String input = "hello world";
    String expected = "Hello World";

    assertEquals(expected, command.execute(input));
  }

  @Test
  void testCapitalizeWordWithMultipleSpace() {
    String input = "hello    world";
    String expected = "Hello World";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testCapitalizeWordWithNumbers() {
    String input = "hello 123 world";
    String expected = "Hello 123 World";
    assertEquals(expected, command.execute(input));
  }

  //Negative-Tests
  @Test
  void TestWithNullValue() {
    String input = null;

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(input);
    });
  }

  @Test
  void TestWithBlankValue() {
    String input = "";

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(input);
    });
  }

}
