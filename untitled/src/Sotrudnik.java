public class Sotrudnik extends Human{
    private String dolzhnost;

    Sotrudnik(String name, String dolzhnost) {
        super(name);
        this.dolzhnost = dolzhnost;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Должность " + dolzhnost);
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }
    public String getDolzhnost(){
        return dolzhnost;
    }
}
