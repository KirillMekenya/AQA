import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transliterator {
    private Map<Character, String> characterMap;
    private ArrayList<Character> charRusList;

    public Map<Character, String> createMapRules() {
        this.characterMap = new HashMap<Character, String>();
        this.characterMap.put('а', "a");
        this.characterMap.put('б', "b");
        this.characterMap.put('в', "v");
        this.characterMap.put('г', "g");
        this.characterMap.put('д', "d");
        this.characterMap.put('е', "e");
        this.characterMap.put('ё', "yo");
        this.characterMap.put('ж', "zh");
        this.characterMap.put('з', "z");
        this.characterMap.put('и', "i");
        this.characterMap.put('й', "y");
        this.characterMap.put('к', "k");
        this.characterMap.put('л', "l");
        this.characterMap.put('м', "m");
        this.characterMap.put('н', "n");
        this.characterMap.put('о', "o");
        this.characterMap.put('п', "p");
        this.characterMap.put('р', "r");
        this.characterMap.put('с', "s");
        this.characterMap.put('т', "t");
        this.characterMap.put('у', "u");
        this.characterMap.put('ф', "f");
        this.characterMap.put('х', "h");
        this.characterMap.put('ц', "с");
        this.characterMap.put('ч', "ch");
        this.characterMap.put('ш', "sh");
        this.characterMap.put('щ', "sch");
        this.characterMap.put('ъ', "'");
        this.characterMap.put('ы', "'i");
        this.characterMap.put('ь', "'");
        this.characterMap.put('э', "a");
        this.characterMap.put('ю', "yu");
        this.characterMap.put('я', "ya");
        this.characterMap.put(' ', " ");
        this.characterMap.put('.', ".");
        this.characterMap.put(',', ",");
        this.characterMap.put('!', "!");
        this.characterMap.put('?', "?");
        this.characterMap.put('-', "-");

        return this.characterMap;
    }

    public ArrayList<Character> parseStringToChars(String rusString) {
        ArrayList<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < rusString.length(); i++) {
            charList.add(rusString.toLowerCase().charAt(i));
        }
        this.charRusList = charList;
        return this.charRusList;
    }

    public void transliterateString(String rusString) {
        createMapRules();
        StringBuilder transliteEng = new StringBuilder();
        for (Character ch :
                parseStringToChars(rusString)) {
            transliteEng.append(this.characterMap.get(ch));
        }
        System.out.println(transliteEng);
    }
}
