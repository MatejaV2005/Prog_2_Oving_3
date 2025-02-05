package replace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.ntnu.idi.idatt.replace.ReplaceTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplaceTextCommandTest {
  ReplaceTextCommand command;

  @BeforeEach
  void setUp() {
    String target = "Hello";
    String replacement = "World";
    command = new ReplaceTextCommand(target, replacement);
  }

  @Test
  void testReplaceTextWithTarget() {
    String input = "Hello World";
    String expected = "World World";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testReplaceMoreTextWithTarget() {
    String input = "Hello World Hello";
    String expected = "World World World";
    assertEquals(expected, command.execute(input));
  }


  //Negative-tests -------------------------------------------------
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

  @Test
  void testTargetNotFoundInText() {
    String input = "World World";

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(input);
    });
  }

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
}
