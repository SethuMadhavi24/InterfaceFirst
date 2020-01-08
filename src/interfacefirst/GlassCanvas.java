package interfacefirst;

public class GlassCanvas extends Canvas implements ipaint{
	private int glasssize;

	public GlassCanvas(String typeofpaint, int canvassize, int glasssize) {
		super(typeofpaint, canvassize);
		this.glasssize = glasssize;
	}

	public int getGlasssize() {
		return glasssize;
	}

	public void setGlasssize(int glasssize) {
		this.glasssize = glasssize;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		if(glasssize<=canvassize)
		{
			System.out.println("Can paint");
		}
		else {
			System.out.println("Cannot paint");
		}
	}
	

}
