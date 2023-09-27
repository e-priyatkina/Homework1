public class Main {
    public static void main(String[] args) {
        Author oneBook = new Author("Lev", "Tolstoy");
        Author twoBook = new Author("Ivan", "Turgenev");

        Book one = new Book("Voyna i mir", oneBook, 1867);
        Book two = new Book("Mumu", twoBook, 1854);

        System.out.println(two.getYear());
        two.setYear(1855);

        System.out.println("Name: " + one.getName() + ", author: " + oneBook.getName() + " " + oneBook.getSurname() + ", year: " + one.getYear());
        System.out.println("Name: " + two.getName() + ", author: " + twoBook.getName() + " " + twoBook.getSurname() + ", year: " + two.getYear());
    }
}