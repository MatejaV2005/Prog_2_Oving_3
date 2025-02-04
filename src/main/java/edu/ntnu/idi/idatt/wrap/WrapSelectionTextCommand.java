package edu.ntnu.idi.idatt.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  public WrapSelectionTextCommand(String opening, String closing, String selection) {
    super(opening, closing);
    setSelection(selection);
  }

  private void setSelection(String selection) {
    if (selection == null || selection.isBlank()) {
      throw new IllegalArgumentException("Selection cannot be null or blank");
    }
    this.selection = selection;
  }

  // Getter for selection
  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null or blank");
    }

    return text.replace(getSelection(), opening + selection + closing);
  }
}

