package Task2;
/*Площадь выпуклого многоугольника
Задача: Вычислить площадь выпуклого и-угольника, заданного координатами своих вершин.
Входные данные: count - количество вершин, (x,y) - заданные вершины в порядке обхода по часовой стрелке.
Ограничения: count<1000, x<100000, y<100000.
Выходные данные: Площадь многоугольника*/


import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int count = Integer.parseInt(str);
            int x[] = new int[count];
            int y[] = new int[count];
            for (int i = 0; i < count; i++) {
                str = br.readLine();
                x[i] = Integer.parseInt(str);
                str = br.readLine();
                y[i] = Integer.parseInt(str);
            }
            long startTime = System.nanoTime();
            double s = 0;
            for (int i = 2; i < count; ++i)
                s += ((x[i] - x[0]) * (y[i - 1] - y[0]) - (x[i - 1] - x[0]) * (y[i] - y[0]));
            s = Math.abs(s) / 2;
            System.out.println(s);
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

