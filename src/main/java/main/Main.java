/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bean.Config;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import myannotation.Student;
import myannotation.Teacher;
import bean.WritingStyle;
import util.MenuUtil;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) throws Exception {
//        Teacher t = new Teacher();
//        
//        Student[] ss = {new Student()};
//        t.setTeacherStudents(ss);
//
//        checkObjectNotNull(t);

        Config.initialize();
        MenuUtil.showMenu();
    }

    public static void checkObjectNotNull(Object obj) throws Exception {
        // Teacher-in icinde ozum yazdigim method-lar
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];

            Annotation[] anns = m.getAnnotations();

            System.out.println(methods[i].getName());

            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                if (ann.annotationType() == WritingStyle.class) {
                    Object result = m.invoke(obj);
                    if (result == null) {
                        throw new IllegalArgumentException("Dedim axi bosh olmasin....");
                    }
                    if (result instanceof Object) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("Dedim axi bosh olmasin arr....");
                        }
                    }
                }
                System.out.println("ann=" + ann.annotationType());
            }
            System.out.println("---------------");
        }
    }
}
