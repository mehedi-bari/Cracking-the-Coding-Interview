// package Q1_03_URLify;

public class Question {
	// Assume string has sufficient free space at the end

    public static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, i = 0, index;
        for (i = 0; i < trueLength; i++){
            if (str[i] == ' ') spaceCount++;
        }
        
        index = -1 + trueLength + spaceCount * 2 ;
        for (i = trueLength -1; i>=0; i--) {
            if (str[i] == ' ') {
                str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index = index - 3;
            } else  str[index--] = str[i];
        }
    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i>=0; i--) {
            if (str[i] != ' ') return i;
        }
        return -1;
    }    
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		replaceSpaces(arr, trueLength);	
        System.out.println(arr);
	}
}