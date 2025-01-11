package project0pt2;

public class Main {
    public static void main(String[] args) {
        passwordgenerator password = new passwordgenerator();
        System.out.println(password);

        passwordgenerator[] passwords = new passwordgenerator[5];
        for (int i = 0; i < 5; i++) {
            passwords[i] = new passwordgenerator();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + " " + passwords[i]);
        }

        password.setLength(20);
        System.out.println(password);

    }
}