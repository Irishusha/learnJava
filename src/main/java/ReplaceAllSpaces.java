public class ReplaceAllSpaces {
    public static void main(String[] args) {
        //String originalString = "  Hello \tworld\n!  ";
        //String originalString = "This is\na\nmultiline\nstring.";
        //String originalString = "\\t\\t\\tTabs\\tare\\tnot\\tspaces.";
        //String originalString = "Line\\nbreaks\\nare\\nalso\\ nwhitespace.";
        //String originalString = "\n \t \n ";
        //String originalString = "One space here: .\tTwo spaces here: . .\tThree spaces here: . . .";
        //String originalString = "There are spaces and\\ttabs\\tmixed\\t\\tin\\tthis\\tstring.";
        String originalString = "stdftsf sjfhjgfjh4455slkdjsksf dkjhskjdfh     kdjhskdhf     djshfjs676 12343234!@#$#@ jdjkhf$%";
        String regex = "\\s+";
        String resultString = originalString.replaceAll(regex, "");
        System.out.println(resultString);
    }
}
