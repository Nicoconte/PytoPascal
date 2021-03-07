package transpiler;

import java.util.*;
import java.io.*;

import static utils.Utils.*;

public class FileReader {

    private List<Object> _fileContent = new ArrayList<Object>();
    private String _path;

    private File _file;
    private Scanner _reader;

    private Script _script;

    public FileReader(String path) {
        this._path = path;
        this._script = new Script(path);
    }

    public List<Object> readFile() {

        try {

            if (this._script.isValid()) {

                this._file = new File(this._path);
                this._reader = new Scanner(this._file);

                String line = "";

                while(this._reader.hasNextLine()) {
                    line = this._reader.nextLine().trim();

                    if (!line.equals("")) {
                        this._fileContent.add( line );
                    }
                }

            } else {
                throw new Exception("El archivo solicitado no es valido");
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (this._reader != null) {
                this._reader.close();
            }
        }

        return this._fileContent;
    }

}
