public class Main {


    public static void main(String[] args) {
        Author jLondon = new Author("Лондон","Джеймс");
        Author jRollins = new Author("Роллинс", "Джеймс");
        Book whiteFang = new Book("Белый клык", jLondon, 1906);
        Book iceberg = new Book("Айсберг", jRollins, 2000);
        iceberg.setYear(2003);

        System.out.println(whiteFang);
        System.out.println(iceberg);


    }
}