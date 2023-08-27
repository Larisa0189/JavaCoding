package Exercices.Apartament;

public class Camera {
    String obiect1;
    String obiect2;
    String obiect3;
    int marimeSuprafata;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setMarimeSuprafata(int marimeSuprafata) {
        this.marimeSuprafata = marimeSuprafata;
    }

    public void setObiect1(String obiect1) {
        this.obiect1 = obiect1;
    }

    public void setObiect2(String obiect2) {
        this.obiect2 = obiect2;
    }

    public void setObiect3(String obiect3) {
        this.obiect3 = obiect3;
    }

    public Camera(int marimeSuprafata, String obiect1, String obiect2, String obiect3) {
        this.marimeSuprafata = marimeSuprafata;
        this.obiect1 = obiect1;
        this.obiect2 = obiect2;
        this.obiect3 = obiect3;
    }
    public Camera(){

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getObiect1() {
        return obiect1;
    }

    public String getObiect2() {
        return obiect2;
    }

    public String getObiect3() {
        return obiect3;
    }

    public int getMarimeSuprafata() {
        return marimeSuprafata;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void printAllParameters() {
        System.out.println(String.format("Camera este de %s metri patrati si contine: %s, %s, %s \n", marimeSuprafata, obiect1, obiect2, obiect3));
    }
}
