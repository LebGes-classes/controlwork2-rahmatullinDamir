public class Posetitel extends Human {
    private int age;

    Posetitel(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Возраст " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
