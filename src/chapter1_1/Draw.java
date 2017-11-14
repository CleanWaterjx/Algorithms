package chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by yujinxiong on 2017/5/16.
 *  StdDraw.filledRectangle(x,y,rw,rh)
 *  x the <em>x</em>-coordinate of the center of the rectangle
 *  y the <em>y</em>-coordinate of the center of the rectangle
 *  halfWidth one half the width of the rectangle
 *  halfHeight one half the height of the rectangle
 */
public class Draw {
    public static void main(String[] agrs) {
    //  functionValues();
     // randomArray();
        sortArray();
    }
    public static void functionValues(){
        int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 1;i <= N;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
    public  static void randomArray(){
        int N = 50;
        double[] a  = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.random();
        for (int i = 0; i < N; i++){
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static  void  sortArray(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0;i< N;i++)
            a[i] = StdRandom.random();
        Arrays.sort(a);
        for (int i = 0;i< N;i++){
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

}
