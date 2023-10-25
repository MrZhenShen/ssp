package oop;

public class Button {

  String text;
  double fontSize = 12.0;
  int borderWidth = 1;
  String borderColor = "red";
  String borderType = "solid";
  String bgColor = "blue";

  @Override
  public String toString() {
    return String.format("""
                    Button parameters:
                    1. Text: %s
                    2. Font Size: %spx
                    3. Border: %spx %s %s
                    4. Background color: %s""",
            text, fontSize, borderWidth, borderColor, borderType, bgColor
    );
  }
}
