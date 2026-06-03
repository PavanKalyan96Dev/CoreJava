//sTRING METHODS
class j_82_StringMethods {
    public static void main(String args[]) {

        String str = "  Pavan Kalyan  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 3. toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 5. charAt()
        System.out.println("Char at index 2: " + trimmed.charAt(2));

        // 6. substring()
        System.out.println("Substring (0,5): " + trimmed.substring(0, 5));

        // 7. replace()
        System.out.println("Replace: " + trimmed.replace("Pavan", "Power"));

        // 8. contains()
        System.out.println("Contains 'Kalyan'? " + trimmed.contains("Kalyan"));

        // 9. startsWith()
        System.out.println("Starts with 'Pavan'? " + trimmed.startsWith("Pavan"));

        // 10. endsWith()
        System.out.println("Ends with 'Kalyan'? " + trimmed.endsWith("Kalyan"));

        // 11. equals()
        System.out.println("Equals 'Pavan Kalyan'? " + trimmed.equals("Pavan Kalyan"));

        // 12. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase 'pavan kalyan'? " + trimmed.equalsIgnoreCase("pavan kalyan"));

        // 13. indexOf()
        System.out.println("Index of 'K': " + trimmed.indexOf('K'));

        // 14. lastIndexOf()
        System.out.println("Last Index of 'a': " + trimmed.lastIndexOf('a'));

        // 15. concat()
        System.out.println("Concat: " + trimmed.concat(" is a hero"));

        // 16. split()
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
/*OUTPUT
Length: 16
Trimmed: 'Pavan Kalyan'
Uppercase: PAVAN KALYAN
Lowercase: pavan kalyan
Char at index 2: v
Substring (0,5): Pavan
Replace: Power Kalyan
Contains 'Kalyan'? true
Starts with 'Pavan'? true
Ends with 'Kalyan'? true
Equals 'Pavan Kalyan'? true
EqualsIgnoreCase 'pavan kalyan'? true
Index of 'K': 6
Last Index of 'a': 10
Concat: Pavan Kalyan is a hero
Split words:
Pavan
Kalyan
 */