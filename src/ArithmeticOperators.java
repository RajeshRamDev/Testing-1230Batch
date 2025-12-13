public class ArithmeticOperators {
    int a;
    int b;
    public void addNum(int a, int b)
    {
        int c;
        c= a+b;
        System.out.println(c);
    }
    public void subNum(int a, int b)
    {
        int d;
        d = a-b;
        System.out.println(d);
    }
    public void mulNum(int a, int b)
    {
        int e;
        e = a*b;
        System.out.println(e);
    }
    public void divNum(int a, int b)
    {
        int f;
        f = a/b;
        System.out.println(f);
    }
    public void modNum(int a, int b)
    {
        int g;
        g = a/b;
        System.out.println(g);
    }

    public static void main(String[] args) {
        ArithmeticOperators ao = new ArithmeticOperators();
        ao.addNum(10,20);
        ao.subNum(50,10);
        ao.mulNum(5,10);
        ao.divNum(20,4);
        ao.modNum(100,10);
    }

}


