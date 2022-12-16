package Homework3.Task1;

public class Bird {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";
        int c = 34;
        Bird bird1 = new Bird();

        bird1.singMethod(a);
        bird1.singMethod(a, b);
        bird1.singMethod();
        bird1.singMethod(a, b, c);

    }

    public void singMethod() {
        System.out.println("I`m singing");
    }

    public void singMethod(String a) {
        System.out.println("I`m walking");

    }

    public void singMethod(String a, String b) {
        System.out.println("I`m flying");
    }

    public void singMethod(String a, String b, int c) {
        System.out.println("I`m Bird");
    }
}
