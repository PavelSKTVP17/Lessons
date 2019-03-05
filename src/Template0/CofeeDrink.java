/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template0;

/**
 *
 * @author user
 */
public class CofeeDrink extends DrinkTemplate
{
    @Override
    public void prepareRecipe() 
    {
        boilWater();
        steepCofeeSpoon();
    }
    private void boilWater()
    {
        System.out.println("Boiling Water");
    }
    private void steepCofeeSpoon()
    {
        System.out.println("Steeping cofee spoon");
    }
}
