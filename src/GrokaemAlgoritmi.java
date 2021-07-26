import java.sql.ClientInfoStatus;

public class GrokaemAlgoritmi {

    public static int binarySearch(List list, int value) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int midle = (low + high)/2;
            int midleValue = list.get(midle);
            if (midleValue == value) return midle;
            if (midleValue > value) high = midle;
            if (midleValue < value) low = midle;
        }
        return -1;
    }

    public static List selectionSort (List list){
        ArrayList sortList = new ArrayList();
        int column = list.size();
        for (int i = 0; i < column; i++) {
            int smallestIndex = findSmallest(list, list.size());
            sortList.add(list.get(smallestIndex));
            list.remove(smallestIndex);
        }
        return sortList;
    }

    public static int findSmallest (List list, int column){
        int smallest = list.get(0);
        int smallestIndex = 0;
        for (int j = 0; j < column; j++) {
            if (list.get(j) < smallest) {
                smallest = list.get(j);
                smallestIndex = j;
            }
        }
        return  smallestIndex;
    }

    public static void countdown (int i) {
        System.out.println(i);
        if (i < 1) return;
        else countdown(i - 1);
    }

    public static int factorial (int i) {
        if (i == 1) return i;
        else return i*(factorial(i - 1));
    }

    public static int sum (List list) {
        int sum = 0;
        for ( int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int sumByRecursion (List list, int remainingElementsToSum) {
        if (remainingElementsToSum == 1) return list.get(list.size() - remainingElementsToSum);
        return list.get(list.size()-remainingElementsToSum) + sumByRecursion (list,remainingElementsToSum - 1);
    }

    public static int biggestElementInList(List list) {
        if (list.size() == 2) return theBigest(list);
        List newList = deleteFirstElement(list);
        if (list.get(0) > biggestElementInList(newList))  return list.get(0);
        else return biggestElementInList(newList);
    }

    public static int theBigest(List list) {
        if (list.get(0) > list.get(1)) return list.get(0);
        return list.get(1);
    }

    public static List deleteFirstElement(List list){
        ArrayList newList = new ArrayList();
        for (int i = 1; i < list.size(); i++) newList.add(list.get(i));
        return newList;
    }

    public static List quicksort(List list) {
        if (list.size() < 2) return list;
        int pivot = list.get(0);
        ArrayList less = new ArrayList();
        ArrayList greater = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < pivot) less.add(list.get(i));
            else if (list.get(i) > pivot) greater.add(list.get(i));
        }
        less.add(pivot);
        for (int i = 0; i < greater.size(); i++) less.add(greater.get(i));
        return less;

    }
}
