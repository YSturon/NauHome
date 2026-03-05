import java.util.ArrayList;

public class Lab2_2 {

    public void GetMergeSort (int n){
        ArrayList<Double> list = new ArrayList <Double> ();
        for (int i = 0; i < n; i++){
            list.add(-50 + (Math.random() * 101));
        }
        System.out.println("До сортировки:");
        printList(list);

        ArrayList<Double> sorted = mergeSort(list);

        System.out.println("\nПосле сортировки:");
        printList(sorted);
    }

    private ArrayList<Double> mergeSort(ArrayList<Double> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;

        ArrayList<Double> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Double> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private ArrayList<Double> merge(ArrayList<Double> left, ArrayList<Double> right) {
        ArrayList<Double> result = new ArrayList<>(left.size() + right.size());
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    private void printList(ArrayList<Double> list) {
        for (double x : list) {
            System.out.printf("%.2f ", x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab2_2 obj = new Lab2_2();
        obj.GetMergeSort (5);
    }
}

