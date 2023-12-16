class CompositionExample {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Acer",
                new Monitor());
    }
    static class Monitor {
        Monitor(){}
        public static void showImage() {
            System.out.println("Показываю картинку");
        }
    }

    static class Computer {
        Computer(String name, Monitor monitor){
            System.out.println(name);
            monitor.showImage();
        }
    }
}
