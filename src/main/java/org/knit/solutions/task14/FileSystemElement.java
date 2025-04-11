package org.knit.solutions.task14;

interface FileSystemElement {
    void accept(Visitor visitor);
    String getName();
}