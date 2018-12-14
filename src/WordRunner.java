public class WordRunner {
    public static void main(String[] args)
    {
        HiddenWord hidden = new HiddenWord("Yeet");
        System.out.println(hidden.getHint("yete"));
        System.out.println(hidden.getHint("yeet"));
        System.out.println(hidden.getHint("Yeet"));
    }

}
