class Grandparent {

    void say() {
        System.out.println("I rule over class father and child.");
    }

}

class father extends Grandparent {

    void tell() {
        System.out.println("I listen to my father who is class Grandparent");
    }

}

class child extends father {

    void listen() {
        System.out.println("I listen to my father who is class father.");
    }
}

public class hierarical_inheritance {

    public static void main(String[] args) {

        child display = new child();
        display.listen();
        display.tell();
        display.say();

    }
}