package L01_Working_with_Abstraction.Lab.P03_Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsInfo;

    public StudentSystem() {
        this.studentsInfo = new HashMap<>();
    }

    public Map<String, Student> getStudentsInfo() {
        return this.studentsInfo;
    }

    public void ParseCommand(String[] studentData) {
        String command = studentData[0];

        if (command.equals("Create")) {
            String name = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            double grade = Double.parseDouble(studentData[3]);

            createStudent(name, age, grade);
        }

        else if (command.equals("Show")) {
            String name = studentData[1];

            Student student = findStudentByName(name);

            if (student != null)
                showStudentInfo(student);
        }
    }

    public void createStudent(String name, int age, double grade) {
        studentsInfo.putIfAbsent(name, new Student(name, age, grade));
    }

    public void showStudentInfo(Student student){
        System.out.println(student.toString());
    }

    public Student findStudentByName(String name){
        if (studentsInfo.containsKey(name)){
            return studentsInfo.get(name);
        }

        return null;
    }
}
