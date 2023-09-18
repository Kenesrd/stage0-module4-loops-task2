package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String str = "";
        while (counter <= chars.length-1){
            str += chars[counter++];
        }
        System.out.print(str);
    }

}
