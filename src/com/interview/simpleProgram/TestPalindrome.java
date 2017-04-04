package com.interview.simpleProgram;

public class TestPalindrome {
	
	public static void main(String ...strings ){
		System.out.println(isPalindrome(543));
		System.out.println(isPalindrome("SandnaS"));
	}




public static boolean isPalindrome(String input){
	
	int begin=0,end=input.length()-1,middle=(begin+end)/2;
 System.out.println("end="+end +"   "+middle);	
	for(int i= 0; i<=middle;i++){
		if(input.charAt(begin)==input.charAt(end)){
			begin++;
			end--;
		}else{
			break;
		}
	}
		if(begin==middle+1){
			return true;
		}
		
		return false;
	}



public static boolean isPalindrome(int input){
	
	int rev = 0,i=0;
	while(input!=0){
		
            i=input%10;
            rev=(rev*10)+i;
            input/=10;
        
	}
	
	System.out.println(rev);
	if(input==rev){
		return true;
	}
	
	return false;
}

}