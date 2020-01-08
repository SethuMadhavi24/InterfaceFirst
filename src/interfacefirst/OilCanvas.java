package interfacefirst;

public class OilCanvas extends Canvas implements ipaint{
	private int windmillsize;

	public OilCanvas(String typeofpaint, int canvassize, int windmillsize) {
		super(typeofpaint, canvassize);
		this.windmillsize = windmillsize;
	}

	public int getWindmillsize() {
		return windmillsize;
	}

	public void setWindmillsize(int windmillsize) {
		this.windmillsize = windmillsize;
	}
	public void paint() {
		// TODO Auto-generated method stub
		if(windmillsize<=canvassize)
		{
			System.out.println("Can paint");
		}
		else {
			System.out.println("Cannot paint");
		}
	}

}
