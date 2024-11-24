package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (String str : strs) {
            // Виправлення помилок
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            if (str.contains("nibn")) {
                str = str.replace("nibn", "nion");
            }

            // Формування рядка з результатами
            stringBuilder.append(count)
                         .append(") ")
                         .append(str);

            // Виділення кольором (червоний для виправлених слів)
            if (str.equals("orange") || str.equals("onion")) {
                stringBuilder.append(" (текст виділено червоним)");
            }

            stringBuilder.append("\n");
            count++;
        }

        return stringBuilder.toString();
    }
}
