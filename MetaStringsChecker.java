package Java;
public class MetaStringsChecker {
    public static boolean areMetaStrings(String str1, String str2) {
        // Step 1: Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        int len = str1.length();
        int[] mismatch1 = new int[2];
        int[] mismatch2 = new int[2];
        int mismatchCount = 0;

        // Step 2: Compare characters and record mismatches
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (mismatchCount == 2) {
                    return false; // More than 2 mismatches, not meta strings
                }
                mismatch1[mismatchCount] = i;
                mismatch2[mismatchCount] = i;
                mismatchCount++;
            }
        }

        // Step 3: Check if the positions of mismatches can be swapped to make the strings equal
        return mismatchCount == 2 && 
               str1.charAt(mismatch1[0]) == str2.charAt(mismatch2[1]) &&
               str1.charAt(mismatch1[1]) == str2.charAt(mismatch2[0]);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bac";

        if (areMetaStrings(str1, str2)) {
            System.out.println("The strings are meta strings.");
        } else {
            System.out.println("The strings are not meta strings.");
        }
    }
}

