# javaintermediate

```markdown
# String Manipulation in Java

The Java class, `stringManipulation`, provides a set of methods for manipulating strings. It includes basic operations such as concatenation, substring extraction, character extraction, replacement, case conversion, trimming spaces, and various comparisons.

## Usage

1. **Compile the Class:**
   ```bash
   javac stringManipulation.java
   ```

2. **Run the Main Method:**
   ```bash
   java stringManipulation
   ```

## Methods and Demonstrations

### Length of the String

The `length()` method is used to get the length of the string.

### Concatenation

The `concat(String str)` method is used to concatenate two strings.

### Substring Extraction

The `substring(int beginIndex)` method is used to extract a substring from the original string.

### Character Extraction

The `charAt(int index)` method is used to extract a character at a specified index.

### Replacing Characters

The `replace(CharSequence target, CharSequence replacement)` method is used to replace characters in the string.

### Converting Cases

The `toLowerCase()` and `toUpperCase()` methods are used to convert the string to lowercase and uppercase, respectively.

### Trimming Spaces

The `trim()` method is used to remove leading and trailing whitespaces from a string.

### Checking for Equality

The `equals(Object anObject)` method is used for case-sensitive string comparison.

### Checking for Containment

The `contains(CharSequence sequence)` method is used to check if a sequence of characters is present in the string.

### Splitting a String

The `split(String regex)` method is used to split the string into an array of substrings based on a specified regular expression.

## Example

```java
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
```
```markdown
# Input/Output Operations in Java

This Java class, `IOoperations`, demonstrates basic input and output operations using Java's I/O classes. It includes writing data to a file and reading data from a file.

## Usage

1. **Compile the Class:**
   ```bash
   javac IOoperations.java
   ```

2. **Run the Main Method:**
   ```bash
   java IOoperations
   ```

## Writing to a File

The `BufferedWriter` is used to write text to a file (`output.txt`). The try-with-resources statement ensures the proper closing of the writer, even if an exception occurs.

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    // Writing sample text to the file
    writer.write("Hello, this is a sample text.\n");
    writer.write("Writing to a file using Java I/O operations.\n");
    writer.write("End of the file.");
    System.out.println("Data has been written to the file.");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Reading from a File

The `BufferedReader` is used to read text from the same file (`output.txt`). The try-with-resources statement ensures the proper closing of the reader.

```java
try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
    // Reading from the file and printing each line
    String line;
    System.out.println("Reading from the file:");
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOoperations {
    public static void main(String[] args) {
        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, this is a sample text.\n");
            writer.write("Writing to a file using Java I/O operations.\n");
            writer.write("End of the file.");
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```


