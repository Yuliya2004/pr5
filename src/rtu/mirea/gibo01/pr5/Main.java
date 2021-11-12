package rtu.mirea.gibo01.pr5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Week day= Week.Saturday;
 Week num= day;
 System.out.println(day.ordinal()+1);
 System.out.println(num.name());
 for(Week i:day) {
 System.out.println(Week.values());
        }*/
        rtu.mirea.gibo01.pr5.Planet planet = rtu.mirea.gibo01.pr5.Planet.EARTH;
        System.out.println("Какой ваш вес");
        Scanner sc = new Scanner(System.in);
        int ves=sc.nextInt();
        double mas=ves/planet.surfaceGravity();
        for (rtu.mirea.gibo01.pr5.Planet p : rtu.mirea.gibo01.pr5.Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mas));
        DecimalFormat fmt=new DecimalFormat("#.##");
        for (rtu.mirea.gibo01.pr5.Planet p : rtu.mirea.gibo01.pr5.Planet.values()) System.out.println("Ваш вес на планете: "+p+" "+fmt.format(p.surfaceWeight(mas)));

    }
}
