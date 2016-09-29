import java.util.Scanner;

public class Assignment3 {
	// assignments
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		int[] power =new int[n];
		for (int i=0; i<n; i++){
			power[i] = (int) Math.pow(3, i);
		}
		return power;
	}

	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		String digit = String.valueOf(n); 
		int count;
		if(n < 0){
			count = digit.length() - 1;
		}
		else{
			count = digit.length();
		}
		int rem = n%count;
		return rem;
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n) { 
		if (n%2 != 0){
			for(int i = 0; i<n;i++){
				System.out.print(2*i+1 + " ");
			}			
		}
		else{
			for(int i = 0; i<n;i++){
				System.out.print(2*i + " ");
			}
		}
	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		int[][] tri = new int[n][n];
		if(n<1){
			System.out.println("Please input a valid number:");
		}
		else{
			System.out.println("The first "+ n + " rows of Pascal's triangle is:");
		}
		for(int i = 0; i < n; i++){
			for(int k=2*(n-i)-1;k>0;k--){
		    	System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++){
		    	if(i==j||j==0){
		    		tri[i][j] =1;
			    } 
			    else{
			    	tri[i][j]=tri[i-1][j-1]+tri[i-1][j];
			    }
			    System.out.print(tri[i][j] + "   ");   
			}
		    System.out.println();
	    }
		return null;
	}

	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		char[] vowel= s.toCharArray();
		for(int i = 0, j = vowel.length-1; i<j;){
			if ((vowel[i]== 'a'||vowel[i]== 'A'||vowel[i]== 'e'||vowel[i]== 'E'||vowel[i]== 'i'||vowel[i]== 'I'||vowel[i]== 'o'||vowel[i]== 'O'||vowel[i]== 'u'||vowel[i]== 'U')&&
				(vowel[j]== 'a'||vowel[j]== 'A'||vowel[j]== 'e'||vowel[j]== 'E'||vowel[j]== 'i'||vowel[j]== 'I'||vowel[j]== 'o'||vowel[j]== 'O'||vowel[j]== 'u'||vowel[j]== 'U')){
				char temp = vowel[i];
				vowel[i] = vowel[j];
				vowel[j] = temp;
				i++;
                j--;
				continue;
			} 
			if(!(vowel[i]== 'a'||vowel[i]== 'A'||vowel[i]== 'e'||vowel[i]== 'E'||vowel[i]== 'i'||vowel[i]== 'I'||vowel[i]== 'o'||vowel[i]== 'O'||vowel[i]== 'u'||vowel[i]== 'U')){
				i++;
			}
			if(!(vowel[j]== 'a'||vowel[j]== 'A'||vowel[j]== 'e'||vowel[j]== 'E'||vowel[j]== 'i'||vowel[j]== 'I'||vowel[j]== 'o'||vowel[j]== 'O'||vowel[j]== 'u'||vowel[j]== 'U')){
				j--;
			}
		}
		String rev = String.valueOf(vowel);
		return rev;
	}

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		if(str == null){
			return -1;
		}
		String[] lastWord = str.split(" ");
		if(lastWord.length>0){
            return lastWord[lastWord.length-1].length();
        }
        return 0;		
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
            	count=0;
            }
            sb.insert(count, c);
            if(c!=' '){
            	count++;
            }
        }
        String rev2 = sb.toString();
        return rev2;
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		char[] sos = message.toCharArray();
		int len = message.length();
		int count = 0;
		int i = 0;
		if(message==null||len%3!=0){
			return -1;//if input is not valid or not be multiple of 3, return -1
		}
		while (i < len) {
			if (sos[i++] != 'S')
				count++;
			if (sos[i++] != 'O')
				count++;
			if (sos[i++] != 'S')
				count++;
		}
		return count;
	}
	
	
	//test
	public static void main(String args[]){
		  Assignment3 test= new Assignment3();
		  Scanner scanner = new Scanner(System.in);
		  
		  
		  //test for findPowerOfThree
		  System.out.println("Pleas input a number to test 'find power of three': ");
		  int power = scanner.nextInt();
		  int[] powerThree = test.findPowerOfThree(power);
		  for(int i=0; i<=powerThree.length-1; i++){
			  System.out.print(powerThree[i]+" ");
		  }
		  System.out.println("\n");
		  
		  
		  //test for countDigits
		  System.out.println("Pleas input an integer to test 'count digits': ");
		  int digits = scanner.nextInt();
		  System.out.print(test.countDigits(digits));
		  System.out.println("\n");
		  
		  
		  
		  //test for printNumbers
		  System.out.println("Pleas input an integer to test 'print numbers': ");
		  int number = scanner.nextInt();
		  test.printNumbers(number);
		  System.out.println("\n");
		  
		  
		  //test for generatePascalsTriangle
		  System.out.println("Pleas input the number of rows to test 'generate pascals triangle': ");
		  int row = scanner.nextInt();
		  scanner.nextLine();
		  test.generatePascalsTriangle(row);
		  System.out.println("\n");
		  
		  
		  //test for reverseVowels
		  System.out.println("Pleas input a string to test 'reverse vowels': ");
		  String vow = scanner.nextLine();
		  System.out.println(test.reverseVowels(vow));
		  System.out.println("\n");
		  
		  
		  //test for lengthOfLastWord
		  System.out.println("Pleas input a string to test 'length of last Word': ");
		  String len = scanner.nextLine();
		  System.out.println(test.lengthOfLastWord(len));
		  System.out.println("\n");
		  
		  
		  //test for reverseString2
		  System.out.println("Pleas input a string to test 'reverse string 2': ");
		  String str = scanner.nextLine();
		  System.out.println(test.reverseString2(str));
		  System.out.println("\n");
		  
		  
		  //test for checkMessage
		  System.out.println("Pleas input SOS to test 'check message': ");
		  String SOS = scanner.nextLine();
		  System.out.println(test.checkMessage(SOS));
		  System.out.println("\n");
	}
}