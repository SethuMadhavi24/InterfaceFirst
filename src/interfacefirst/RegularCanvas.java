package interfacefirst;

public class RegularCanvas extends Canvas implements ipaint{
	private int flowersize;
	
	public RegularCanvas(String typeofpaint, int canvassize, int flowersize) {
		super(typeofpaint, canvassize);
		this.flowersize = flowersize;
	}


	public int getFlowersize() {
		return flowersize;
	}


	public void setFlowersize(int flowersize) {
		this.flowersize = flowersize;
	}


	public void paint()
	{
		if(flowersize<=canvassize)
		{
			System.out.println("Can paint");
		}
		else {
			System.out.println("Cannot paint");
		}
	
	}
	

}
