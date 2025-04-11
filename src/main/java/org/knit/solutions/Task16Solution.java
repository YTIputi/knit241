package org.knit.solutions;

import org.knit.solutions.task16.*;
import org.knit.TaskDescription;

//Задача:
//Реализуйте систему отображения символов текста на экране.
//
//        Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
//Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
//📌 Подсказка:
//Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.

@TaskDescription(taskNumber = 16, taskDescription = "Задача 16 на паттерн Приспособленец (Flyweight)\n", href = "org.knit.solutions.task16")
public class Task16Solution implements Solution{
    public void execute() {
        CharacterFactory factory = new CharacterFactory();
        TextStyle style = new TextStyle("Arial", 12);

        String text = "hello world";

        int x = 0;
        for (char c : text.toCharArray()) {
            CharacterFlyweight character = factory.getCharacter(c);
            character.render(x, 10, style); // внешнее состояние: координаты + стиль
            x += 10;
        }
    }
}
