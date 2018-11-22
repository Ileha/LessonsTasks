package app.Solver;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ISolver {
    private Pattern p;

    abstract String GetStringRegex();

    public ISolver() {
        p = Pattern.compile(GetStringRegex());
    }

    public boolean Check(String input_data) {
        Matcher m = p.matcher(input_data);
        return m.matches();
    }

    public abstract void Execute(String input_data, Stack<Float> data);
}
