//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No5;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Box box = new Box(); 
		SlopeFloor sf = new SlopeFloor();
		Double w;
		Double r;
		Double f;
		
		System.out.print("Enter box weight: ");
		w = scan.nextDouble();
		box.setWeight(w);
		System.out.print("Enter slope (degree): ");
		r = scan.nextDouble();
		sf.setRadius(r);
		System.out.print("Enter friction: ");
		f = scan.nextDouble();
		
		System.out.print("You need " + sf.getMinForce(box,f) + " newtons of force to push the box up the ramp.");
		scan.close();
	}
}
