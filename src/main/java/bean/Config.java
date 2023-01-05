/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author Umman Hasan
 */
public class Config implements Serializable
{

    private static Config config = null;
    private static final String fileName = "app.obj";
    private static boolean loggedIn;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];

    public static void initialize() throws Exception {
        Object obj = FileUtility.readFileDeserialize(fileName);
        if (obj == null) {
            return;
        }

        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() throws Exception {
        FileUtility.writeObjectToFile(Config.instance(), fileName);

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void appendStudent(Student s) {
        //her defe yeni array duzeldir +1 edir
        Student[] newStudents = new Student[students.length + 1];

        //kohne arrayi teze arraya kopyalayir
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }

        // teze arrayin en sonuncu elementine Student s-i set edir
        newStudents[newStudents.length - 1] = s;

        // students-e yeni arrayi otuzdurur
        students = newStudents;
    }

    public void appendTeacher(Teacher t) {
        //her defe yeni array duzeldir +1 edir
        Teacher[] newTeachers = new Teacher[teachers.length + 1];

        //kohne arrayi teze arraya kopyalayir
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }

        // teze arrayin en sonuncu elementine Teacher t-i set edir
        newTeachers[newTeachers.length - 1] = t;

        // students-e yeni arrayi otuzdurur
        teachers = newTeachers;
    }

    public static Config instance() {// singleton pattern
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

}
