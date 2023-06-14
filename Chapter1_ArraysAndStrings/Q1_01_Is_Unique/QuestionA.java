package Q1_01_Is_Unique;


public class QuestionA {
	public static boolean isUniqueChars(String str) {
        boolean[] ascii = new boolean[128];
        for (int i = 0; i <str.length(); i++) {
            int val = str.charAt(i);
            if (ascii[val]) return false;
            ascii[val] = true;
        }
        return true;
    }
}