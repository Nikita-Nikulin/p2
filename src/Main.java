import java.util.Scanner;
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

        Book c= new Book();
        c.setName("Witcher");
        c.setAutor("Sapkovskiy");
        c.setPages(777);

        Dog d = new Dog();
        Scanner input = new Scanner(System.in);
        System.out.print("Input name: ");
        d.setName (input.nextLine());
        System.out.print("Input age: ");
        d.setAge(input.nextInt());
        d.ageCalc();

        Dog e = new Dog();
        System.out.print("Input name: ");
        e.setName (input.next());
        System.out.print("Input age: ");
        e.setAge(input.nextInt());
        e.ageCalc();
        input.close();


        System.out.println(d);
        System.out.println(e);


    }
}
