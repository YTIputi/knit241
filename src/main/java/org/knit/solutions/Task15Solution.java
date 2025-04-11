package org.knit.solutions;

import org.knit.solutions.task15.*;
import org.knit.TaskDescription;

//Задача:
//Создайте удаленную библиотеку изображений.
//
//При запросе изображения оно загружается с сервера (имитация через задержку в коде).
//Картинка хранится как объект класса RealImage.
//Прокси-объект ImageProxy должен лениво загружать изображение и кэшировать его для повторного использования.
//        📌 Подсказка:
//ImageProxy должен проверять, создан ли объект RealImage. Если нет — создавать его.

@TaskDescription(taskNumber = 15, taskDescription = "Задача 15 на паттерн Прокси (Proxy)", href = "org.knit.solutions.task15")
public class Task15Solution implements Solution{
    public void execute() {
        Image image = new ImageProxy("landscape.jpg");

        // Первое обращение - загрузка с сервера
        System.out.println("Первый вызов display():");
        image.display();

        // Второе обращение - уже без загрузки
        System.out.println("\nВторой вызов display():");
        image.display();
    }
}
