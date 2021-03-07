package transpiler;

import java.util.*;
import java.io.*;

import static utils.Utils.*;

public class FileReader {

    private List<Object[]> _fileContent = new ArrayList<Object[]>();
    private String _path;

    private File _file;
    private Scanner _reader;

    public FileReader(String path) {
        this._path = path;
    }

    public List<Object[]> getFileContent() {
        return this._fileContent;
    }

    public List<Object[]> readFile() {

        try {
            this._file = new File(this._path);
            this._reader = new Scanner(this._file);

            String line = "";

            while(this._reader.hasNextLine()) {
                line = this._reader.nextLine().trim();

                if (!line.equals("")) {
                    this._fileContent.add( line.split(" ") );
                }
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
