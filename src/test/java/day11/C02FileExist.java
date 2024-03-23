package day11;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class C02FileExist {
   // public static void main(String[] args) {
    //    Files.exists(Path.of("C:","Users","salha","Downloads", "unnamed.png"));
    //    Files.exists(Path.of("/Users/salha/IdeaProjects/SDA2024_Selenium/FileExist"));


    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String sepertor = FileSystems.getDefault().getSeparator();
        System.out.println("userDir = " + userDir);
        System.out.println("sepertor = " + sepertor);


        String path =userDir + sepertor + "FileExist";

        System.out.println("path = " + path);
        boolean isExists =Files.exists(Path.of(path));
        System.out.println("isExists = " + isExists);
    }

    }
