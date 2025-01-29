package edu.ntnu.idi.idatt.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand{

  public WrapSelectionTextCommand(String opening, String closing) {
    super(opening, closing);
  }

  @Override
  public String execute(String text) {
    StringBuilder sb = new StringBuilder();
    String[] split_text = text.split(" ");

    for (String word : split_text) {
      sb.append(opening).append(word).append(closing);
    }

    return sb.toString();
  }

}
