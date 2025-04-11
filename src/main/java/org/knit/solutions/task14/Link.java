package org.knit.solutions.task14;

public class Link implements FileSystemElement {
    private final String name;
    private final FileSystemElement target;

    public Link(String name, FileSystemElement target) {
        this.name = name;
        this.target = target;
    }

    public FileSystemElement getTarget() {
        return target;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}