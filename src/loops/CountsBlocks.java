package loops;

public class CountsBlocks {
    public static void main(String[] args) {

        int result = 0;
        int level = 5;
        for (int i = 1; i <= level; i++) {
            result = result + (i * i);
        }
        System.out.println(result);
    }
}
