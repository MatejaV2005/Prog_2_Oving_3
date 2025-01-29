package edu.ntnu.idi.idatt.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement); // extends the Parent-class constructor
  }

  // Implementation of replacing first instance of target word
  @Override
  public String execute(String text) {
    return text.replaceFirst(target, replacement);
  }
}
