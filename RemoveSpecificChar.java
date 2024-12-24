package strings.com;

public class RemoveSpecificChar {
	public static void main(String[] args) {
		String str="aaabbccddeeff";
		StringBuilder sb=new StringBuilder();
		char[] ch=str.toCharArray();
		char st='a';
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=st) {
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb.toString());
		
	}

}
