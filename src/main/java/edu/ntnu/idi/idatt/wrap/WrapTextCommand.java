  package edu.ntnu.idi.idatt.wrap;

  import edu.ntnu.idi.idatt.TextCommand;

  public class WrapTextCommand implements TextCommand {
    protected String opening;
    protected String closing;

    // Constructor
    public WrapTextCommand(String opening, String closing) {
      setOpening(opening);
      setClosing(closing);
    }

    // Getter methods
    public String getOpening() {
      return opening;
    }

    public String getClosing() {
      return closing;
    }

    // Setter methods
    private void setOpening(String opening) {
      if (opening == null || opening.isBlank()) {
        throw new IllegalArgumentException("Opening cannot be null or blank");
      }
      this.opening = opening;
    }

    private void setClosing(String closing) {
      if (closing == null || closing.isBlank()) {
        throw new IllegalArgumentException("Closing cannot be null or blank");
      }
      this.closing = closing;
    }

    // Execute method
    @Override
    public String execute(String text) {
      if (text == null || text.isBlank()) {
        throw new IllegalArgumentException("text cannot be null or blank");
      }
      return getOpening() + " " + text + " " + getClosing();
    }
  }
