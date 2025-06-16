package Nuts;

public class bubblesor {

	public static void main(String[] args) {
		String [] names = {"varna","narasimha","lucky","oblesh"};
		for( int i=0;i<names.length-1;i++) {
			for(int j=0;j<names.length-i-1;j++) {
				if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap if the strings are in the wrong order
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Strings:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
			
	


