package Pack51;
import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code");
        double wavelength = scanner.nextDouble();
        String color = getColor(wavelength);
        System.out.println("The color is " + color);
    }

    public static String getColor(double wavelength) {
        if (wavelength >= 380 && wavelength < 450) return "Violet";
        if (wavelength >= 450 && wavelength < 495) return "Blue";
        if (wavelength >= 495 && wavelength < 570) return "Green";
        if (wavelength >= 570 && wavelength < 590) return "Yellow";
        if (wavelength >= 590 && wavelength < 620) return "Orange";
        if (wavelength >= 620 && wavelength < 750) return "Red";
        return "The entered wavelength is not a part of the visible spectrum";
    }
}