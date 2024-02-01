// This class represents a string. It has methods to manipulate the string, such as concatenation and
// substring extraction. The class also provides basic arithmetic operations for strings (addition, subtra
// ction) and comparison of two strings.
public class stringManipulation{
    public static void main(String[] args) {
        String s1 = "Hello, World";
        int length = s1.length();
        System.out.println("Length of the string is "+ length);

        //  Concatenation
        String s2 = " Howdy";
        String result = s1.concat(s2);
        System.out.println("Concatenated String: " + result);

        // Substring
        int startIndex = 7;
        String sub = result.substring(startIndex);
        System.out.println("Substring: "+ sub);

        // Character Extraction
        char charAtIndex = result.charAt(3); // Get Character at index 4
        System.out.println("Character at index 3: "+ charAtIndex);

        // Replacing characters
        String replaced = result.replace("l", "z");
        System.out.println("Replaced String: " + replaced);

        // Converting Cases
        String lowercase = result.toLowerCase();
        String uppercase = result.toUpperCase();
        System.out.println("LowerCase: " + lowercase);
        System.out.println("Uppercase: "+ uppercase);

        // Trimming Spaces
        String withSpaces = "Hello, World!        ";
        String trimmed = withSpaces.trim();
        System.out.println("Trimmed String: "+ trimmed);

        // Checking for equality
        String str3 = "Hello";
        String str4 = "hello";
        boolean isEqual = str3.equals(str4); // Case sensitive comparison
        System.out.println("Strings are Equal: " + isEqual);

        // Checking for containment
        String phrase = "Java is fun";
        boolean containsJava = phrase.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // Splitting a string
        String sentence = "This is a sample sentence";
        String[] words = sentence.split("\\s+");
        System.out.println("Words in the sentence: ");
        for (String word: words){
            System.out.println(word);
        }
    }
}