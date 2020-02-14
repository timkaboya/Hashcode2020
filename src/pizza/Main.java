package pizza;


import javax.print.DocFlavor;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        Util util = new Util();
        String file, fileName = "a_example";
        // initialize output list
        // Read file
        if (args.length > 0) {
            file ="src/pizza/in/"+args[0];
            fileName = args[0];
        } else
            file = "src/pizza/in/" +  fileName;



        LinkedList<String> lines = util.readFile(file + ".in");

        // Get list of items
        String [] line1 = lines.get(0).split(" ");
        int maxSlices = Integer.parseInt(line1[0]);
        int numPizza = Integer.parseInt(line1[1]);

        // Load numbers into array
        String [] slicesStr = lines.get(1).split(" ");
        Integer [] slices = new Integer[numPizza];
        for(int i = 0; i < slices.length; i++) {
            slices[i] = Integer.parseInt(slicesStr[i]);
        }

        util.printArray(slicesStr);

        /*  Dumb implementation. How can we make it smarter
         *  Start with max value of pizza and keep on summing.
         *  If next value reaches max slices, stop at this point and return current index
         */
        int sum = 0, pos = 0;
        for(int i = numPizza-1; i >= 0; i--){
            sum += slices[i];
            if (sum > maxSlices) {
                pos = i+1;
                break;
            }
        }


        // send output to file
        String outFile = "src/pizza/out/" + fileName + ".out";
        String finalPizzas = Integer.toString(numPizza - pos);
        String slicePos = "";
        int totalSlices = 0;
        for(int i = pos; i < numPizza; i++) {
            slicePos += i + " ";
            totalSlices += slices[i];
        }
        System.out.println("Number of Pizzas: " + finalPizzas + " Total Slices: " + totalSlices);
        System.out.println(slicePos);
        util.writeLines(outFile, finalPizzas, slicePos);

    }
}
