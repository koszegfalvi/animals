
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<Dog> dogs = new ArrayList<>();
        List<String> dogLines = FileReader.fileReadHandler("src/Dog.txt");
        for (String line : dogLines
        ) {
            String[] lineAsStringArray = line.split("#@#");


            Dog actual = new Dog(lineAsStringArray[0],
                    lineAsStringArray[1],
                    lineAsStringArray[2]);
            dogs.add(actual);
        }
        List<Chicken> chickens = new ArrayList<>();
        List<String>chickenLines = FileReader.fileReadHandler("src/Chicken.txt");
        for (String line : chickenLines
        ) {
            String[] lineAsStringArray = line.split("-");

            Chicken actual = new Chicken(Double.parseDouble(lineAsStringArray[0]),
                    Double.parseDouble(lineAsStringArray[1]));
                    chickens.add(actual);
        }*/

        List<Animal> animal = new ArrayList<>();
        List<String> animalLines = FileReader.fileReadHandler("src/vegyes.txt");
        for (String line : animalLines
        ) {
            String[] lineAsStringArray = line.split("-");
            if (lineAsStringArray.length == 2) {
                for (String v : animalLines
                ) {
                    if (lineAsStringArray.length == 2) {
                        Chicken actual = new Chicken(Double.parseDouble(lineAsStringArray[0]),
                                Double.parseDouble(lineAsStringArray[1]));
                        animal.add(actual);
                    } else {
                        Dog actual = new Dog(lineAsStringArray[0],
                                Integer.parseInt(lineAsStringArray[1]),
                                lineAsStringArray[2]);
                        animal.add(actual);
                    }
                }


            }
        }
    }
}
