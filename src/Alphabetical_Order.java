import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Alphabetical_Order
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        
        String names[] = " is this is sandeep".split(" ");
        
        Set s = new TreeSet<String>();
        s.addAll(Arrays.asList(names));
        
        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
        
        /*
        for (int i = 0; i < names.length; i++) 
        {
            for (int j = i + 1; j < names.length; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < names.length - 1; i++) 
        {
            System.out.print(names[i] + ",");
        }
        System.out.print(names[names.length - 1]);
*/    }
}