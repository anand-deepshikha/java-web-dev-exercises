package exercises;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Alice {
    public static void main(String [] args)
    {
        String story="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String wordToSearch;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word to search");
        wordToSearch=input.next();
        if(story.toLowerCase().contains(wordToSearch.toLowerCase()))
        {
            System.out.println("Story contains the word");
            int index=story.indexOf(wordToSearch);
            System.out.println("\nword is present at index "+(index+1)+" and is "+wordToSearch.length()+" characters long");
            String newStory=story.toLowerCase().replace(wordToSearch.toLowerCase(),"");
            System.out.println("new story: "+newStory);
        }

        else
            System.out.println("story does not contain word.");
    }
}
