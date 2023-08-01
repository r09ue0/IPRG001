public class Party
{
    private Australian ausRick;
    private Australian ausTim;
    private French freFleur;
    private Italian itaGiani;

    public Party()
    {
        ausRick = new Australian(111, "English", "Rick", "meat pie");
        ausTim = new Australian(222, "English", "Tim", "steak sandwich");
        freFleur = new French(333, "Fleur");
        itaGiani = new Italian(444, "Giani");
        this.allDisplayLanguage();
        this.allDisplayFood();
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
    }

}