import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = input.nextLine();

        File file = new File(fileName);

        Scanner fileInput;

        try{
            fileInput = new Scanner(file);
        }catch(FileNotFoundException ex){
            throw new RuntimeException(ex);
        }

        String fileText = "";

        while(fileInput.hasNext()){
            fileText += fileInput.next();
        }

        String[] splitText = fileText.split(",");
        int[] numberList = new int[splitText.length];

        for(int i = 0; i < splitText.length; i++){
            numberList[i] = Integer.parseInt(splitText[i]);
        }

        Arrays.sort(numberList);


        System.out.println("List before Sorting: ");
        for(int i = 0; i < numberList.length; i++){
            System.out.println(splitText[i]);
        }

        System.out.println("\nList After Sorting");
        for(int i = 0; i < numberList.length; i++){
            System.out.println(numberList[i]);
        }
    }
}