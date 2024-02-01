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
public class stringManipulation {
    // ... (your existing code)

    public static void main(String[] args) {
        // ... (your existing main method)
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
public class IOoperations {
    // ... (your existing code)

    public static void main(String[] args) {
        // ... (your existing main method)
    }
}
```


