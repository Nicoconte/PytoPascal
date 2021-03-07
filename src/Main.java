import transpiler.*;

import static utils.Utils.*;

public class Main {

    public static void main(String [] args) {
        print("Hola, mundo");

        String path = "D:/Java Projects/src/test/file.py";

        Transpiler transpiler = new Transpiler(path);

        for(Variable variable : transpiler.getVariables()) {
            print(variable.getName() + " -> " + variable.getValue() + " -> " + variable.getType());
        }

    }

}
