//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No4;
import java.util.Scanner;

public class VehicleTest {
	public static void main(String[] args) {
        final Double range = 100.0;
        Vehicle car = new Vehicle();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your car's distance(km)/year: ");
        car.setDistancePerYear(scan.nextDouble());
        System.out.print("Enter your car's efficiency (km/liter): ");
        car.setEfficiency(scan.nextDouble());
        
        System.out.println("Your car's profile: ");
        System.out.println("\tEfficiency (km/l): " + car.getEfficiency());
        System.out.println("\tDistance (km/year): " + car.getDistancePerYear());
        System.out.println("\tConsumption for 100 km (liter): " + car.getConsumption(range));
        System.out.println("\tConsumption per year (liter): " + car.getConsumptionPerYear());
        System.out.println("\tCO2 emission (g/km): " + car.getCO2EmissionPerKm());
        System.out.println("\tCO2 emission per year (tons): " + car.getCO2Emission());

        scan.close();
    }
}
