package edu.ntnu.idi.idatt.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement); // extends the Parent-class constructor
  }

  // Implementation of replacing first instance of target word
  @Override
  public String execute(String text) {
    if(text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null");
    }
    return text.replaceFirst(getTarget(), getReplacement());
  }
}
