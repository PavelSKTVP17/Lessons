package kontroltoo;

public class PicturesManager implements IManager
{
    private static PicturesManager instance;
    private PicturesManager()
    {  instance=this; }
    public static PicturesManager Instance()
    {
        return (instance!=null)? instance : new PicturesManager();
    }
    @Override
    public void Run() {
        System.out.println(" PicturesMgr Starting");
    }

    @Override
    public void Finish() {
        System.out.println(" PicturesMgr Finishing");
    }

    @Override
    public String SomeFunction() {
        return " PicturesMgr shows some picture";
    }
    
}
