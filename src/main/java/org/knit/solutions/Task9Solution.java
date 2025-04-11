package org.knit.solutions;
import org.knit.solutions.task9.Part;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.knit.TaskDescription;

//Описание задачи
//На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:
//
//Штамповщик – вырезает заготовку (создает объект детали).
//Сборщик – собирает из заготовки готовую деталь.
//Оператор контроля качества – проверяет деталь и отправляет на склад.
//Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.
//
//Требования к решению
//Использовать потоки (Thread или ExecutorService).
//Использовать синхронизацию (wait(), notify(), BlockingQueue).
//Реализовать конвейерную передачу данных между потоками.

@TaskDescription(taskNumber = 9, taskDescription = "Задача «Конвейер сборки деталей»", href = "org.knit.solutions.task9")
public class Task9Solution implements Solution{
    private static final int MAX_PARTS = 10;

    public void execute() {
        BlockingQueue<Part> queue1 = new LinkedBlockingQueue<>();
        BlockingQueue<Part> queue2 = new LinkedBlockingQueue<>();

        // Поток Штамповщика
        Thread stamper = new Thread(() -> {
            for (int i = 1; i <= MAX_PARTS; i++) {
                Part part = new Part(i);
                try {
                    queue1.put(part);
                    System.out.println("Штамповщик: Заготовка " + part.getId() + " создана");
                    Thread.sleep(100); // для наглядности
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Поток Сборщика
        Thread assembler = new Thread(() -> {
            for (int i = 1; i <= MAX_PARTS; i++) {
                try {
                    Part part = queue1.take();
                    Thread.sleep(100); // Эмуляция обработки
                    queue2.put(part);
                    System.out.println("Сборщик: Заготовка " + part.getId() + " обработана");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Поток Контроля качества
        Thread qualityControl = new Thread(() -> {
            for (int i = 1; i <= MAX_PARTS; i++) {
                try {
                    Part part = queue2.take();
                    Thread.sleep(100); // Эмуляция проверки
                    System.out.println("Оператор контроля: Деталь " + part.getId() + " проверена и отправлена на склад");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Запуск всех потоков
        stamper.start();
        assembler.start();
        qualityControl.start();
    }
}
