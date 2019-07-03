import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toMap;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> studentAndPoints = new LinkedHashMap<>();
        Map<String, Integer> coursesAndOccurrences = new HashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("exam finished")) {
            String[] tokens = line.split("-");
            String student = tokens[0];

            if (!tokens[1].equals("banned")) {
                String course = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if (!studentAndPoints.containsKey(student)) {
                    studentAndPoints.put(student, new ArrayList<>());
                    List<Integer> list = studentAndPoints.get(student);
                    list.add(points);
                    Collections.sort(list);
                } else if (studentAndPoints.containsKey(student)) {
                    List<Integer> list = studentAndPoints.get(student);
                    list.add(points);
                    Collections.sort(list);
                }
                if (!coursesAndOccurrences.containsKey(course)) {
                    coursesAndOccurrences.put(course, 1);
                } else if (coursesAndOccurrences.containsKey(course)) {
                    coursesAndOccurrences.put(course, coursesAndOccurrences.get(course) + 1);
                }

            } else {
                studentAndPoints.remove(student);
            }
            line = scanner.nextLine();
        }

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Integer>> entry : studentAndPoints.entrySet()){
            String student = entry.getKey();
            List<Integer> points = entry.getValue();

            int bestScore = 0;

            for (int i = 0; i < points.size(); i++) {
                if (points.get(i) > bestScore) {
                    bestScore = points.get(i);
                }
            }
            sortedMap.put(student, bestScore);

        }

        Map<String, Integer> sortedReagents = sortedMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                System.out.println("Results:");

        for (Map.Entry<String, Integer> entry : sortedReagents.entrySet()) {
            String student = entry.getKey();
            int points = entry.getValue();
            int bestScore = 0;

            System.out.printf("%s | ", student);
            for (int i = 0; i < 1; i++) {
                System.out.println(points);
            }
        }

        System.out.println("Submissions:");

        for (Map.Entry<String, Integer> entry : coursesAndOccurrences.entrySet()) {
            String course = entry.getKey();
            int occurrence = entry.getValue();

            System.out.println(course + " - " + occurrence);
        }

    }
}
