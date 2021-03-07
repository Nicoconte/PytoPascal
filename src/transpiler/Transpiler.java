package transpiler;

import java.util.*;

import static utils.Utils.*;

public class Transpiler {

    private FileReader _reader;

    private String _outputPath;

    private List<Variable> _variables = new ArrayList<Variable>();
    private List<Object> _lines;

    private Template _template;

    public Transpiler(String path) {
        this._reader = new FileReader(path);
        this._lines = this._reader.readFile();
        this._template = new Template();
    }

    public List<Variable> getVariables() {

        String equalSymbol = "=";
        Object[] codePerLine = new Object[this._lines.size()];

        int id = 0;
        String name = "";
        String type = "";
        Object values = null;

        for(Object line : this._lines) {
            codePerLine = line.toString().split(" ");

            if (isUnique(codePerLine, equalSymbol)) {
                for(int i = 0; i < codePerLine.length; i++) {
                    if (codePerLine[i].equals(equalSymbol)) {

                        name = codePerLine[i - 1].toString();
                        values = getVariableValues(codePerLine, i);
                        type = getRealType(codePerLine[i + 1]);

                        this._variables.add(new Variable(id, name, values, type));

                    }
                    id++;
                }
            }
        }

        return this._variables;
    }
}
