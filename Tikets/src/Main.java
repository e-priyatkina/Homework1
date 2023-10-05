import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s = {"2", "2", "1", "3", "4", "5", "5"};
        int size = s.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (s[i].equals(s[j]) && i != j) {
                    System.arraycopy(s, i + 1, s, i, size - i - 1);
                    s[size - 1] = null;
                    size = size - 1;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(s[i]);
        }

        String sCopy = "";

        for (int i = 0; i < size; i++) {
            sCopy = sCopy + s[i];
        }

        System.out.println(sCopy);
    }
}

