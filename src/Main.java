public class Main {

    public static void main(String[] args) {
        CustomCollection custom = new CustomCollection(5, new CustomCollection(), '5', "Hello,World!!!", new Main(), "I want to get a job finally!");

        Object myObj = new Object();

        System.out.println(custom.start(myObj)+" - длина моей коллекции вместе с моим объектом - счетчиком.");

    }
}
