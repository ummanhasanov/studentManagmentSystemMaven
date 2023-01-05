/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.inter;

import bean.Config;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Umman Hasan
 */
public interface SaveableProcess extends Process
{
 
    @Override
    public default void process(){
        try {
            processLogic();
            Config.save();
        } catch (Exception ex) {
            Logger.getLogger(SaveableProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
 
}
