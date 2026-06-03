public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 99.99;
        int i = (int) d;

        System.out.println("Double Value: " + d);
        System.out.println("After Casting to Int: " + i);

        int num = 50;
        double dNum = (double) num;

        System.out.println("Integer Value: " + num);
        System.out.println("After Casting to Double: " + dNum);
    }
}