package wrap;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WrapLinesTextCommandTest {
  WrapLinesTextCommand command;

  @BeforeEach
  void setUp() {
    command = new WrapLinesTextCommand("<p>", "</p>");
  }

  @Test
  void wrapEachWord() {
    String input = "Hello World";
    String expected = "<p>Hello</p><p>World</p>";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void wrapSingleWord() {
    String input = "Hello";
    String expected = "<p>Hello</p>";
    assertEquals(expected, command.execute(input));
  }

  // negative tests ------------

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
