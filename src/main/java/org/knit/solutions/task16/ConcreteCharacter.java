package org.knit.solutions.task16;

public class ConcreteCharacter implements CharacterFlyweight {
    private final char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(int x, int y, TextStyle style) {
        System.out.println("Символ '" + symbol + "' отрисован в (" + x + ", " + y + ") с " + style);
    }
}
