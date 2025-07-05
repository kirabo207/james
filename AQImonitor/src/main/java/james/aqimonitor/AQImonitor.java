/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package james.aqimonitor;

import java.util.*;

public class AQImonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();
        int hazardousCount = 0;

        // Generate 30 random AQI readings
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // 1 to 300
            if (aqiReadings[i] > 200) {
                hazardousCount++;
            }
        }

        // Sort readings to calculate median
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }

        // Display results
        System.out.println("Air Quality Index Readings:");
        System.out.println(Arrays.toString(aqiReadings));
        System.out.println("Median AQI: " + median);
        System.out.println("Hazardous Days (AQI > 200): " + hazardousCount);
    }
}



