class parent{

    void define() {
        System.out.println("Inside parent class");
    }
    
}

class child extends parent{

    void print() {
        System.out.println("Inside child class");

    }

}

public class inheritance {

    public static void main(String[] args) {

        child display = new child();
        display.define();
        display.print();

    }
}