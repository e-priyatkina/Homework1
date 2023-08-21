

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var friend = 19;
        friend *= 2;
        System.out.println (friend);
        friend /= 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog *= 10;
        System.out.println (frog);
        frog /= 3.5;
        System.out.println (frog);
        frog += 4;
        System.out.println (frog);

        var weightOne = 78.2;
        var weightTwo = 82.7;
        var general = weightOne + weightTwo;
        System.out.println (general);
        var difference = weightTwo - weightOne;
        System.out.println (difference);

        difference = weightTwo - weightOne;
        difference = weightTwo % weightOne;


        var total = 640;
        var oneEmployee = 8;
        var employees = total / oneEmployee;
        System.out.println ("Всего работников в компании - " + employees + " человек");

        employees += 94;
        oneEmployee = total / employees;
        System.out.println ("Если в компании работает " + employees + " человека, то всего " + oneEmployee + " часа работы может быть поделено между сотрудниками");
    }
}
