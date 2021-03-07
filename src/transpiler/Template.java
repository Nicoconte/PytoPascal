package transpiler;

public class Template {

    private StringBuilder _sb;

    public Template() {
        this._sb = new StringBuilder();
    }

    public StringBuilder getBuilder() {
        return this._sb;
    }
}
