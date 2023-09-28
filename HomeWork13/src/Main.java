public class Main {
    public static void main(String[] args) {
        Author oneBook = new Author("Lev", "Tolstoy");
        Author twoBook = new Author("Ivan", "Turgenev");
        Author threeBook = new Author("Ivan", "Turgenev");

        Book one = new Book("Voyna i mir", oneBook, 1867);
        Book two = new Book("Mumu", twoBook, 1854);
        Book three = new Book("Mumu", threeBook, 1854);

        //System.out.println(two.getYear());
        //two.setYear(1855);

        System.out.println("Name: " + one.getName() + ", author: " + one.getAuthor().getName() + " " +
                one.getAuthor().getSurname() + ", year: " + one.getYear());
        System.out.println("Name: " + two.getName() + ", author: " + two.getAuthor().getName() + " " +
                two.getAuthor().getSurname() + ", year: " + two.getYear());

        System.out.println();

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(twoBook.equals(threeBook));
        System.out.println(two.equals(three));
        System.out.println(twoBook.hashCode());
        System.out.println(two.hashCode());
    }
}