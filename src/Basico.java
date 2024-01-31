import java.util.Scanner;

public class Basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int citra = sc.nextInt();
            int entrada = sc.nextInt();
            sc.nextLine();

            String text = sc.nextLine().toLowerCase();
            String text2 = sc.nextLine().toLowerCase();
            String a = text + text2;
            String b = text2 + text;

            char[] arr = new char[a.length()];
            char[] arr2 = new char[b.length()];

            for (int i = 0; i < a.length(); i++) {
                arr[i] = a.charAt(i);
                arr2[i] = b.charAt(i);
            }

            for (int i = 0; i < entrada; i++) {
                String c = sc.nextLine();
                System.out.println(decifrador(arr, arr2, c));
            }
            System.out.println();
        }

        sc.close();
    }

    public static String decifrador(char[] arr, char[] arr2, String c) {
        StringBuilder br = new StringBuilder();

        for (int i = 0; i < c.length(); i++) {
            boolean test = false;
            char letra = c.charAt(i);

            for (int k = 0; k < arr.length; k++) {
                if (Character.isUpperCase(letra)) {
                    String temp = Character.toString(letra).toLowerCase();
                    char a = temp.charAt(0);

                    if (a == arr[k]) {
                        String temp2 = Character.toString(arr2[k]).toUpperCase();
                        br.append(temp2);
                        test = true;
                    }
                } else {
                    if (letra == arr[k]) {
                        br.append(arr2[k]);
                        test = true;
                    }
                }

            }

            if (test == false) {
                br.append(letra);
            }

        }

        return br.toString();
    }

}
