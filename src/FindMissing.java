import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissing {

	public static void main (String ...args){
			diffWord("I am using hackerrank to improve programming", "am hackerrank to improve");
	}
	
	
	public static void diffWord(String a, String b){
		try {
            String  s1  = "this is a cat. this is my cat.";
            String  s2 =  "this is cat. my cat.";
            String arr1[] = s1.split(" ");
            String arr2[] = s2.split(" ");
            //ArrayList<String> tmp1 = new ArrayList<String>();
            ArrayList<String> tmp2 = new ArrayList<String>();

			for (int i = 0, j = 0; i < arr1.length; i++) {
				System.out.println( i +"   "+j);
				if (arr1[i].equalsIgnoreCase(arr2[j])) {
					//tmp1.add(arr1[i]);
					j++;
				} else {
					tmp2.add(arr1[i]);
				}
			}
            System.out.println(tmp2);

        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
		
	
}
