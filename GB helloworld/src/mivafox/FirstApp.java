package mivafox;

public class FirstApp
{
    public static void main(String[] args)
    {
    }

    {
        int i = 1;
        byte b = 1;
        short sh = 2;
        long l = 3;
        float fl = 24587;
        double d = 6.0f;
        char ch = '3';
        boolean bul = true;
        String S = "name";
    }
    public static float second(float a, float b, float c, float d)
    {
        return a*(b+(c/d));
    }
    public static boolean third (int a, int b)
    {
        return 10 <= a + b && a + b <= 20;
    }
    public static void fifth(int a)
    {
        System.out.println( a<0 ? "-" : "+");
    }
    public static boolean sixth (int i)
    {
        return i<0;
    }
    public static void seventh(String name)
    {
        System.out.printf("Привет, %s!", name);
    }
    public static boolean eighth (int year)
    {
        return year % 100!= 0 && year % 4 == 0 || year % 400 == 0;
    }
}