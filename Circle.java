interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("The shape of the circle is round");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("The shape of the rectangle is rectangular");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Triangular shape");
    }
}
class Main {
    public static void main(String[] args) {
        Circle o1 = new Circle();
        Triangle o3 = new Triangle();
        Rectangle o2= new Rectangle();

        o1.draw();
        o3.draw();
        o2.draw();
    }
}
