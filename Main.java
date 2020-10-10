import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harun088 on 10.10.2020.
 */
public class Main {

    public static void main(String[] args){
        List<String> words = wrapText("Sakın kelime uzunluğu on beş karakteri geçmesin ayrıca kontrol gerekir.", 12);
        System.out.println(words);
    }

    public static List<String> wrapText(String inputText, int maxLength){

        int borderIndex = 0, firstBlankIndex = -1, lastBlankIndex = 0;
        List<String> words = new ArrayList<String>();

        while(lastBlankIndex < inputText.length()){

                for (int i = borderIndex; i < borderIndex + maxLength + 1; i++) {
                    if(i <  inputText.length() - 1) {
                        if (inputText.charAt(i) == ' ') {
                            lastBlankIndex = i;
                        }

                    }else if(i ==  inputText.length() - 1) {
                        lastBlankIndex = inputText.length();
                    }
                }

                if(firstBlankIndex < lastBlankIndex) {
                    words.add(inputText.substring(firstBlankIndex + 1, lastBlankIndex));
                }

                firstBlankIndex = lastBlankIndex;
                borderIndex = lastBlankIndex;

        }

        return words;

    }
}
