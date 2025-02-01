package edu.ntnu.idi.idatt;

import java.util.ArrayList;
import java.util.List;

public class Script {
  List<TextCommand> textCommands;

  Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }


  public String execute(String text) {
    String currentText = text;
    for (TextCommand commands : textCommands) {
      currentText = commands.execute(currentText);
    }

    return currentText;
  }

}
