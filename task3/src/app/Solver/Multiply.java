package app.Solver;

import java.util.Stack;

public class Multiply extends ISolver {
    @Override
    String GetStringRegex() {
        return "^[*]$";
    }

    @Override
    public void Execute(String input_data, Stack<Float> data) {
        Float num1 = data.pop();
        Float num2 = data.pop();
        data.push(num2*num1);
    }
}
