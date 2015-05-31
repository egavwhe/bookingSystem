/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package bookingSystem.main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class FileReader {

    private static final String FILENAME = "contractors.txt";

    public static List<String> readFile() {
        Path path = Paths.get(FILENAME);
        List<String> lines = null;
        Charset charset = Charset.defaultCharset();
        try {
            lines = Files.readAllLines(path, charset);
        } catch (IOException e) {
            System.out.printf("Could not read file %s successfully.%n", FILENAME);
        }
        //        for (String line : lines) {
        //            System.out.println(line);
        //        }
        return lines;
    }

}
