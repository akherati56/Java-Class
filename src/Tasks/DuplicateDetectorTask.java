package Tasks;

import Service.Session2.DuplicateDetectorService;
import Vendor.Myprintln;

import java.util.ArrayList;

public class DuplicateDetectorTask implements Runnable{
    @Override
    public void run() {
        DuplicateDetectorService d = new DuplicateDetectorService();
        ArrayList<String> duplicateStrings = d.findDuplicateStrings();
        Myprintln.println(duplicateStrings);
    }
}
