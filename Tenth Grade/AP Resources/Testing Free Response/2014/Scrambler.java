import java.util.ArrayList;

public class Scrambler {

    public static String scrambleWord(String word){
        int current = 0;
        String result="";
        while (current < word.length()-1){
            if (word.substring(current,current+1).equals("A") && !word.substring(current+1,current+2).equals("A")){
                result += word.substring(current+1,current+2);
                result += "A";
                current += 2;
            }
            else {
                result += word.substring(current,current+1);
                current++;
            }
        }
        if (current < word.length()){
            result += word.substring(current);
        }
        return result;
    }

    public static void scrambleOrRemove(ArrayList<String> wordList) {

        for (int i = wordList.size() -1; i >= 0; i--) {
            String temp;
            String scrambled;
            temp = wordList.get(i);
            scrambled = scrambleWord(wordList.get(i));
            wordList.set(i, scrambled);
            if (temp.equals(wordList.get(i))) {
                wordList.remove(wordList.get(i));
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("TAN");
        list.add("ABRACADABRA");
        list.add("WHOA");
        list.add("APPLE");
        list.add("EGGS");

        scrambleOrRemove(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}