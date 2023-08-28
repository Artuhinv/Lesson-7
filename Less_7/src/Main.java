import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> usersList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя:");
            String name = in.nextLine();

            System.out.println("Введите возраст пользователя:");
            int age = in.nextInt();
            in.nextLine();

            User user = new User(name, age);
            usersList.add(user);
        }

        Collections.sort(usersList, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        System.out.println("Список пользователей:");
        for (User user : usersList) {
            System.out.println(user.toString());
        }
    }
}
