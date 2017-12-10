package hu.helixlab;

public class Main {

    public static void main(String[] args) {
	float celsiusTemp = 20;
	float fahrenheitTemp = 76;
	float fahrenheit = 9 * (celsiusTemp / 5) + 32;
	float celsius = (fahrenheitTemp - 32) * 5 / 9;
	System.out.println(celsiusTemp + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(fahrenheitTemp + " Fahrenheit = " + celsius + " Celsius");

    }
}
