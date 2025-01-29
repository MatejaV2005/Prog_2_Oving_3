package edu.ntnu.idi.idatt.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

  // Constructor inherits
  public WrapLinesTextCommand(String opening, String closing) {
    super(opening, closing);
  }

  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] split_text = text.split(" ");

    for (String word : split_text) {
      sb.append(opening).append(word).append(closing);
    }

    return sb.toString();
  }
}
