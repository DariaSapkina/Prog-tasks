package Task3;
/*Количество заданной суммы
Задача: Найти количество пар индексов (i, j) таких, что
a[i] + b[i] = k.
Входные данные: Два строго возрастающих массива целых чисел a[0..n] и b[0..m]
и число к - заданная сумма.
Ограничения: n<=10000, m<=100000.
Выходные данные: Количество пар (i, j)*/

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int size1 = Integer.parseInt(str);
            int a[] = new int[size1];
            for (int i = 0; i < size1; i++) {
                str = br.readLine();
                a[i] = Integer.parseInt(str);
            }
            str = br.readLine();
            int size2 = Integer.parseInt(str);
            int b[] = new int[size2];
            for (int i = 0; i < size2; i++) {
                str = br.readLine();
                b[i] = Integer.parseInt(str);
            }
            str = br.readLine();
            int k = Integer.parseInt(str);
            long startTime = System.nanoTime();
            int count = 0;
            for (int i = 0; i < size1; i++) {
                for (int j = size2 - 1; j >= 0; j--) {
                    if (a[i] + b[j] == k)
                        count++;
                }
            }
            System.out.println(count);
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
