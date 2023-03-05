import java.io.*;
import java.util.*;
public class Main {
    public static double cenaNetto(double cenaBrutto, double stawkaPodatku) {
        double result = cenaBrutto / (1 + (stawkaPodatku/100));
        return result;
    }

    public static void writeToFile(String newLine, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(newLine + "\n");
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(cenaNetto(299, 8.0));

        LinkedList<Integer> fifoQueue = new LinkedList<Integer>();
        fifoQueue.add(1);
        fifoQueue.add(2);
        fifoQueue.add(3);
        System.out.println(fifoQueue);
        System.out.println(fifoQueue.poll());
        System.out.println(fifoQueue);

        writeToFile("Nowa linijka do pliku tekstowego.", "C:\\Users\\48728\\IdeaProjects\\PP4\\Assignment1\\src\\filename.txt");
    }


}