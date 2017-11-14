package chapter1_1;

/**
 * Created by yujinxiong on 2017/5/12.
 */
public class Sqrt {
    public static void main(String[] agrs) {
        System.out.println(sqrt(2.0));
    }
    public static double sqrt(double c)
    {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }
}
