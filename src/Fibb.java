import java.util.HashMap;
import java.util.Map;

public class Fibb {

	static Map<Integer,Integer> map= new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		
		System.out.println(findFibonacciValue(6));
		
	}

	
		
		
		public static int findFibonacciValue(int number) {
		    if (number == 0 || number == 1) {
		      return number;
		    }
		    else if (map.containsKey(number)) {
		      return map.get(number);
		    }
		    else {
		      int fibonacciValue = findFibonacciValue(number - 2) + findFibonacciValue(number - 1);
		      map.put(number, fibonacciValue);
		      return fibonacciValue;
		    }
		  }
}
