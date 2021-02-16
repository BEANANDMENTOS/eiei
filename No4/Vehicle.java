//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No4;

public class Vehicle {
	private double distancePerYear;
    private double efficiency;

    public void setDistancePerYear(Double aDistancePerYear) {
        distancePerYear = aDistancePerYear;
    }

    public double getDistancePerYear() {
        return distancePerYear;
    }

    public void setEfficiency(Double aEfficiency) {
        efficiency = aEfficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double getConsumptionPerYear() {
        return distancePerYear/efficiency;
    }
    
    public double getConsumption(double range) {
        return range/efficiency;
    }

    public double getCO2EmissionPerKm() {
        double CO2PerKm = 2392.5/efficiency;
        return CO2PerKm;
    }
    
    public double getCO2Emission() {
        double CO2Emi = (getCO2EmissionPerKm()*distancePerYear)/1000000;
        return CO2Emi;
    }
}
