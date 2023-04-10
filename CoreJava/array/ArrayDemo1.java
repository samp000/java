package array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] friends = new String[5];
			
		friends[0] ="sandy";
		friends[1] ="ayush";
		friends[2] ="avya";
		friends[3] ="surja";
		friends[4] ="suyog";
		
		for(int i=0;i<friends.length;i++) {
			
			System.out.println(friends[i]);
			
		}
		
		for(String fr:friends) {
			System.out.println(fr);
		}
	}

}