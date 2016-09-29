import java.util.Scanner;

/**
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Please try the two questions under 'Bonus'. Please write some
 * tests as practice. When you are writing tests, you should think about what
 * situations might cause error? like 0,-1... The deadline of this assignment is
 * 09/22/2016 23:59. Please feel free to contact me for any questions.
 */

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Assignment2 {
	// Assignment
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year Toddler : If the age is less than
	 * 3 and greater than 1 Pre Schooler : If the age is less than 5 and greater
	 * than 3 KG Girl : If the age is greater than 5 and less than 6 and the
	 * gender is female KG Boy : If the age is greater than 5 and less than 6
	 * and the gender is male
	 */
	public  void personType(Person person) {		 
		 if (person.age<0){
			 System.out.println("Invalid age" );
		 }
		 else if(person.age<1){
			 System.out.println("Infant" );
		 }
		 else if(person.age<3){
			 System.out.println("Toddler" );
		 }
		 else if(person.age<5){
			 System.out.println("Pre Schooler" );
		 }
		 else if(person.age<6 && person.gender == true){
			 System.out.println("KG Girl" );
		 }
		 else if(person.age<6 && person.gender == false){
			 System.out.println("KG Boy" );
		 }
		 else{
			 System.out.println("Too old" );
		 }
	}

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
		if (n%2 != 0){
			System.out.println("Weird");
		}
		else if (n%2 == 0 && 2 <= n && n <= 5){
			System.out.println("Not Weird");
		}
		else if (n%2 == 0 && 6 <= n && n <= 20){
			System.out.println("Weird");
		}
		else if (n%2 == 0 && 20 < n){
			System.out.println("Not Weird");
		}else{
			System.out.println("Please inpute a valid integer!");
		}
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
		if (n < 2){
			System.out.println(n + " is not a prime.");
		}
		for (int i = 1;i<Math.sqrt(n);i++){
			if ( n%i == 0){
				System.out.println(n + " is not a prime.");
				break;
			}
			else {
				System.out.println(n + " is a prime.");
				break;
			}
		}	
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
		int[] fib = new int[n];
		if (n<1)
		return null;
		for (int i=0; i<n; i++){
			if (i<2) 
				fib[i] = 1;
			else 
				fib[i] = fib[i-1]+fib[i-2];
		}
		return fib ;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		String str = "";
		char[] Char= s.toCharArray();
		char temp;
		int l = Char.length; 
		for (int i=0; i< l/2; i++){
			temp = Char[i];
			Char[i] = Char[l - 1 - i];
			Char[l - 1 - i] = temp;			
		}
		str = String.valueOf(Char);
		return str ;
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {

		int first = nums[0];
		int second = nums[1];
        if (nums.length < 2)  
            return null ;  
        if (first<second){
			first = nums[1];
			second = nums[0];
		}
        for (int i = 2; i < nums.length; i++) {  
            if (first<nums[i]) {  
            	second = first;  
            	first = nums[i];
            } else {
            	if(second < nums[i]){
            		second = nums[i];
            	}
            }	                 
        }  
        int larg[] = {first,second};
		System.out.println(larg[0] + ", " + larg[1]);
		return larg;
    } 
		

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int count=0;
        for(int i=0;i<len;i++){
        
        	if(nums[i]!=0){
        		nums[count]=nums[i];
        		count++;
        	}
        	
        }
        if(count<len){
        	
        	for(int i =count;i<len;i++){
        		
        		nums[i]=0;
        	}
        	
        }
        for(int i=0;i<len;i++){
        	System.out.println(nums[i]);
        }
    }
	

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		
		if (n < 0){
			System.out.println("Please input a non-negative integer. ");
		}
	    while(n>9){
				int temp = 0;
				while(n!=0){
					temp = temp +n%10;
					n = n / 10;
				}
				n = temp;
		}
		return n;
	}


	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
        boolean isUgly = false;
		if (n>1) {
			while (n % 2 == 0){
			n = n /2;
		}
		    while (n % 3 == 0){
			n = n /3;
		}
		    while (n % 5 == 0){
			n = n /5;
		}
		    if (n == 1 ){
			return true;
		    }
		}
		return isUgly;
	}




//Test


  public static void main(String args[]){
	  Assignment2 test= new Assignment2();
	  Scanner scanner = new Scanner(System.in);
	 
	  //test personType
	  System.out.println("Test for 'person type': ");
	  Person Invalid = new Person(-1,true);
	  test.personType(Invalid);
	  
	  Person Infant = new Person(0,true);
	  test.personType(Infant);
	  
	  Person Toddler = new Person(2,false);
	  test.personType(Toddler);
	  
	  Person preSchooler = new Person(4,true);
	  test.personType(preSchooler);
	  
	  Person kgGirl = new Person(5,false);
	  test.personType(kgGirl);
	  
	  Person kgBoy = new Person(5,true);
	  test.personType(kgBoy);
	  
	  Person old = new Person(11,false);
	  test.personType(old);
	  
	  System.out.println("");
	  
	  
	  //test weirdNumber
	  System.out.println("Test for 'weird number': ");
	  System.out.println("Pleas input an integer to test 'weird number': ");
	  int weird = scanner.nextInt();
	  test.weirdNumber(weird);
	  System.out.println();
	  
	  
	  //test isPrime
	  System.out.println("Test for 'prime number': ");
	  System.out.println("Pleas input an integer to test 'prime number': ");
	  int prime = scanner.nextInt();
	  test.isPrime(prime);
	  System.out.println();
	  
	  
	  //test fibonacciNumber
	  System.out.println("Test for 'fibonacci number': ");
	  System.out.println("Please input a number to test N 'fibonacci numbers' : ");
	    int input = scanner.nextInt();
		int[] testFib = test.fibonacciNumber(input);
		
		if(testFib != null){
			for(int i = 0; i < testFib.length; i++)
			{
				System.out.print(testFib[i] + "  ");
			}
		}
	  System.out.println();
	  System.out.println();
	  
	  
	  //test resverseString
	  System.out.println("Test for 'reverse string': ");
	  System.out.println("Please input a string  to test 'reverse string' : ");
	  String inputS = scanner.next();
	  System.out.println(test.reverseString(inputS));
	  System.out.println();
	  
	  
	  //test findTheLargestTwo
	  System.out.println("Test for 'find the largest two numbers': ");
	  int [] largT = {0,3,5,0,9,11,17,0,34};
	  test.findTheLargestTwo(largT);
	  System.out.println();
	  
	  
	  
	  //test moveZeroes();
	  System.out.println("Test for 'move zeroes': ");
	  int [] zero = {0,3,5,0,9,11,17,0,34};
	  test.moveZeroes(zero);
	  System.out.println() ;
	  
	  
	  //test addDigits
	  System.out.println("Test for 'add digits': ");
	  System.out.println("Pleas input an integer to test 'add digits': ");
	  int add = scanner.nextInt();
	  int a = test.addDigits(add);	  
	  System.out.println(a);
	  System.out.println();
	  
	  
	  //test isUgly
	  System.out.println("Test for 'is ugly': ");
	  System.out.println("Pleas input an integer to test 'is ugly': ");
	  int ugly = scanner.nextInt();
      System.out.println(ugly + " is ugly: " + test.isUgly(ugly));
	  System.out.println();
  }
}
