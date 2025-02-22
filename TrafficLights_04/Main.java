package TrafficLights_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lights[] lights = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Lights::valueOf)
                .toArray(Lights[]::new);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n ; i++) {
            changeLights(lights);
            printLights(lights);
        }

    }

    private static void changeLights(Lights[] lights) {
        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED:
                    lights[i] = Lights.GREEN;
                    break;
                case GREEN:
                    lights[i] = Lights.YELLOW;
                    break;
                case YELLOW:
                    lights[i] = Lights.RED;
                    break;
            }
        }

    }

    private static void printLights(Lights[] lights) {

        for (Lights light : lights){
            System.out.printf("%s ", light);
        }
        System.out.println();
    }
}
