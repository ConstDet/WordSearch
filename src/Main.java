public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
            "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
            "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
            "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(text);
        String word = "proident";
        if (wordsChecker.hasWord(word)) {
            System.out.println("Слово \"" + word + "\" найдено!");
        } else {
            System.out.println("Слова \"" + word + "\" нет в коллекции!");
        }
    }
}