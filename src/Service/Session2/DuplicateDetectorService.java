package Service.Session2;

import java.util.ArrayList;

public class DuplicateDetectorService {

    private final String[] st1;
    private final String[] st2;

    public DuplicateDetectorService(){
        st1 = new String[]{"test1", "ali", "duplicate word", "another word"};
        st2 = new String[]{"test", "ali", "duplicate word", "another word"};
    }

    public ArrayList<String> findDuplicateStrings(){
        ArrayList<String> duplicateStrings = new ArrayList<>();

        for (String s1 : st1) {
            for (String s2 : st2) {
                if (s1.equals(s2)) {
                    duplicateStrings.add(s1);
                }
            }
        }

        return duplicateStrings;
    }
}
