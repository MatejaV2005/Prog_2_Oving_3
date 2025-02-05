package edu.ntnu.idi.idatt.replace;
import edu.ntnu.idi.idatt.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    setTarget(target);
    setReplacement(replacement);
  }

  // Get-methods
  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }

  //set-methods
  private void setTarget(String target) {
    if (target == null || target.isBlank()) {
      throw new IllegalArgumentException("Chosen target cannot be null or blank");
    }
    this.target = target;
  }

  private void setReplacement(String replacement) {
    if (replacement == null || target.isBlank()) {
      throw new IllegalArgumentException("Chosen replacement cannot be null or blank");
    }
    this.replacement = replacement;
  }


  // Implementation of execute method to replace target word
  @Override
  public String execute(String text) {
    if(text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null");
    }

    if(!text.contains(getTarget())){
      throw new IllegalArgumentException("Target not found in text");
    }


    return text.replace(target, replacement);
  }







}
