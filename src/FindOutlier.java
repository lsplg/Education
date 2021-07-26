public class FindOutlier{
    public static int find(int[] integers){
        int countOfOdd = 0;
        for (int i = 0; i < 3; i++) if (integers[i] % 2 == 0) countOfOdd++;
        if (countOfOdd > 1) {
            int number = integers[0];
            int itemNumber = 0;
            while (number %2 > 0 ) number = integers[++itemNumber];
            return number;
        }
        else {
            int number = integers[0];
            int itemNumber = 0;
            while (number %2 == 0) number = integers[++itemNumber];
            return number;
        }
    }

    public static void main(String[] args) {
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) n[i] = i*2;
        n[2] = 3;
        System.out.println(find(n));
    }
}