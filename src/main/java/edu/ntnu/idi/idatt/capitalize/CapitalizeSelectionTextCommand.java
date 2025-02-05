package edu.ntnu.idi.idatt.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    if (selection == null || selection.isBlank()) {
      throw new IllegalArgumentException("selection cant be null or blank");
    }

    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (!text.contains(getSelection())) {
      throw new IllegalArgumentException("chosen selection is not in the text");
    }
    return text.replace(selection, selection.substring(0, 1).toUpperCase() + selection.substring(1));
  }
}
