/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorra;

/**
 *
 * @author user
 */
public class DeveloperDecorator implements Developer
{
    Developer devp;
    public DeveloperDecorator( Developer dv)
    {
        devp=dv;
    }

    @Override
    public String MakeJob() {
        return devp.MakeJob();
    }
}
