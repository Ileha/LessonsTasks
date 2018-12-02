package app.ISolver;

import java.util.Stack;

public class Number extends ISolver {
    @Override
    String GetStringRegex() {
        return "^\\d+$";
    }

    @Override
    public void Execute(String input_data, Stack<Float> data) {
        data.push(new Float(input_data));
    }
}
