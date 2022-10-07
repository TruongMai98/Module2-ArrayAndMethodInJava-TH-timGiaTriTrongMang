import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("position of the student in the list '" + inputName + "' is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("not found '" + inputName + "'as in the list");
        }
    }
}