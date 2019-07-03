import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String> > classesAndStudents = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] tokens = line.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            if (!classesAndStudents.containsKey(courseName)){
                classesAndStudents.put(courseName, new ArrayList<>());
            }
            List<String> studentsName = classesAndStudents.get(courseName);
            studentsName.add(studentName);
            Collections.sort(studentsName);

            line = scanner.nextLine();
        }

        LinkedHashMap<String, String> courses = new LinkedHashMap<>();

        for (String course : classesAndStudents.keySet()) {
            String name = "";
            for (int i = 0; i < classesAndStudents.get(course).size(); i++) {
                if (!courses.containsKey(course)){
                    courses.put(course,name);
                }
                name = classesAndStudents.get(course).get(i);
                courses.put(course, name);
            }

        }

        Map<String, List<String>> sorted = classesAndStudents.entrySet().stream()
                .sorted(Comparator.comparingInt((Map.Entry<String, List<String>>x)-> x.getValue().size())
                        .reversed()).collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b) -> {throw new AssertionError();},LinkedHashMap::new));



        for (Map.Entry<String, List<String>> entry : sorted.entrySet()){
            String className = entry.getKey();
            List<String> stundets = entry.getValue();
            System.out.println(className + ": " + stundets.size());

            for(int i = 0; i < stundets.size(); i++){
                System.out.println("-- "+ stundets.get(i));
            }
        }
    }
}
