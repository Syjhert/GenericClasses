package Map;

public class MyMapMain {
    public static void main(String[] args) {

        MyMap<String, Integer> myMap = new MyMap<>();

        myMap.put("Natters", 12);
        myMap.put("Mau", 42);
        myMap.put("Mark", 54);
        myMap.put("Slumm", 76);

        myMap.print();

        myMap.put("Carl", 10);

        System.out.println("After adding Carl");
        myMap.print();

        System.out.println("Natters value: " + myMap.get("Natters"));
        myMap.put("Natters", 14);
        System.out.println("Natters value: " + myMap.get("Natters") + " (after put() update)");

        System.out.println("To remove Mau: " + myMap.remove("Mau"));
        myMap.print();

        System.out.print("Sergz value (non-existent): ");
        try{
            System.out.println(myMap.get("Sergz"));
        }catch(NullPointerException e){
            System.out.println("null");
        }

        System.out.print("To remove Chase (non-existent): ");
        try{
            System.out.println(myMap.remove("Chase"));
        }catch(NullPointerException e){
            System.out.println("null");
        }
    }
}
