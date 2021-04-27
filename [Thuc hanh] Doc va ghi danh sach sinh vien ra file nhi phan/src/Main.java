import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Johnny Stimson", "Flower"));
        studentList.add(new Student(2, "Ed Sheeran", "Make It Rain"));

        writeFileObject(studentList);

        List<Student> students = readFileObject(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(students);
        }


    }

    private static List<Student> readFileObject(List<Student> studentList) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) ois.readObject();
            fileInputStream.close();
            ois.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    private static void writeFileObject(List<Student> studentList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(studentList);
            oos.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
