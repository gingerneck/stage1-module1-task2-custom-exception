package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        var res = Student.getValueOf(studentID);
        if (res == null) {
            throw new StudentNotFoundException(studentID);
        }
        return res;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }

    }
}