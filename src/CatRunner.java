public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Frank", 2,6.5 );
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Lamb", 8, 5.4);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
