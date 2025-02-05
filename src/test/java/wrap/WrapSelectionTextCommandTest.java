package wrap;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WrapSelectionTextCommandTest {
  WrapSelectionTextCommand command;

  @BeforeEach
  void setUp() {
    command = new WrapSelectionTextCommand("Open", "Close", "World");
  }

  @Test
  void wrapSelectedText() {
    String input = "Hello World, how are you?";
    String expected = "Hello OpenWorldClose, how are you?";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void wrapMultipleOccurrences() {
    String input = "World Hello World";
    String expected = "OpenWorldClose Hello OpenWorldClose";
    assertEquals(expected, command.execute(input));
  }


  // Negative tests -----------------------------------
  @Test
  void testNullSelection() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapSelectionTextCommand("Open", "Close", null);
    });
  }

  @Test
  void testEmptySelection() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapSelectionTextCommand("Open", "Close", "");
    });
  }

  @Test
  void testNullText() {
    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(null);
    });
  }

  @Test
  void testBlankText() {
    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(" ");
    });
  }
}
