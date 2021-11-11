package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcess {
    protected String getDateFromFile(String fileName) {
        String result = null;
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            result = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected void saveDateToFile(String fileName, String dateToSave) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(dateToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
