import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[651];
            int lenght;
            while ((lenght = is.read(buffer)) > 0){
                os.write(buffer, 0, lenght);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            is.close();
            os.close();
        }
    }

    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//C:\Users\hieu\Java project\17. IO Binary File & Serialization\[Thuc hanh] Copy cac file co dung luong lon\Text
//C:\Users\hieu\Java project\17. IO Binary File & Serialization\[Thuc hanh] Copy cac file co dung luong lon\CopyText

//        System.out.printf("Enter source file:");
        String sourcePath = "C:\\Users\\hieu\\Java project\\17. IO Binary File & Serialization\\" +
                "[Thuc hanh] Copy cac file co dung luong lon\\Text.txt";
//        System.out.printf("Enter destination file:");
        String destPath1 = "C:\\Users\\hieu\\Java project\\17. IO Binary File & Serialization\\" +
                "[Thuc hanh] Copy cac file co dung luong lon\\CopyText.txt";
        String destPatht2 = "C:\\Users\\hieu\\Java project\\17. IO Binary File & Serialization\\" +
                "[Thuc hanh] Copy cac file co dung luong lon\\CopyText1.txt";
        File sourceFile = new File(sourcePath);
        File destFile1 = new File(destPath1);
        File destFile2 = new File(destPatht2);
        try {
            copyFileUsingJava7Files(sourceFile, destFile1);
            System.out.println("Copy File Using Java 7 Files completed");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.printf(e.getMessage());
        }

        try {
            copyFileUsingStream(sourceFile, destFile2);
            System.out.println("Copy File Using Stream completed");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.printf(e.getMessage());
        }
    }

}
