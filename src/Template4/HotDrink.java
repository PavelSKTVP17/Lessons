
package Template4;


public abstract class HotDrink 
{
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        if( cutomerWantsIngridients() ) addIngridients();
    }
    abstract void brew();

    abstract void addIngridients();
  
    public void boilWater()
    {
        System.err.println("boil Water");
    }
    public void pourInCup()
    {
        System.err.println(" pour In Cup ");
    }
    boolean cutomerWantsIngridients() { return true;}
}
