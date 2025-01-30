package edu.ntnu.idi.idatt.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    return text.replace(selection, selection.substring(0, 1).toUpperCase() + selection.substring(1));
  }
}
