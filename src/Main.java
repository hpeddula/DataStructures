import Fundamentals.Bag;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        bag.add("one");
        bag.add("two");
        bag.add("three");
        bag.add("four");
        bag.add("five");
        for (String b: bag) {
            System.out.println(b);
        }
    }
    
}
