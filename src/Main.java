import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List<Mashinka> machines = makeMachine();
        //printMachines(machines);
        exampleWrite();

    }

    public static List<Mashinka> makeMachine() {
        List<Mashinka> machineList = new ArrayList<>();
        machineList.add(new Mashinka("Volvo", "Gray", "Sedan"));
        machineList.add(new Mashinka("Vaz", "Black", "Universal"));
        return machineList;
    }

    public static void printMachines(List<Mashinka> mashinkas){
        for (Mashinka mchn: mashinkas)
            System.out.println(mchn);
    }

    private static void exampleWrite() {
        List<Mashinka> mashinkas = makeMachine();
        printMachines(mashinkas);
        writeMachinesToTxt(mashinkas, "input.txt");
        readMachines("output.txt");
    }

    public static void writeMachinesToTxt(List<Mashinka> mashinkas, String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename);
            for (Mashinka mchn: mashinkas)
                fileWriter.write(mchn.toString()+"\n");
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка :(");
            System.out.println(e.getMessage());
        }
    }

    private static void readMachines(String fileName) {
        try {
            FileReader file = new FileReader(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка :(");
            System.out.println(e.getMessage());
        }
    }
}