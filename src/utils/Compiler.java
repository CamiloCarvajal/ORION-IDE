/*

 */
package utils;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class Compiler {

    /**
     *
     * https://www.geeksforgeeks.org/java-lang-processbuilder-class-java/
     */
    public void compiler() {

        // creating list of process
        List<String> list = new ArrayList<String>();
        list.add("notepad.exe");
        list.add("xyz.txt");

        // create the process
        ProcessBuilder build = new ProcessBuilder(list);

        // checking the command in list
        System.out.println("command: " + build.command());
    }
}
