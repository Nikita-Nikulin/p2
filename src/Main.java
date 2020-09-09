public class Main {

    public static void main(String[] arg)
    {
        Ball a = new Ball();
        a.setType("Football");
        a.setColor ("Green");
        a.setRadius (13);

        Ball b = new Ball();
        b.setType("WaterPolo");
        b.setColor ("Yellow");
        b.setRadius (8);

        System.out.println(a);
        System.out.println(b);

    }
}
