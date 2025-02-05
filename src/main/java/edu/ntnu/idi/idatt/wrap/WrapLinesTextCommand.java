package edu.ntnu.idi.idatt.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {


  public WrapLinesTextCommand(String opening, String closing) {
    super(opening, closing);
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null or blank");
    }
    StringBuilder sb = new StringBuilder();
    String[] split_text = text.split(" ");

    for (String word : split_text) {
      sb.append(opening).append(word).append(closing).append(" ");
    }

    return sb.toString().trim();
  }

}

