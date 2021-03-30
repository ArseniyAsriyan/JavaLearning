package FlirtWithFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Experimental {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> listOfStrings = new ArrayList<>();
        String text = null;
        System.out.println("Вводите свою очень важную хрень, пока не надоест, а когда надоест, наберите \"exit\"");
        while (true) {
            try {
                text = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(text.equals("exit")) break;
            listOfStrings.add(text);
        }
        System.out.println("И вот это вы хотите сохранить? Да/Нет: ");
        String desigion = "";
        while (true) {
            try {
                desigion = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (desigion.equals("Нет")) break;
            if (desigion.equals("Да")) break;
        }
        if (desigion.equals("Нет")) {
            System.out.println("Ну, тогда у меня всё, пока!");
        } else if (desigion.equals("Да")){
            System.out.println("Укажите путь, по которому необходимо сохранить ваше творчество: ");
            String path = null;
            try {
                path = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            writeToFile(listOfStrings, path);
        }


    }
    public static void writeToFile(List<String> list, String path) {
        try {
            if (!Files.exists(Path.of(path))) {
                Files.createFile(Path.of(path));
            }
            Files.write(Path.of(path), list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void FileReWriter(String pathFrom, String pathTo) {
        try (FileInputStream fis = new FileInputStream(pathFrom);
             FileOutputStream fos = new FileOutputStream(pathTo)) {
            BufferedInputStream bis = new BufferedInputStream(fis);

            while(true) {
                try {
                    if (!(bis.available() > 0)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                byte[] tempArray = new byte[1000];
                int size = 0;
                try {
                    size = bis.read(tempArray);
                    fos.write(tempArray, 0, size);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException i) {

        }
        System.out.println("Метод копипасты завершил свою работу.");
    }

}
