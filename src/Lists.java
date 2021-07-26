public class Lists {

    public static long calculateSum(List list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) sum += list.get(i);
        return sum;
    }

    public static void sort(List list) {
        for (int i = 0; i < list.size(); i++) {
            int maxValue = list.get(0);
            int indexOfMaxValue = 0;
            for (int j = 1; j < list.size() - i; j++) {
                if (maxValue < list.get(j)) {
                    maxValue = list.get(j);
                    indexOfMaxValue = j;
                }
            }
            int tmp = maxValue;
            list.set(indexOfMaxValue, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, tmp);
        }
    }
}

