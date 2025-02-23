package StudentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentRepo;

    public StudentSystem() {
        this.studentRepo = new HashMap<>();
    }

    public Map<String, Student> getStudentRepo() {
        return this.studentRepo;
    }

    public void parseCommand(String[] args) {
        String command = args[0];
        String name = args[1];

        if (command.equals("Create")) {
            var age = Integer.parseInt(args[2]);
            var grade = Double.parseDouble(args[3]);

            studentRepo.putIfAbsent(name, new Student(name, age, grade));

        } else if (command.equals("Show")) {
            if (studentRepo.containsKey(name)) {
                Student student = studentRepo.get(name);
                System.out.println(student);
            }
        }
    }

}
