package conditionals;

public class SwitchExample {
    public static void main(String[] args) {

//        String dayOfWeek = "Joi";
//
//        switch (dayOfWeek) {
//            case "Luni":
//                System.out.println("Iarba nu creste!");
//                break;
//            case "Sambata":
//            case "Duminica":
//                System.out.println("Este weekend");
//                break;
//            default:
//                System.out.println("Este mijlocul saptamanii");
//                break;
//        }

        int dayOfWeek = 7;
        String schedule = "";
        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 3:
                schedule = "Meetings all day.";
                break;
            case 4:
                schedule = "Work from home.";
                break;
            case 5:
                schedule = "Game night after work.";
                break;
            case 6:
            case 7:
            default:
                schedule = "Free!";
                break;
        }
        ;
        System.out.println(schedule);


        double a = 5.0;
        double b = 3.4;
        char semn = '%';
        switch (semn) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Operatiea nu poate fi efectuata");
                break;
        }
    }
}
