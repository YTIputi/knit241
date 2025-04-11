package org.knit.solutions.task15;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Загрузка " + filename + " с сервера...");
        try {
            Thread.sleep(2000); // имитация задержки
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Изображение " + filename + " загружено.");
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}