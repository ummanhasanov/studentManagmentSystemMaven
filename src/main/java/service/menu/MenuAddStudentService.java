/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.menu.MenuAddStudentServiceInter;

/**
 *
 * @author Umman Hasan
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter
{

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter school name");
        String schoolName = sc4.nextLine();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("enter schoolarship");
        double scholarship = sc5.nextDouble();

        Student s = new Student();

        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolName(schoolName);
        s.setScholarship(scholarship);

        Config.instance().appendStudent(s);
        System.out.println("Student added");
        
    }

}
