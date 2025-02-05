package wrap;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.wrap.WrapTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WrapTextCommandTest {
  WrapTextCommand command;

  @BeforeEach
  void setUp() {
    command = new WrapTextCommand("Open", "Close");
  }

  @Test
  void wrapTextWithOpeningAndClosing() {
    String input = "< Hello World >";
    String expected = "Open < Hello World > Close";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testNullOpening() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapTextCommand(null, "Close");
    });
  }

  @Test
  void testEmptyOpening() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapTextCommand("", "Close");
    });
  }

  @Test
  void testNullClosing() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapTextCommand("Open", null);
    });
  }

  @Test
  void testEmptyClosing() {
    assertThrows(IllegalArgumentException.class, () -> {
      new WrapTextCommand("Open", "");
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
