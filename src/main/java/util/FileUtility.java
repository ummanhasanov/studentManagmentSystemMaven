/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Umman Hasan
 */
public class FileUtility
{

    public static Object readFileDeserialize(String name) {
        Object obj = null;
        // name -den istifade ederek FileInputStream duzelir ve bunu gonderirik ObjectInputStream-e
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
            obj = in.readObject();
        } finally {
            return obj;
        }

    }

// Serializable olmalidi mutleq obyektini gonderirik ve faylin adini gonderirik ki, bu fayla yaz
    public static void writeObjectToFile(Object object, String name) throws Exception {

        try ( // faylin adindan FileOutputStream  duzeldir
                 FileOutputStream fout = new FileOutputStream(name); // fout-dan da bir ObjectOutputStream duzeldir
                  ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            // ObjectOutputStream deyirik object-i write ele
            oos.writeObject(object);
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }

    }

}
