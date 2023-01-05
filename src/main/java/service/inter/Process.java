/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.inter;

/**
 *
 * @author Umman Hasan
 */
public interface Process
{
  public default void process(){
        processLogic();
    }
    // default olaraq => public abstract void process();
    public abstract void processLogic();
}
