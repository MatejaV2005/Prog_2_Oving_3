package edu.ntnu.idi.idatt.capitalize;
import edu.ntnu.idi.idatt.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
