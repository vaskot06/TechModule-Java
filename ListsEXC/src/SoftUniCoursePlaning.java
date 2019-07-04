import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialCourse = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        boolean flag = false;

        while (true) {
            String commands = scanner.nextLine();
            int firstIndex = 0;
            int secondIndex = 0;
            int indexLesson = 0;

            if (commands.equals("course start")) {
                break;
            }

            String[] tokens = commands.split(":");
            String cmd = tokens[0];
            if (cmd.equals("Exercise")) {
                flag = true;
            }
            if (!initialCourse.contains(tokens[1])) {
                if (cmd.equals("Add")) {
                    String subjectName = tokens[1];
                    initialCourse.add(tokens[1]);
                } else if (cmd.equals("Insert")) {
                    String subjectName = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    initialCourse.add(index, subjectName);
                } else if (cmd.equals("Exercise")) {
                    String subjectName = tokens[1];

                    if (initialCourse.contains(subjectName)) {
                        indexLesson = initialCourse.indexOf(tokens[1]);
                        initialCourse.add(indexLesson + 1, subjectName + "-Exercise");
                    } else if (!initialCourse.contains(subjectName)) {
                        indexLesson = initialCourse.indexOf(tokens[1]);
                        initialCourse.add(subjectName);
                        initialCourse.add(subjectName + "-Exercise");
                    }
                }
            } else if (initialCourse.contains(tokens[1])) {
                if (cmd.equals("Remove")) {
                    String subjectName = tokens[1];


                    if (flag==true) {
                        initialCourse.remove(subjectName);
                        if (initialCourse.contains(subjectName)) {
                            for (int i = 0; i < initialCourse.size(); i++) {
                                if (initialCourse.contains(subjectName)) {
                                    indexLesson = initialCourse.indexOf(tokens[1]);
                                }
                            }
                        }
                        initialCourse.remove(indexLesson + 1);
                    }else if (flag == false){
                        initialCourse.remove(subjectName);
                    }
                } else if (cmd.equals("Swap")) {

                    String subjectNameFirst = tokens[1];
                    String subjectNameSecond = tokens[2];

                    if (initialCourse.contains(subjectNameFirst)) {
                        for (int i = 0; i < initialCourse.size(); i++) {
                            if (initialCourse.contains(subjectNameFirst)) {
                                firstIndex = initialCourse.indexOf(tokens[1]);
                            }
                        }
                    }
                    if (initialCourse.contains(subjectNameSecond)) {
                        for (int i = 0; i < initialCourse.size(); i++) {
                            if (initialCourse.get(i).equals(subjectNameSecond)) {
                                secondIndex = initialCourse.indexOf(tokens[2]);
                            }
                        }
                    }

                    if (flag == false) {
                        Collections.swap(initialCourse, firstIndex, secondIndex);
                    } else if (flag == true) {
                        Collections.swap(initialCourse, firstIndex, secondIndex + 1);
                        Collections.swap(initialCourse, firstIndex + 1, secondIndex);
                        Collections.swap(initialCourse, firstIndex, secondIndex - 1);
                    }

                } else if (cmd.equals("Exercise")) {
                    String subjectName = tokens[1];

                    if (initialCourse.contains(subjectName)) {
                        indexLesson = initialCourse.indexOf(tokens[1]);
                        initialCourse.add(indexLesson + 1, subjectName + "-Exercise");
                    } else if (!initialCourse.contains(subjectName)) {
                        initialCourse.add(subjectName);
                        initialCourse.add(subjectName + "-Exercise");
                    }
                }
            }
        }
        for (int i = 0; i < initialCourse.size(); i++) {
            System.out.println(i + 1 + "." + initialCourse.get(i));
        }
    }

}


