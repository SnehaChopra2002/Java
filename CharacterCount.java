package Java;
public class CharacterCount {
    public static void main(String[] args) {
        String sentence = "Hello, World! 123 This is a test sentence.";
        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        int spaceCount = 0;
        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount++;
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                specialSymbolCount++;
            }
        }
        // Count words
        String[] words = sentence.split("\\s+");
        wordCount = words.length;

        // Output the counts
        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
        System.out.println("Blank Spaces: " + spaceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

