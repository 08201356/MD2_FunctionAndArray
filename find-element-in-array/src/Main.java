import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camilla","Siema","Tanya","Connor","Zachariah","Mallory","Zoe","Emily"};
        System.out.print("Enter a student's name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
    }
}