package edu.ntnu.idi.idatt.wrap;

import edu.ntnu.idi.idatt.TextCommand;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String closing;

  // constructor
  public WrapTextCommand(String opening, String closing) {
    this.opening = opening;
    this.closing = closing;
  }

  // execute
  @Override
  public String execute(String text) {
    return opening + text + closing;
  }

}
