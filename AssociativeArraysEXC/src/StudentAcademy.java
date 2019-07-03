import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsAndGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsAndGrades.containsKey(studentName)) {
                studentsAndGrades.put(studentName, new ArrayList<>());
                studentsAndGrades.get(studentName).add(grade);
            } else {
                studentsAndGrades.get(studentName).add(grade);
            }
        }

        Map<String, Double> avgStudents = new LinkedHashMap<>();
        for (String name : studentsAndGrades.keySet()){
            double sum = 0;
            for (int i = 0; i < studentsAndGrades.get(name).size(); i++) {
                sum += studentsAndGrades.get(name).get(i);
            }
            double average = sum / studentsAndGrades.get(name).size();

            if (average >= 4.50) {
                avgStudents.put(name,average);
            }
        }
        avgStudents.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue()
                .reversed()).forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
