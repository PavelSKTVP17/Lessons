
package Template0;

/**
 *
 * @author user
 */
public class TeaDrink extends DrinkTemplate
{
    @Override
    public void prepareRecipe() 
    {
        boilWater();
        steepTeaBag();
    }
    private void boilWater()
    {
        System.out.println("Boiling Water");
    }
    private void steepTeaBag()
    {
        System.out.println("Steeping the tea");
    }
}
