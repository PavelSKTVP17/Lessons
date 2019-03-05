
package Template0;


public class ENTRY 
{
    public static void main(String[] args) {
        /*
        WebsiteTemplate wp= new WelcomePage();
        WebsiteTemplate np= new NewsPage();
        WebsiteTemplate sp= new ShopPage();
        wp.showPage();
        System.out.println("\n=================\n");
        np.showPage();
        System.out.println("\n=================\n");
        sp.showPage();
        */
        DrinkTemplate wp= new TeaDrink();
        wp.prepareRecipe();
        System.out.println("=================");
        DrinkTemplate np= new CofeeDrink();
        np.prepareRecipe();
    }
    
    
}
