/*

 */
package textlinenumberui;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Class responsible for handling all operations on files
 */
public class FileManager {

    /**
     * Open a file and extract its content
     *
     * @param filePath File to get the content from
     * @return Map : key as result and payload as file content or error
     */
    public Map<String, String> getFileContent(String filePath) {

        String text = "";
        Map<String, String> map = new HashMap<String, String>();

        try {
            String fileContent;
            map.put("result", "success");
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Read every line of the file

            while ((fileContent = br.readLine()) != null) {
                text += fileContent + "\n";
            }
            map.put("payload", text);

        } catch (Exception e) {
            //There are an error
            map.put("result", "fail");
            map.put("payload", e.getMessage());
        }
        return map;
    }

}
