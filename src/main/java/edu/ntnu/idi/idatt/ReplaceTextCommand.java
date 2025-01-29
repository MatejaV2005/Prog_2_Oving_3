package edu.ntnu.idi.idatt;

public class ReplaceTextCommand implements TextCommand {
  String target;
  String replacement;

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
