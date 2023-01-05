/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.menu.MenuAddTeacherServiceInter;


/**
 *
 * @author Umman Hasan
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter
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
        System.out.println("enter salary");
        double salary = sc5.nextDouble();

        Teacher t = new Teacher();

        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        t.setSchoolName(schoolName);
        t.setSalary(salary);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");

    }
}
