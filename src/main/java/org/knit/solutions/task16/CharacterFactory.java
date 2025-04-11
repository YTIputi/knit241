package org.knit.solutions.task16;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<Character, CharacterFlyweight> cache = new HashMap<>();

    public CharacterFlyweight getCharacter(char c) {
        if (!cache.containsKey(c)) {
            cache.put(c, new ConcreteCharacter(c));
        }
        return cache.get(c);
    }
}