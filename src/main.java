import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    static double distance(double[] gps) {
        double distance = 0;
        for (int i=0;i<gps.length-3;i+=3) {

            double power= Math.pow((gps[i+3] - gps[i]), 2) + Math.pow((gps[i+4] - gps[i+1]),2)  + Math.pow((gps[i+5] - gps[i+2]),2) ;

            distance += (Math.sqrt(power));
        }
        return distance;
    }


    public static void main(String[] args) throws IOException {
//        System.out.println("this is done with inputstream ");
//        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
//        String inputLine = keyboard.readLine();
//        int i = Arrays.stream(inputLine.split(" ")).map(x -> Integer.parseInt(x)).reduce(0, (z, y) -> z + y);
//        System.out.println(i);
//        System.out.println("Enter How many numbers that u want and I will give u their Sum. ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String input = reader.readLine();
//        int result = Arrays.stream(input.split(" ")).map(x -> Integer.parseInt(x)).reduce(0, (x, y) -> x + y);
//        System.out.println(result);


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String input = bufferedReader.readLine();
//        int sum = Arrays.stream(input.split(" ")).map(x -> Integer.parseInt(x)).reduce(0, (z,y) -> z + y);
//        System.out.println(sum);
        double[] arr = {1,2,3,4,5,6};
        System.out.println(distance(arr));

    }
}
