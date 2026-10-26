//Name: Mathias Brook

import java.util.*;
public class Peragrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            counts.put(currentChar, counts.getOrDefault(currentChar, 0) + 1);
        }

        int ans = 0;
        for (int count : counts.values())
            if (count % 2 != 0)
                ans++;

        if (ans - 1 > 0)
            System.out.println(ans - 1);
        else
            System.out.println("0");
    }
}
