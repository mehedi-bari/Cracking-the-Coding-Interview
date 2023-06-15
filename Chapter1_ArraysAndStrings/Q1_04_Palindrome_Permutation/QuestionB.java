package Q1_04_Palindrome_Permutation;


public class QuestionB {
    public static int toggle(int bitVector, int index) {
        if(index< 0) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0) bitVector |= mask;
        else bitVector &= ~ mask;
        return bitVector;
    }

    // create a bitVector for the String:
    public static int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c: phrase.toCharArray()){
            int x = Common.getCharNumber(c);
            bitVector = toggle(bitVector,x);
        }
        return bitVector;
    }

    public static boolean checkAtMostOneBitSet(int bitVector) {
        return (bitVector & (bitVector-1)) == 0;
    }

    public static boolean isPermutationOfPalindrome(String phrase){
        int bitVector = createBitVector(phrase);
        return checkAtMostOneBitSet(bitVector);
    }



    public static void main(String[] args) {
        String pali = "Rats live on eveil start";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}