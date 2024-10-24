import java.io.*;
import java.util.Scanner;

public class FileSystem {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/rian/file.txt");

        if (!file.exists())
            throw new FileNotFoundException("File not exist");
        else file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            fileOutputStream.write(input.toString().getBytes());
        }

        fileOutputStream.close();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = fileInputStream.readAllBytes();
        fileInputStream.close();

        String text = new String(bytes);
        System.out.println("Conteúdo do arquivo: ");
        System.out.println(text);
    }
}
