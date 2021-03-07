package transpiler;

import java.util.*;

import static utils.Utils.*;

public class Transpiler {

    private FileReader _reader;

    private String _outputPath;

    private List<Variable> _variables = new ArrayList<Variable>();
    private List<Object[]> _lines;

    public Transpiler(String path) {
        this._reader = new FileReader(path);
        this._lines = this._reader.readFile();
    }

    public List<Variable> getVariables() {

        String equalSymbol = "=";

        int id = 0;
        String name = "";
        String type = "";
        Object values = null;

        for(Object[] line : this._lines) {
            if (isUnique(line, equalSymbol)) {
                for(int i = 0; i < line.length; i++) {
                    if (line[i].equals(equalSymbol)) {
                        name = line[i - 1].toString();
                        values = getVariableValues(line, i);
                        type = nameOf(line[i + 1]);

                        this._variables.add(new Variable(id, name, values, type));
                    }
                    id++;
                }
            }
        }

        return this._variables;
    }
}
