package edu.ntnu.idi.idatt.replace;
import edu.ntnu.idi.idatt.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  // Get-methods
  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }


  // Implementation of execute method to replace target word
  @Override
  public String execute(String text) {
    return text.replace(target, replacement);
  }







}
