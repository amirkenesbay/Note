import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> note = new ArrayList<String>();

        int count;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу \n" +
                    "0. Выход");
            count = Integer.parseInt(scanner.nextLine());
            switch (count){
                case 1:
                    System.out.println("Введите задачу для планирования");
                    note.add(scanner.nextLine());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Весь список задач для планирования: ");
                    System.out.println(String.join("\n", note));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Выберите номер задачи которую хотите удалить");
                    int indexInput = Integer.valueOf(scanner.nextLine());
                    note.remove(indexInput);
                    break;
                case 0:
                    break;
                default:
                    String inputFinish = String.valueOf(count);
                    if (inputFinish.equals("Finish")){
                        System.out.println("Завершения задачи");
                    }
                    break;
            }
        }
    }
}
