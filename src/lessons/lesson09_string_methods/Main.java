package lessons.lesson09_string_methods;
/*

string.length() >> to get the length of the string
string.charAt(index) >> to get a character at a specified index
string.indexOf(char)  >> find the first index that occurs of a specific character
string.lastIndexOf()  >> find the last index that occurs of a specific  character
string.toUpper() >> to make string upper case
string.toLower() >> to make string lower case
string.trim() >> to remove white space trail
string.replace(old,new) >> to replace a char with another char
string.isEmpty() >> to check if a string is empty - return true if it is and false if not
string.contains(char) >> to see if the string has a character - returns true if it does and false if not.
string.equals(given characters within the string) >. to check if strings are exactly the same.


 */
public class Main {
    public static void main(String[] args) {

        String name = "Bongiwe";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("n");
        int lastIndex = name.lastIndexOf("o");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

    }

}
