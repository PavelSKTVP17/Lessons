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
public class MusicManager implements IManager
{
    private static MusicManager instance;
    private MusicManager()
    {  instance=this; }
    public static MusicManager Instance()
    {
        return (instance!=null)? instance : new MusicManager();
    }
    @Override
    public void Run() {
        System.out.println(" MusicMgr Starting");
    }

    @Override
    public void Finish() {
        System.out.println(" MusicMgr Finishing");
    }

    @Override
    public String SomeFunction() {
        return " MusicMgr plays some music";
    }
    
}