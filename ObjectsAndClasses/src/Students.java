import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static class Student{
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!line.equals("end")){
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            String age = tokens[2];
            String hometown = tokens[3];

            Student student = new Student(firstName, lastName, age,hometown);

            students.add(student);

            line = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : students){
            if (student.hometown.equals(city)){
                System.out.printf("%s %s is %s years old%n", student.firstName, student.lastName, student.age);
            }
        }
    }
}
