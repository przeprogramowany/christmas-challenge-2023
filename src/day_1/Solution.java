package day_1;

/**
 * Wyzwanie rozpoczynamy od rysowania w konsoli. Napisz program, który wygeneruje
 * choinkę. Jeśli potrafisz, zrób tak, aby użytkownik mógł podać wysokość drzewka :)
 * Może ona być po prostu trójkątem albo zawierać dodatkowo jakieś ozdoby i pień.
 * Wszystko zależy od Ciebie. Powodzenia!
 */

public class Solution {
    private static final String EMPTY_SPACE = " ";
    private static final String PART_OF_CHRISTMAS_TREE = "*";
    private static final String TRUNK_FOR_BIG_CHRISTMAS_TREE = "| |";
    private static final String TRUNK_FOR_SMALL_CHRISTMAS_TREE = " |";

    public static void main(String[] args) {
        int height = 7;
        drawChristmasTree(height);
    }

    private static void drawChristmasTree(int height) {
        int numberOfSpaces = height;
        int christmasTreeWidth = 1;
        for (int i = 1; i <= height; i++) {
            numberOfSpaces--;

            drawEmptySpaces(numberOfSpaces);
            drawChristmasTreeParts(christmasTreeWidth);

            christmasTreeWidth += 2;
        }
        drawChristmasTreeTrunk(height);
    }

    private static void drawEmptySpaces(int numberOfSpaces) {
        for (int i = numberOfSpaces; i > 0; i--) {
            System.out.print(EMPTY_SPACE);
        }
    }

    private static void drawChristmasTreeParts(int christmasTreeWidth) {
        for (int i = 0; i < christmasTreeWidth; i++) {
            System.out.print(PART_OF_CHRISTMAS_TREE);
        }
        System.out.println(EMPTY_SPACE);
    }

    private static void drawChristmasTreeTrunk(int height) {
        drawEmptySpaces(height - 2);
        if (height > 2) {
            System.out.print(TRUNK_FOR_BIG_CHRISTMAS_TREE);
        } else {
            System.out.print(TRUNK_FOR_SMALL_CHRISTMAS_TREE);
        }
    }
}