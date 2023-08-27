package conditionals;

public class IfElseMixed {
    public static void main(String[] args) {
        float temperature = -5;
        if (temperature <= 0) {
            System.out.println("Este iarna, imbracate foarte gros!");
        } else if (0 < temperature && temperature < 20) {
            System.out.println("Este frig, ia pe tine o geaca!");
        } else {
            System.out.println("Este cald, poti sa mergi la plimbare!");
        }
    }
}
