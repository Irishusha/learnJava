import java.util.HashMap;

public class SampleHashMapSize {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");

        System.out.println("The size of map is " + myHashMap.size());
    }
}
