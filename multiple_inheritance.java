class Space {

    void space() {
        System.out.println("I am space");
    }

}

class stars extends Space {

    void sun() {
        System.out.println("I am sun the star in the solor system.");
    }

}

class planets extends Space {

    void planet() {
        System.out.println("We are planets in solar system.");
    }

}

public class multiple_inheritance {

    public static void main(String[] args) {
        stars introduce = new stars();
        planets intro = new planets();

        introduce.sun();
        intro.planet();

    }
}