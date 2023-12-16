abstract public class Human {
    private String name;
    Human(String name){
        this.name = name;
    }

    protected void printInfo(){
        System.out.println("Имя " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
