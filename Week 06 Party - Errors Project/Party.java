public class Party
{
    private Australian ausRick;
    private Australian ausTim;
    private French freFleur;
    private Italian itaGiani;
    
    public Party()
    {
        ausRick = new Australian("Rick","English", "Oranges", "Blue");
        ausTim = new Australian("Tim","English", "Apples", "Red");
        freFleur = new French(1, "Fleur", "Pasta", "Yellow");
        itaGiani = new Italian(2, "Giani", "Pizza", "Green");   
        allDisplayLanguage();
        allShareFavouriteFood();
    }
    
    private void allDisplayLanguage()
    {
        ausRick.displayLanguage();
        ausTim.displayLanguage();
        freFleur.displayLanguage();
        itaGiani.displayLanguage();
    }       
    
    private void allDisplayFood()
    {
        ausRick.displayFood();
        ausTim.displayFood();  
        freFleur.displayFood();
        itaGiani.displayFood();
    }
    
    private void allDisplayColor()
    {
        ausRick.displayColor();
        ausTim.displayColor();  
        freFleur.displayColor();
        itaGiani.displayColor();
    }
    
    private void allShareFavouriteFood()
    {
        
    }
}
