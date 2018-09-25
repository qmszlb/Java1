import java.util.Scanner;
class JFC {
    private  static double a;
    private  static double b;
    private  static double c;
    private  static double getD(){
        double D;
        D =((b * b) - 4 * a * c);
        return D;
    }
    private static double getE() {
        double E;
        E = ((-b +Math.sqrt(getD()) ) / (2 * a));
        return E;
    }
    private static  double getF(){
        double F;
         F =( (-b - Math.sqrt(getD())) / (2 * a));
        return F;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入该方程的二次项系数a:");
        a = sc.nextDouble();
        System.out.println("请输入该方程的一次项系数b:");
        b = sc.nextDouble();
        System.out.println("请输入该方程的常数项c:");
        c = sc.nextDouble();
        if (getD() < 0) {
            System.out.println("该方程无解");
        }
        if (getD() == 0) {
            System.out.println("该方程有两个相同的解:" + getE());
        }
        if (getD()> 0) {
            System.out.println("该方程有两个不同的解：分别为"+ getE()+"和"+ getF());
        }
    }
}
