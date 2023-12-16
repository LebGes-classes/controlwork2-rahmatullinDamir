
public class Main {
    public static void main(String[] args) {
        Sotrudnik[] sotrudnikList = new Sotrudnik[2];
        Posetitel[] posetitelList = new Posetitel[2];

        sotrudnikList[0] = new Sotrudnik("Ivan", "Director");
        sotrudnikList[1] = new Sotrudnik("Alexey", "Manager");
        posetitelList[0] = new Posetitel("Vanya", 18);
        posetitelList[1] = new Posetitel("Andrey", 23);


        for (Sotrudnik sotrudnik: sotrudnikList) {
            sotrudnik.printInfo();
        }
        System.out.println();
        for (Posetitel posetitel: posetitelList) {
            posetitel.printInfo();
        }

    }
}