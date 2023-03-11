package Task4;
/*Задача Иосифа Флавия
Выстроим в круг N человек, пронумерованных числами от 1 до N,
и будем исключать каждого k-ого до тех пор, пока не уцелеет только
один человек. (Например, если N=10, k=3, то сначала умрет 3-й,
потом 6-й, затем 9-й, затем 2-й, затем 7-й, потом 1-й, потом 8-й,
за ним - 5-й, и потом 10-й. Таким образом, уцелеет 4-й.)
Задача: определить номер уцелевшего.
Входные данные: числа N - количество человек, k - шаг.
Ограничения: N<=500, k<=100.
Выходные данные: Номер уцелевшего человека*/

import java.io.*;

public class Task4 {
    public static int joseph(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (joseph(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int size = Integer.parseInt(str);
            str = br.readLine();
            int k = Integer.parseInt(str);
            long startTime = System.nanoTime();
            System.out.println(joseph(size, k));
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