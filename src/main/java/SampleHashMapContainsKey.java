import java.util.HashMap;

public class SampleHashMapContainsKey {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");

        System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil"));
        System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));
    }
}
