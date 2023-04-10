package StringCodes;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String info = "";
		info += "This is my name";
		System.out.println(info.hashCode());
		info += " ";
		System.out.println(info.hashCode());
		info += "I am sandy";
		System.out.println(info.hashCode());
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("This is my name");
		System.out.println(info.hashCode());
		sb.append(" ");
		System.out.println(info.hashCode());
		sb.append("I am sandy");
		System.out.println(info.hashCode());
		
		System.out.println(sb);
	}
	
//	StringBuffer is totally same as stringBuilder but stringBuffer is more convenient 

}
