package org.knit.solutions.task16;

public class TextStyle {
    private final String font;
    private final int size;

    public TextStyle(String font, int size) {
        this.font = font;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Стиль[шрифт=" + font + ", размер=" + size + "]";
    }
}
