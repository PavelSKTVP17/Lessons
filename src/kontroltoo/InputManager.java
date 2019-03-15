/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroltoo;

/**
 *
 * @author user
 */
public class InputManager implements IManager
{
    private static InputManager instance;
    private InputManager()
    {  instance=this; }
    public static InputManager Instance()
    {
        return (instance!=null)? instance : new InputManager();
    }
    @Override
    public void Run() {
        System.out.println(" InputMgr Starting");
    }

    @Override
    public void Finish() {
        System.out.println(" InputMgr Finishing");
    }

    @Override
    public String SomeFunction() {
        return " InputMgr tracks user input";
    }
    
}