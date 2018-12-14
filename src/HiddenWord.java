public class HiddenWord {
    private String word;
    public HiddenWord(String word)
    {
        this.word = word;
    }

    public String getHint(String guess)
    {
        String hint = "";
        for (int i = 0; i < word.length(); i++)
        {
            if((word.substring(i,i+1)).equals(guess.substring(i,i+1))) hint += guess.substring(i,i+1);
            else if (word.indexOf(guess.substring(i,i+1)) > -1) hint += "+";
            else hint += "*";
        }
        return hint;
    }
}
