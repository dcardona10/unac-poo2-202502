package co.edu.unac.oop2.downloads;

import java.util.Random;

public class Download extends Thread {

    private File file;

    public Download(File file) {
        this.file = file;
    }

    public void run() {
        System.out.println("Starting download: " + this.file.getName() + "...");
        double downloaded = 0;
        double progress = 0;
        double total = this.file.getSize();
        while (downloaded < total) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            downloaded += total / getRandomInterval();
            if (downloaded > total) downloaded = total;
            progress = (downloaded * 100) / total;
            System.out.println("Downloading " + this.file.getName() + ": " + Math.round(downloaded) + "MB (" + Math.round(progress) + "%)");
        }
        System.out.println("Download: " + this.file.getName() + " completed");
    }

    private int getRandomInterval() {
        Random rand = new Random();
        int min = 10;
        int max = 20;
        return rand.nextInt(max - min + 1) + min;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
