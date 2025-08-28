package co.edu.unac.oop2.downloads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<File> testFiles = createFiles();

        System.out.println("Insert file name to download: ");
        String filename = sc.next();

        List<File> fileSearch =  testFiles.stream()
                .filter(f -> f.getName().contains(filename))
                .collect(Collectors.toList());

        if (fileSearch.size() > 0) {
            fileSearch.forEach(f -> {
                Download download = new Download(f);
                download.start();
            });
        } else {
            System.out.println("File not found");
        }
    }

    private static List<File> createFiles() {
        List<File> files = new ArrayList<File>();
        files.add(new File("MyFavoriteSong.mp3", 650));
        files.add(new File("Exams.docx", 424));
        files.add(new File("Notes.txt", 885));
        return files;
    }
}
