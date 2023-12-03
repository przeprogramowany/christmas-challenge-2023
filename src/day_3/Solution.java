package day_3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Rodzina zrobiła zakupy na święta i z paragonu chcą policzyć, ile pieniędzy wydali na konkretną kategorię.
 * Napisz program, który policzy wydatki rodziny w zależności od kategorii i doda je do mapy, która będzie
 * przechowywała wartości (KATEGORIA - SUMA). Wypisz stworzoną mapę na ekranie.
 */

public class Solution {
    public static void main(String[] args) {

        List<Receipt> shoppingReceipts = prepareShoppingReceipt();
        Map<Category, BigDecimal> sumByCategory = new HashMap<>();

        shoppingReceipts
                .forEach(receipt ->
                        sumByCategory.put(receipt.category(),
                                sumByCategory
                                        .getOrDefault(receipt.category(), BigDecimal.ZERO)
                                        .add(receipt.price())));

        System.out.println(sumByCategory);
    }

    private static List<Receipt> prepareShoppingReceipt() {
        return List.of(
                new Receipt(
                        "Pierogi",
                        Category.FOOD,
                        new BigDecimal(10)),

                new Receipt(
                        "Barszcz czerwony",
                        Category.FOOD,
                        new BigDecimal(10)),

                new Receipt(
                        "Cukier",
                        Category.FOOD,
                        new BigDecimal(5)),

                new Receipt(
                        "Woda",
                        Category.DRINKS,
                        new BigDecimal(2)),

                new Receipt(
                        "Sok pomarańczowy",
                        Category.DRINKS,
                        new BigDecimal(4)),

                new Receipt(
                        "Klocki LEGO",
                        Category.PRESENTS,
                        new BigDecimal(100)),

                new Receipt(
                        "Samochód zdalnie sterowany",
                        Category.PRESENTS,
                        new BigDecimal(130))
        );
    }
}
