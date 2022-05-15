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

    private String filePath;

    /**
     * Open a file and extract its content
     *
     * @param filePath File to get the content from
     * @return Map : key as result and payload as file content or error
     */
    public Map<String, String> getFileContent(String filePath) {

        String text = "";
        BufferedReader reader = null;
        Map<String, String> map = new HashMap<String, String>();

        try {
            String fileContent;
            map.put("result", "success");
            File file = new File(filePath);
            reader = new BufferedReader(new FileReader(file));
            this.filePath = filePath;

            //Read every line of the file
            while ((fileContent = reader.readLine()) != null) {
                text += fileContent + "\n";
            }
            map.put("payload", text);

        } catch (Exception e) {
            //There are an error
            map.put("result", "fail");
            map.put("payload", e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return map;
    }

    public boolean saveFileContent(String content) {

        if (this.filePath != null) {

            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(this.filePath));
                writer.write(content);
            } catch (Exception e) {
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                }
            }
            return true;
        }
        return false;
    }

}
