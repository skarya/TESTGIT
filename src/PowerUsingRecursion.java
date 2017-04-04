
public class PowerUsingRecursion {

	public static void main (String ...args){
		
		System.out.println(power(2,4));
	}

 public static int power(int x, int n){
	 
	 int temp=1;
	 if(n==0){
		 return 1;
	 } else if (n==1){
		 return x;
	 }
	 
	 temp=power(x, n/2);
	 System.out.println("----"+n);
	 if((n%2==0)){
		
		 return temp*temp;
	 }else {
		 return x*temp*temp;
	 }
	 
 }



}

