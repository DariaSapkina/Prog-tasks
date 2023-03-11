package Task1;
/*Максимальная сумма
Задача: Найти первую пару индексов (іо,jo), такую что a[io] + b[io] = max(A[i] + B[i]).
Входные данные: Два массива целых чисел a[0..n-1] и b[0..n-1].
Ограничения: 0<=i<n, 0<=j<n, io<=jo.
Выходные данные: Пара (i, j)*/

import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int size = Integer.parseInt(str);
            int a[] = new int[size];
            int b[] = new int[size];
            for (int i = 0; i < size; i++) {
                str = br.readLine();
                a[i] = Integer.parseInt(str);
            }
            for (int i = 0; i < size; i++) {
                str = br.readLine();
                b[i] = Integer.parseInt(str);
            }
            long startTime = System.nanoTime();
            int currentMax = 0;
            int aMax = 0;
            int bMax = 0;
            for (int i = 1; i < size; i++) {
                if (a[i] > a[currentMax])
                    currentMax = i;
                if (a[currentMax] + b[i] > a[aMax] + b[bMax]) {
                    aMax = currentMax;
                    bMax = i;
                }
            }
            System.out.println(aMax + " " + bMax);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
            long usedBytes = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576;
            System.out.println("Memory usage in mb: " + usedBytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
