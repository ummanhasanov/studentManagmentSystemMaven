/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myannotation;

import bean.WritingStyle;
import lombok.SneakyThrows;

/**
 *
 * @author Umman Hasan
 */
public class Teacher
{

    @WritingStyle
    private String teacherSchoolName;
    private double teacherSalary;
    private Student[] TeacherStudents;

    @SneakyThrows
    public void foo(int a) {
        if(a>9){
            throw new Exception();
        }
        
    }
    
    
    
    public String getTeacherSchoolName() {
        return teacherSchoolName;
    }

    public void setTeacherSchoolName(String teacherSchoolName) {
        this.teacherSchoolName = teacherSchoolName;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public Student[] getTeacherStudents() {
        return TeacherStudents;
    }

    public void setTeacherStudents(Student[] TeacherStudents) {
        this.TeacherStudents = TeacherStudents;
    }


}
