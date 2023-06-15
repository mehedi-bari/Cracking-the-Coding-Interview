package Q1_06_String_Compression;

public class QuestionA {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int consecutive = 0;

        for (int i = 0; i <str.length(); i++) {
            consecutive++;
            if (i+1>= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressed.append(str.charAt(i));
                compressed.append(consecutive);
                consecutive = 0;
            }   
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
		String str = "aa";
		System.out.println(str);
		System.out.println(compress(str));
	}
    
}
