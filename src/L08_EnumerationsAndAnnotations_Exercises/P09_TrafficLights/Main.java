package L08_EnumerationsAndAnnotations_Exercises.P09_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] lights = br.readLine().split(" ");
        TrafficLight[] trafficLights = new TrafficLight[lights.length];
        for (int i = 0; i < trafficLights.length; i++) {
            trafficLights[i] = TrafficLight.valueOf(lights[i]);
        }
        
        int iterationsCount = Integer.parseInt(br.readLine());
    
        for (int i = 1; i <= iterationsCount; i++) {
            StringBuilder output = new StringBuilder();
            for (TrafficLight trafficLight : trafficLights) {
                int index = (trafficLight.getValue() + i) % TrafficLight.values().length;
                output.append(TrafficLight.values()[index]).append(" ");
            }
    
            System.out.println(output.toString().trim());
        }
    }
}
