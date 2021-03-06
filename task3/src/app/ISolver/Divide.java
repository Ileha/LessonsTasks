package app.ISolver;

import java.util.Stack;

public class Divide extends ISolver {
    @Override
    String GetStringRegex() {
        return "^[/]$";
    }

    @Override
    public void Execute(String input_data, Stack<Float> data) {
        Float num1 = data.pop();
        Float num2 = data.pop();
        data.push(num2/num1);
    }
}
