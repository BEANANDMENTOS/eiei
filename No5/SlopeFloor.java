//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No5;

public class SlopeFloor {
	private final Double GRAVITY = 9.8;
	private Double radius;
	
	public void setRadius(Double aRadius) {
		radius = aRadius;
	}
	
	public Double getRadius() {
		return radius;
	}
	
	public Double getMinForce(Box box, double friction) {
		Double minForce = (box.getWeight()*GRAVITY*Math.sin(Math.toRadians(getRadius()))) + (friction*box.getWeight()*GRAVITY*Math.cos(Math.toRadians(getRadius())));
		return minForce;
	}
}
