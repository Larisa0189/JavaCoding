package varargs;

public class VarargsExemple {

    public static void main(String[] args) {
        VarargsExemple object = new VarargsExemple();
        System.out.println(object.calculateSum(2, 20));
        System.out.println(object.calculateSum(2, 20, 5));
        System.out.println(object.sum());
        System.out.println(object.sum(5));
        System.out.println(object.sum(5, 10, 52));
        System.out.println(object.sum(10, 85, 2, 54));
        System.out.println(object.sum(2, 10));

        object.showAverageStudent("Larisa", 10, 7, 8, 9);
        System.out.println("------------------------------");
        System.out.println(object.findTheLongestWord("Alina", "Larisa", "Andrei", "Dan", "Simona"));


    }

    public int calculateSum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    public int calculateSum(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }

    public int sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public void showAverageStudent(String studentName, int... grades) {
        float average = 0;
        for (int i = 0; i < grades.length; i++) {
            average += grades[i];
        }
        average /= grades.length;
        System.out.println("Media aritmetica a notelor pt studentul " + studentName + " este " + average);
    }

    public String findTheLongestWord(String ... names){
        String longestName=names[0];
        for(String name : names){
            if(name.length() > longestName.length()){
                longestName=name;
            }
        }
        return longestName;
    }
}
