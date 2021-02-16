//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No1;

public class CookieText {
	public static void main(String[] args) {
        Cookie ck1 =new Cookie();
        Cookie ck2 =new Cookie();
        Cookie ck3 =new Cookie();
        Cookie ck4 =new Cookie();

        ck1.setName("Chocolate Chip Cookie");
        ck2.setName("Peanut Butter Cookie");
        ck3.setName("Oatmeal Cookie");
        ck4.setName("Oatmeal Resin Cookie");

        ck1.setPrice(15);
        ck2.setPrice(20);
        ck3.setPrice(17);
        ck4.setPrice(25);

        System.out.println(ck1.getName() + "  " + ck1.getPrice() + " baht");
        System.out.println(ck2.getName() + "  " + ck2.getPrice() + " baht");
        System.out.println(ck3.getName() + "  " + ck3.getPrice() + " baht");
        System.out.println(ck4.getName() + "  " + ck4.getPrice() + " baht");
	}
}
