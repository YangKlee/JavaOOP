/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package entity;
import java.lang.Math;

public class ptBac2 {
	double a, b, c;
	double x1, x2;
	public ptBac2(double a, double b, double c) throws CanSolveException {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		if ((a == 0 && b == 0) ||(a == 0 && c == 0)  )
		{
			throw new CanSolveException("Đéo giải được");
		}
	}
	private double tinhDelta(double a, double b, double c)
	{
		double delta = (b*b) - (4 *(a*c));
		return delta;
	}
	private void tinh(double a, double b, double c, double delta)
	{
		
		this.x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
		this.x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
	}
	public String giaiPT() {
		double delta = tinhDelta(this.a, this.b, this.c);
		if (delta < 0)
		{
			return "Zô nghiệm";
		}
		else if (delta == 0)
		{
			tinh(this.a, this.b, this.c, delta);
			return "Phương trình có 1 nghiệm \n X=" + x1;
		}
		else
		{
			tinh(this.a, this.b, this.c, delta);
			return "Phương trình có 2 nghiệm:\n x1 = " + x1 + "\nx2 = " + x2;
		}
	}
	

}
