package xpertgroup.com;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import xpertgroup.com.controller.MainControler;

@SpringBootApplication
public class XpertGroupApplication {

    public static void main(String[] args) {
        final String UPDATE = "UPDATE";
        ApplicationContext applicationContext = SpringApplication.run(XpertGroupApplication.class, args);
        MainControler mainControler = applicationContext.getBean(MainControler.class);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("type the number of test");
            int t = in.nextInt();   //The first line contains an integer T, the number of test-cases. T testcases follow.
            for (int i = 0; i < t; i++) {
                int n, m;   //For each test case, the first line will contain two integers N and M separated by a single space
                System.out.println("type length of the 3d array");
                n = in.nextInt();
                System.out.println("defines the number of operations ");
                m = in.nextInt();
                int matriz[][][] = new int[n][n][n];  //N defines the N * N * N matrix.
                for (int j = 0; j < m; j++) {    //M defines the number of operations.
                    System.out.println("type update for update the another way you will use query");
                    String str = in.next();
                    if (str.toUpperCase().equals(UPDATE)) {
                       mainControler.update(matriz, in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()); // update controller
                    } else {
                        int resulAddition = mainControler.query(matriz, in.nextInt(), in.nextInt(), in.nextInt(),
                                in.nextInt(), in.nextInt(), in.nextInt());   // query controller
                        System.out.println(resulAddition);
                    }
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
