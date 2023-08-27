package Exercices.Apartament;

public class Main {
    public static void main(String[] args) {
        Camera camera1 = new Camera();
        camera1.marimeSuprafata = 5;
        camera1.obiect1 = "scaun";
        camera1.obiect2 = "masa";
        camera1.obiect3 = "covor";
        camera1.printAllParameters();

        Camera camera2 = new Camera();
        camera2.marimeSuprafata = 4;
        camera2.obiect1 = "pat";
        camera2.obiect2 = "noptiera";
        camera2.obiect3 = "dulap";
        camera2.printAllParameters();

        Camera camera3 = new Camera(2, "ghiuveta", "toaleta", "cabina de dus");
        camera3.printAllParameters();
    }
}
