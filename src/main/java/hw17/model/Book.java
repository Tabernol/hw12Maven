package hw17.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@Data
@AllArgsConstructor
@Builder
public class Book extends Library {
    String author;
    String nameOfBook;
    String text;

    public void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write author");
        author = scanner.nextLine();
        System.out.println("Write name of book");
        nameOfBook = scanner.nextLine();
        Path pathToBook = Paths.get(author + "_" + nameOfBook + ".txt");
        try {
            Files.createFile(directory.resolve(pathToBook));
            System.out.println("Book was add");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(String line) {
        if (catalog.containsKey(line)) {
            try {
                Files.delete(Paths.get(String.valueOf(directory.resolve(line + ".txt"))));
                System.out.println("Book was delete");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            startMyLibrary();
        }
    }
}
