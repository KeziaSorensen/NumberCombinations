package recursion35; // waterloo test question
// figure out all the ways 4 and 5 can be added up to make 35 (or any other number)
public class Main {
	
	static int recurse(int number) {
		if (number==0) {
			return 1;
		} else if (number<0) {
			return 0;
		}else {
			return recurse(number-5)+recurse(number-4);// this check for 4 and 5, and then return how many combos worked
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(recurse(35));

	}

}
