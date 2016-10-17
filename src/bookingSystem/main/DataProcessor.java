package bookingSystem.main;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    /**
     * @param rawData
     *
     */
    public static List<Contractor> organiseData(List<String> rawData) {
        List<Contractor> contractors = new ArrayList<>();
        for (String line : rawData) {
            String[] contractorData = line.split(",");
            Contractor contractor = new Contractor(contractorData);
            contractors.add(contractor);
        }
        return contractors;
    }
}
