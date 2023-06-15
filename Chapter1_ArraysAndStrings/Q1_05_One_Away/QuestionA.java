// package Q1_05_One_Away;

import java.nio.ShortBuffer;

public class QuestionA {
	public static boolean oneReplace(String a,String b){
		boolean oneFalse = false;
		for (int i = 0; i<a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				if (oneFalse) return false;
				else oneFalse = true;
			}
		}

		return true;
	}

	public static boolean oneEditReplace(String a, String b) {
		int index1 = 0;
		int index2 = 0;
		while(index1 < a.length() && index2 < b.length()) {
			if (a.charAt(index1) != b.charAt(index2)) {
				if(index1 != index2) return false;
				index1++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}


	public static boolean oneEditAway(String a, String b) {
		if (Math.abs(a.length() - b.length()) == 1) return oneEditReplace(a, b);
		else if  (a.length() == b.length()) return oneReplace(a,b);

		return false;
	}
	
	public static void main(String[] args) {
		String a = "pale";
		String b = "ale";
		boolean isOneEdit = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);
	}

}