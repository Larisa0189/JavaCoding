package variables;

public class VariableEx {

    public static void main(String[] args) {

        int passengers; //declararea;
        passengers = 0; //initierea;
        passengers = passengers + 5; //update;
        passengers = passengers - 2 + 3;
        passengers = passengers + 2;
        System.out.println(passengers);

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops += 1;
        fare += 5;
        stops += 1;
        fare += 3;
        stops += 1;
        fare += 7;
        System.out.println(stops);
        System.out.println(fare);


    }
}