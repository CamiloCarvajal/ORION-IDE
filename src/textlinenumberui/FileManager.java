/*

 */
package textlinenumberui;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FileManager {

    public Map<String, String> getFileContent(String filePath) {

        String text = "";
        Map<String, String> map = new HashMap<String, String>();

        try {

            String fileContent;
            map.put("result", "success");
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((fileContent = br.readLine()) != null) {
                text += fileContent + "\n";
            }
            map.put("payload", text);

        } catch (Exception e) {
            map.put("result", "fail");
            map.put("payload", e.getMessage());

        }
        return map;
    }

}
