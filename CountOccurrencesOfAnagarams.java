import java.util.*;

class CountOccurrencesOfAnagarams {
	public static void main(String[] args) {
		String pattern = "for";
		char temp[] = pattern.toCharArray();
		Arrays.sort(temp);
		String pt=new String(temp);
		// System.out.println(pt);
		String str = "forxxorfxdofrofrofr";
		int i=0;
		int j=0;
		int count=0;
		int n=str.length();
		int k=pt.length();
		// int w=0;
		while(j < n) {
			if((j-i+1) < k) {
				j++;
			}
			if((j-i+1)==k) {
				int t=0;
				char tm[] = new char[3];
				for(int w=i; w<=j; w++) {
					tm[t++] = str.charAt(w);
				}
				// char temp2[] = tm.toCharArray();
				Arrays.sort(tm);
				String pt2=new String(tm);
				if(pt.equals(pt2)) {
					count++;
				}
				i++;
				j++;
			}
		}
		System.out.println(count);
	}
}
