//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No3;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class AdvertisingTextTest {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AdvertisingText ad = new AdvertisingText();

        System.out.print("รับชื่อผู้ประกาศ: ");
        ad.setAnnouncer(scan.nextLine());
        System.out.print("รับขอ้ความ: ");
        ad.setText(scan.nextLine());
        System.out.print("รับ tag: ");
        ad.setTag(scan.nextLine());
        System.out.print("รับขอ้ความเพิ่ม: ");
        ad.setTextMore1(scan.nextLine());
        System.out.print("รับขอ้ความเพิ่ม: ");
        ad.setTextMore2(scan.nextLine());
        System.out.println();

        System.out.printf("'%s\n%s\n%s'\n\n" ,ad.getText(),ad.getTextMore1(),ad.getTextMore2());
        System.out.printf("Tag: %s  \nBy: %s\n" ,ad.getTag(),ad.getAnnonncer());
        GregorianCalendar gc = new GregorianCalendar();
        System.out.printf("Date: %td %<tB %<tY", gc);
        scan.close();
    }
}
