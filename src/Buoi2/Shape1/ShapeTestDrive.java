package Buoi2.Shape1;

public class ShapeTestDrive {
    public static void main(String[] args) {
        System.out.println("Hình Tam Giác");
        triangle triangle = new triangle("mùa xuân");
        triangle.rotate();
        triangle.playSound();

        System.out.println("Hình Vuông");
        Square square = new Square("mùa hè");
        square.rotate();
        square.playSound();

        System.out.println("Hình Tròn");
        Circle circle = new Circle("Mùa thu");
        circle.rotate();
        circle.playSound();

        System.out.println("Hình Amoeba");
        Amoeba amoeba = new Amoeba("Mùa đông", 7.7, 2.2);
        amoeba.rotate();
        amoeba.playSound();
    }

}
