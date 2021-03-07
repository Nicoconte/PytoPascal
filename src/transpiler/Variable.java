package transpiler;

import java.util.*;

public class Variable {

    private int _id;
    private String _name;
    private Object _value;
    private String _type;

    public Variable(int id, String name, Object value, String type) {
        this._id = id;
        this._name = name;
        this._value = value;
        this._type = type;
    }

    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Object getValue() {
        return this._value;
    }

    public void setValue(Object value) {
        this._value = value;
    }

    public String getType() {
        return this._type;
    }

    public void setType(String type) {
        this._type = type;
    }

}
