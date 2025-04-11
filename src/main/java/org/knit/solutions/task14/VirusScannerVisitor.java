package org.knit.solutions.task14;

public class VirusScannerVisitor implements Visitor {
    @Override
    public void visit(File file) {
        System.out.println("Сканирование файла '" + file.getName() + "' на вирусы...");
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Сканирование папки '" + folder.getName() + "'...");
    }

    @Override
    public void visit(Link link) {
        System.out.println("Пропуск ссылки '" + link.getName() + "' при сканировании.");
    }
}
