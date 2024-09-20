import java.math.*;
public class hinhtron {
	private float r;
	public hinhtron(float r)
	{
		if(r <= 0)
		{
			System.out.println("Ban kinh phai lon hon 0");
		}
		else
			this.r = r;
	}
	public float tinhDienTich()
	{
		return this.r * this.r * (float)Math.PI;
	}
	public float tinhChuVi()
	{
		return 2.0f * this.r * (float)Math.PI;
	}

	
}
