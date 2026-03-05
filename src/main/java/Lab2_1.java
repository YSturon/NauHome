import java.lang.Math;

public class Lab2_1 {
    public void GetMaxValue (int n){
        int[] numbers = new int[n];
        int maxAbs = 0;
        for(int i = 0; i<n; i++ ){
            numbers[i] = -50 + (int)(Math.random() * 101);
            System.out.print(numbers[i]+" ");
            if (maxAbs < Math.abs(numbers[i])){
                maxAbs = Math.abs(numbers[i]);
            }
        }
        System.out.println("\nМаксимальное число в массиве: "+ maxAbs);
    }
    public static void main(String[] args) {
        Lab2_1 obj = new Lab2_1();
        obj.GetMaxValue (10);
    }
}
