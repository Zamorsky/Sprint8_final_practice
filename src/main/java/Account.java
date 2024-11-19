public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
    /*
        Требования:
        1. Длина строки должна быть не меньше 3 и не больше 19 символов.
        2. В строке должен быть только один пробел.
        3. Пробел не должен быть в начале или в конце строки.
    */

        // Проверяем, если строка null или её длина не соответствует требованиям
        if (name == null || name.length() < 3 || name.length() > 19) {
            return false; // Условие не выполнено
        }

        // Проверяем количество пробелов в строке
        int spaceCount = name.length() - name.replace(" ", "").length();
        if (spaceCount != 1) {
            return false; // Если пробелов больше или меньше одного, условие не выполнено
        }

        // Проверяем, что пробел не находится в начале или в конце строки
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false; // Условие нарушено
        }

        // Все условия выполнены
        return true;
    }
}