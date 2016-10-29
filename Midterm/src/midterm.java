import java.util.HashMap;

public class midterm {
	
/*  1.
 * 	
 */
	public int longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return 0;
	    }
		
        if (s.length() == 1){
        	return 1;
        }
           
        
        String longest = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
        	String curr1 = GetPalindrome(s, i, i);          // odd
        	if (curr1.length() > longest.length()) {
        		longest = curr1;
            }
            
            String curr2 = GetPalindrome(s, i, i+1);        // even
            if (curr2.length() > longest.length()) {
                longest = curr2;
            }
        }

        return longest.length();  
		
	}
	
	private String GetPalindrome(String str, int start, int end) {
		
		while (start >= 0 && end <= str.length() -1 && str.charAt(start) ==str.charAt(end)){
            start--;
            end++;
        }
		
        return str.substring(start + 1, end);
        
    }

/*  2.
 *  	
*/	
	public int maxProfit(int[] prices) {  
		int profit = 0;
		
		if(prices == null || prices.length ==0){
            return 0;
        } 
		
   		for (int i = 1; i < prices.length; i++) {
   			if (prices[i] > prices[i - 1] ) {  
   				profit += prices[i] - prices[i - 1];  
        	}  
    	}
   		
    	return profit;  
	}
	
/*  3.
*  	
*/	
	public int titleToNumber(String title) {
		int count = title.length()-1;  
        int number = 0;  
       
        for(int i = 0 ; i < title.length(); i++){  
            number += (title.charAt(i)-'A'+ 1)* Math.pow(26,count--);     
        }  
        
        return number;  
	}

/* BONUS 
 * 	
 */
	public int twoSum(int[] nums, int target) {
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i<nums.length; i++){
			hm.put(nums[i], i);
			if (hm.containsKey(target - nums[i]) && target != 2*nums[i]){
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main (String[] args){
		midterm test = new midterm();
		
		int[] sum = {2,3,4,5,7,9,11};
		String palindrome = "ABAacbAA"; 
		
		System.out.println("Result for longest palindrome ->   " + test.longestPalindrome(palindrome));
		System.out.println("Result for title to number ->   " + test.titleToNumber("AA") );
		System.out.println("Result for two sum ->   " + test.twoSum(sum, 9));
		
	}


}
