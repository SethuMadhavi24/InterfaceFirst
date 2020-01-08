package interfacefirst;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter type of paint(water/glass/oil): ");
		String typeofpaint=sc.next();
		System.out.println("Enter canvas size: ");
		int canvassize=sc.nextInt();
		if(typeofpaint.equalsIgnoreCase("water"))
		{
			System.out.println("Enter flower size: ");
			int flowersize=sc.nextInt();
			RegularCanvas rc=new RegularCanvas(typeofpaint,canvassize,flowersize);
			rc.paint();
		}
		else if(typeofpaint.equalsIgnoreCase("glass"))
		{
			System.out.println("Enter glass size: ");
			int glasssize=sc.nextInt();
			GlassCanvas rc=new GlassCanvas(typeofpaint,canvassize,glasssize);
			rc.paint();
		}
		else if(typeofpaint.equalsIgnoreCase("oil"))
		{
			System.out.println("Enter windmill size: ");
			int windmillsize=sc.nextInt();
			OilCanvas rc=new OilCanvas(typeofpaint,canvassize,windmillsize);
			rc.paint();
		}
		else
		{
			System.out.println("Type mis-matched");
		}

	}

}
