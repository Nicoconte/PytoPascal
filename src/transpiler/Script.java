package transpiler;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

import static utils.Utils.*;

public class Script {

    private String _scriptPath;
    private String _error;

    private Process _process;
    private BufferedReader _stdError;
    private InputStream _input;

    public Script(String path){
        this._scriptPath = path;
    }

    public boolean isValid() {
        try {

            this._process = Runtime.getRuntime().exec("python " + this._scriptPath);
            this._input = this._process.getErrorStream();
            this._stdError = new BufferedReader(new InputStreamReader(this._input));

            this._error = BufferedReaderToString(this._stdError).toLowerCase();

            if (this._error.contains("error"))
                return false;

            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}