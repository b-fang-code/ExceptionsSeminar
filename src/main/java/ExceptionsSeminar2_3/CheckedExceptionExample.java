package ExceptionsSeminar2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.IOException;
/*
public class CheckedExceptionExample {
    public static void main(String[] args) throws IOException {
        throw new IOException("Пример проверяемого исключения");
    }
}
 */

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFromFile("example.txt"); // Ошибка: файл не найден
        } catch (FileNotFoundException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        System.out.println("Файл найден!");
    }
}
