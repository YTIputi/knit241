package org.knit.solutions;
import org.knit.solutions.task14.*;

import org.knit.TaskDescription;

//Задача:
//Создайте систему управления файловыми объектами.
//Есть три типа файловых объектов:
//
//Файлы,
//Папки,
//Ссылки (ярлыки).
//Требуется реализовать два посетителя:
//
//        Сканер вирусов, который проверяет каждый файл на наличие вирусов.
//        Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
//        📌 Подсказка:
//        Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.

@TaskDescription(taskNumber = 14, taskDescription = "Задача 14 на паттерн Визитер (Visitor)", href = "org.knit.solutions.task14")
public class Task14Solution implements Solution{
    public void execute() {
        File file1 = new File("document.txt", 100);
        File file2 = new File("photo.jpg", 500);
        Folder folder = new Folder("MyFolder");
        folder.addElement(file1);
        folder.addElement(file2);

        Link shortcut = new Link("shortcut to document", file1);

        Folder root = new Folder("Root");
        root.addElement(folder);
        root.addElement(shortcut);

        // Визитер 1: Сканер вирусов
        System.out.println("Сканирование на вирусы:");
        VirusScannerVisitor virusScanner = new VirusScannerVisitor();
        root.accept(virusScanner);

        // Визитер 2: Анализ размера
        System.out.println("Анализ размера:");
        SizeAnalyzerVisitor sizeAnalyzer = new SizeAnalyzerVisitor();
        root.accept(sizeAnalyzer);
        System.out.println("Общий размер файлов: " + sizeAnalyzer.getTotalSize() + " байт");
    }
}