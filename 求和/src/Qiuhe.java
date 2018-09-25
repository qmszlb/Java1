import java.util.Scanner;

class Qiuhe {
    static double A;
    static double B;

    static double getC() {
        double C = A + B;
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A");
        A = sc.nextDouble();
        System.out.println("请输入数字B");
        B = sc.nextDouble();
        System.out.println("两数的和为" + getC());

    }
}