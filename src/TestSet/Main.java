
package TestSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) 
    {
        Set<String> hashSet=new HashSet<>();
        Set<String> LinkedhashSet=new LinkedHashSet<>();
        Set<String> treeSet=new TreeSet<>();
        
        hashSet.add("asdf1");
        hashSet.add("asdf2");
        hashSet.add("asdf3");
        hashSet.add("asdf4");
        hashSet.add("asdf5");
        
        hashSet.forEach( (name)->{ System.out.println(name);} );
        
        
        Set<Integer> set1=new HashSet<>();  Set<Integer> set2=new HashSet<>();
        set1.add(0); set1.add(1); set1.add(2); set1.add(3); set1.add(4); set1.add(5);
        set2.add(4); set2.add(5); set2.add(6); set2.add(7); set2.add(8); set1.add(9);
        
        Set<Integer> setDiff=new HashSet<>(set2);
        setDiff.retainAll(set1);
        System.out.println( setDiff );
    }
    
}
