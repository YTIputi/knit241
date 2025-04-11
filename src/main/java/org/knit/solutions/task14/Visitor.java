package org.knit.solutions.task14;

interface Visitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Link link);
}