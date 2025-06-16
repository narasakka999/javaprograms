package Nuts;

public class QuadraticTimeExample {

	public static void main(String[] args) {
		int[] numbers= {1,3,5,7,5,3};
		boolean hasDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("duplaicate found:"+numbers[i]);
				}
			}
		}
		if(!hasDuplicate) {
			System.out.println("no duplicates found");
		}

	}

}




