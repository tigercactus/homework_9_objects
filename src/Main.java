public class Main {


    public static void main(String[] args) {
        Author jLondon = new Author("Лондон","Джеймс");
        Author jRollins = new Author("Роллинс", "Джеймс");
        Book whiteFang = new Book("Белый клык", jLondon, 1906);
        Book iceberg = new Book("Айсберг", jRollins, 2000);
        Book icebergJr = new Book("Айсберг", jRollins, 2003);
        iceberg.setYear(2003);

        System.out.println(whiteFang);
        System.out.println(iceberg);
        System.out.println(icebergJr);
        System.out.println(iceberg.equals(icebergJr));
        System.out.println(iceberg.hashCode() == icebergJr.hashCode());


    }
}