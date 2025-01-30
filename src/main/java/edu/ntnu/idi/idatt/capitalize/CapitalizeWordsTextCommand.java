package edu.ntnu.idi.idatt.capitalize;


public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] split_text = text.split(" ");

    for (String word : split_text) {
      sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
    }

    return sb.toString();
  }

}
