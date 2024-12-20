package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.*;

public class Main {

    /**
     * TODO: Executors, Executor и ExecutorServic,
     * TODO: Метод Shutdown
     */

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Double> future = service.submit(() -> {
            double sum = 0;
            for (int i = 0; i < 10000; i++) {
                sum += Math.random();
            }
            return sum;
        });
        try {
            System.out.println(future.get());
            service.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * TODO: Интерфейс Callable,
     */

    /*
    public static void main(String[] args) {
        Callable callable = () -> {
            double sum = 0;
            for (int i = 0; i < 1000; i++) {
                sum += Math.random();
            }
            if (sum / 1000 < 0.6) {
                throw new IllegalArgumentException("JDJDJD");
            }
          return sum / 1000;
        };

        FutureTask<Double> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

     */



    /**
     * TODO: Потокобезопасные классы,
     */


//    private static Vector<Double> numbers = new Vector<>();

//    private static StringBuffer builder = new StringBuffer();
//
//    public static void main(String[] args) {
//        ArrayList<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 100; i++)
//        {
//            threads.add(new Thread(() -> {
//                for (int j = 0; j < 100000; j++) {
//                    builder.append("d");
////                    numbers.add(Math.random());
//                }
//                System.out.println(builder.length());
//            }));
//        }
//
//        threads.forEach(Thread::start);
//    }


    /**
     * TODO: Взаимодействие потоков — методы Wait и Notify,
     */



//    public static void main(String[] args) {
//
//        Parking parking = new Parking();
//
//        Thread thread1 = new Thread(new Producer(parking));
//        Thread thread2 = new Thread(new Consumer(parking));
//
//        thread1.start();
//        thread2.start();
//    }


    /**
     * TODO: Synchronized-методы,
     */



//    private static ArrayList<Double> numbers = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//        ArrayList<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            threads.add(new Thread(Main::someHeavyMethod));
//        }
//
//        threads.forEach(t ->t.start());
//
//    }
//
//    private static synchronized void someHeavyMethod() {
//        for (int i = 0; i < 100000000; i++) {
//            numbers.add(Math.random() / Math.random());
//        }
//        System.out.println(numbers.size());
//        numbers.clear();
//    }

    /*
     Ключевое слово Volatile
 */
//    public static void main(String[] args) {
//
//        Task task = new Task();
//        new Thread(task).start();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//
//        task.stop();
//        System.out.println("Main: " + task.getCounterValue());
//
//    }

    /*
    Состояние гонки и критические секции
     */
//    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            new Thread(() -> {
//                for (int j = 0; j < 10000; j++) {
//                    ValueStorage.incrementValue();
//                }
//                System.out.println(ValueStorage.getValue());
//            }).start();
//        }
//    }



    /*
    1 ЗАДАНИЕ
     */

//    private static int newWidth = 300;
//
//
//    public static void main(String[] args) {
//        String srcFolder = "C:/Users/Alkatras/Downloads/src";
//        String dstFolder = "C:/Users/Alkatras/Downloads/dst";
//
//        File srcDir = new File(srcFolder);
//
//        long start = System.currentTimeMillis();
//
//        File[] files = srcDir.listFiles();
//
//        int middle = files.length / 2;
//
//        File[] files1 = new File[middle];
//        System.arraycopy(files, 0, files1, 0, files1.length);
//        ImageResizer resizer1 = new ImageResizer(files1, newWidth, dstFolder, start);
//        new Thread(resizer1).start();
//
//
//        File[] files2 = new File[files.length - middle];
//        System.arraycopy(files, middle, files2, 0, files2.length);
//        ImageResizer resizer2 = new ImageResizer(files2, newWidth, dstFolder, start);
//        new Thread(resizer2).start();
//
//
//    }
}
