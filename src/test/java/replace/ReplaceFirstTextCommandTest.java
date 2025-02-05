package replace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.ntnu.idi.idatt.replace.ReplaceFirstTextCommand;
import edu.ntnu.idi.idatt.replace.ReplaceTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplaceFirstTextCommandTest {
  ReplaceFirstTextCommand command;

  @BeforeEach
  void setUp() {
    String target = "Hello";
    String replacement = "World";
    command = new ReplaceFirstTextCommand(target, replacement);
  }

  @Test
  void testReplaceFirstWord() {
    String input = "Hello World Hello";
    String expected = "World World Hello";
    assertEquals(expected, command.execute(input));
  }

  //Negative tests -----------------------------------

  @Test
  void targetIsNull() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ReplaceTextCommand(null, "fill");
    });
  }

  @Test
  void replacementIsNull() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ReplaceTextCommand("fill", null);
    });
  }

  @Test
  void testNullInputForText() {
    String nullInput = null;

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(nullInput);
    });
  }

  @Test
  void testBlankInputForText() {
    String nullInput = "";

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(nullInput);
    });
  }
}
