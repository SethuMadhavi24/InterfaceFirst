package interfacefirst;

public class Canvas {
	protected String typeofpaint;
	protected int canvassize;
	public Canvas(String typeofpaint, int canvassize) {
		super();
		this.typeofpaint = typeofpaint;
		this.canvassize = canvassize;
	}
	public String getTypeofpaint() {
		return typeofpaint;
	}
	public void setTypeofpaint(String typeofpaint) {
		this.typeofpaint = typeofpaint;
	}
	public int getCanvassize() {
		return canvassize;
	}
	public void setCanvassize(int canvassize) {
		this.canvassize = canvassize;
	}
}
