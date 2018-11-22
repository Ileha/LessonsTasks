package app;

import app.Solver.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String in = "43 6 5 9 * / - 10 +";
        Stack<Float> data = new Stack<Float>();

        ArrayList<ISolver> commands = new ArrayList<ISolver>();
        commands.add(new app.Solver.Number());
        commands.add(new Add());
        commands.add(new Subtract());
        commands.add(new Multiply());
        commands.add(new Divide());

        Scanner reader = new Scanner(in);

        while (reader.hasNext()) {
            String split = reader.next();
            ISolver current_solver = null;

            for (ISolver solver:commands) {
                if (solver.Check(split)) {
                    current_solver = solver;
                    break;
                }
            }

            if (current_solver != null) {
                current_solver.Execute(split, data);
            }
        }

        System.out.println(data.peek());
    }
}