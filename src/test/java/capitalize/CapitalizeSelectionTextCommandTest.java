package capitalize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import edu.ntnu.idi.idatt.capitalize.CapitalizeSelectionTextCommand;
import org.junit.jupiter.api.Test;

public class CapitalizeSelectionTextCommandTest {

    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("james");


  @Test
  void testCapitalizeSelectedText() {
    String input = "LeGoat james the true goat";
    String expected = "LeGoat James the true goat";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testMultipleCapitalizeSelectedText() {
    String input = "LeGoat james the true james";
    String expected = "LeGoat James the true James";
    assertEquals(expected, command.execute(input));
  }


  //Negative-tests ------------------------------------------

  @Test
  void testSelectionIsNullOrBlank() {
    assertThrows(IllegalArgumentException.class, () -> {
      command = new CapitalizeSelectionTextCommand(null);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      command = new CapitalizeSelectionTextCommand("");
    });
  }

  @Test
  void testSelectionNotInText() {
    String input = "Luka Doncic my GOAT";

    assertThrows(IllegalArgumentException.class, () -> {
      command.execute(input);
    });
  }
}
