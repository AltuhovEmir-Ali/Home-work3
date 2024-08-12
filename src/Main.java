import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("users.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Свое Имя: ");
        String name = scanner.nextLine();
        System.out.println("Ведите Свой Возрост: ");
        int age = scanner.nextInt();
        fileWriter.write( name + ":" + age);
        fileWriter.close();
        }

    }
