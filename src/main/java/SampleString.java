public class SampleString {
    public static void main(String[] args){
//String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
//Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
//Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);


        String str_Sample = "RockStar";
        //Length of a String
        System.out.println("Length of String: " + str_Sample.length());

        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));


        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        //Returns true if and only if this string contains the specified sequence of char values.
        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));

        //Returns true if the character sequence represented by the argument is a suffix of the character sequence represented by this object.
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

        //Java String Replace, replaceAll and replaceFirst methods. You can specify the part of the String you want to replace and the replacement String in the arguments.
        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));


        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
    }
}
