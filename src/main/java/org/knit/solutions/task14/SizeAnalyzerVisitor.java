package org.knit.solutions.task14;

public class SizeAnalyzerVisitor implements Visitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        // Ничего не делаем напрямую, так как обход уже есть в accept()
    }

    @Override
    public void visit(Link link) {
        // Ссылки не учитываются в размере
    }
}
