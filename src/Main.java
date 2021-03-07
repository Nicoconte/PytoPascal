import transpiler.*;

import java.util.Arrays;

import static utils.Utils.*;

public class Main {

    public static void main(String [] args) {
        String path = "D:/JavaProjects/src/test/file.py";

        FileReader reader = new FileReader(path);

        reader.readFile();

        Transpiler transpiler = new Transpiler(path);

        for(Variable variable : transpiler.getVariables()) {
            print(variable.getName() + " -> " + variable.getValue() + " -> " + variable.getType());
        }
    }

}
