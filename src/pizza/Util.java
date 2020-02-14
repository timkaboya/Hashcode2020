package pizza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Random;

public class Util {

    Random random;
    private String file;
    private Object[] lines;

    public Util()
    {
        random = new Random();
    }

    public LinkedList<String> readFile(String file)
    {
        LinkedList<String> lines = new LinkedList<>();

        BufferedReader in;

        try{
            in = new BufferedReader(new FileReader(file));

            String line = in.readLine();

            while (line.length() > 0)
            {
                lines.add(line);
                line = in.readLine();
            }

        } catch (Exception e){

        }

        return lines;

    }

    public void writeLines (String file, Object... lines)
    {
        this.file = file;
        this.lines = lines;
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(file, "UTF-8");

            for (int i = 0; i < lines.length; i++)
                writer.println(lines[i]);

            writer.close();
        }catch (Exception e)
        {
            writer.close();
        }
    }

    public void writeFile (String file, Object[] lines)
    {
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(file, "UTF-8");

            for (int i = 0; i < lines.length; i++)
                writer.println(lines[i]);

            writer.close();
        }catch (Exception e)
        {
            writer.close();
        }
    }
    public static String[] textSort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        return words;
    }

    public void printArray(Object [] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int interSectIdx(final String [] str1, final String [] str2) {
        int matchCount = 0;
        for(int i = 0, j = 0;i < str1.length && j < str2.length;){
            int res = str1[i].compareTo(str2[j]);
            if(res == 0){
                matchCount++;
                i++;
                j++;
            }else if(res < 0){
                i++;
            }else{
                j++;
            }
        }
        return matchCount;

    }
    public static int str1Idx(final String [] str1, final String [] str2) {
        return str1.length - interSectIdx(str1, str2);
    }
    public static int str2Idx(final String [] str1, final String [] str2) {
        return str2.length - interSectIdx(str1, str2);
    }
    public int random (int min, int max)
    {
        return Math.abs(random.nextInt()) % (max + 1 - min) + min;
    }

    public int normal (int mean, int disp)
    {
        return (int) (disp * Math.cos(2 * Math.PI * random.nextDouble()) *
                Math.sqrt(-2 * Math.log(random.nextDouble())) + mean);
    }

    public int exponential (int lambda)
    {
        return  (int) (-Math.log(random.nextDouble()) * 10 / lambda);
    }

}
