public class stringrevision {
    public static boolean isPalindrome(String str) {
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String compress(String str) {
        String Str = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            Str += str.charAt(i);
            if (count > 1) {
                Str += count.toString();
            }
        }
        return new String(Str);
    }

    public static void main(String args[]) {
        // String path = "WNEENESENNN";
        // String Str = "racecar";
        // String str = "HELLO WORLD";

        // System.out.println(getShortestPath(path));
        // System.out.println(isPalindrome(Str));
        // System.out.println(substring(str, 0, 5));
        // String fruits[] = { "apple", "mango", "banana" };
        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (fruits[i].compareTo(largest) > 0) {
        // largest = fruits[i];
        String str = "aaabbccdee";
        System.out.println(compress(str));
    }
}
