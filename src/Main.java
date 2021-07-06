public class Main {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(8);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(1);
        System.out.println(Lists.calculateSum(array));
        Lists.sort(array);
        System.out.println(array);
//        for (int i = 0; i < array.size(); i++){
//            System.out.println(array.get(i));
//        }
    }
}
