package edu.ntnu.idi.idatt.capitalize;


public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    if(text == null || text.isBlank()) {
      throw new IllegalArgumentException("text can not be null or blank");
    }
    StringBuilder sb = new StringBuilder();
    String[] split_text = text.split("\\s+");

    for (String word : split_text) {
      sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
    }

    return sb.toString().trim();
  }

}
