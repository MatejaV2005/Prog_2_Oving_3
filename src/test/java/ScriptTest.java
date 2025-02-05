import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.ntnu.idi.idatt.Script;

import edu.ntnu.idi.idatt.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.idi.idatt.replace.ReplaceFirstTextCommand;
import edu.ntnu.idi.idatt.replace.ReplaceTextCommand;
import edu.ntnu.idi.idatt.wrap.WrapLinesTextCommand;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScriptTest {
  Script script;

  @BeforeEach
  void setUp() {
    script = new Script(List.of(
        new ReplaceTextCommand("hello", "hey"),
        new ReplaceFirstTextCommand("world", "earth"),
        new CapitalizeWordsTextCommand(),
        new WrapLinesTextCommand("!<", ">!")
    ));
  }

  @Test
  void testPipelineOfCommands() {
    String input = "hello world";
    String expected = "!<Hey>! !<Earth>!";
    assertEquals(expected, script.execute(input));
  }
}
