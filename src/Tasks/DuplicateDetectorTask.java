package Tasks;

import Session2.DuplicateDetector;
import lib.Myprintln;

import java.util.ArrayList;

public class DuplicateDetectorTask implements Runnable{
    @Override
    public void run() {
        DuplicateDetector d = new DuplicateDetector();
        ArrayList<String> duplicateStrings = d.findDuplicateStrings();
        Myprintln.println(duplicateStrings);
    }
}
