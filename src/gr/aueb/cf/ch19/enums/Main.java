package gr.aueb.cf.ch19.enums;

public class Main {
    public static void main(String[] args) {
        userRole roleStudent = userRole.STUDENT;
        String strRole = roleStudent.name();
        System.out.println(strRole);

        userRole role = userRole.valueOf(strRole);
    }
}
