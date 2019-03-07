package Iterator2;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>
{
    MenuItem[] list;
    int index=0;

    public DinerMenuIterator(MenuItem[] list) 
    {
        this.list = list;
    }
    
    @Override
    public boolean hasNext() 
    {
       // if( index >= list.length || list[index]==null) return false; else return true;
        return !( index >= list.length || list[index]==null);
    }

    @Override
    public MenuItem next() 
    {
        MenuItem itm=list[index];index++;
        return itm;
    }

    @Override
    public void remove() 
    {
        if(index<=0) throw new IllegalStateException(" IllegalStateException 1");
        if( list[index-1]!=null)
        {
            for (int i = index-1; i < list.length-1; i++) 
            {
                list[i]=list[i+1];
                list[list.length-1]=null;
            }
        }
    }
    
    
}
