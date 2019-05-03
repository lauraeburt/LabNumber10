package co.grandcircus;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {

	private double radius;
	private final double PI = Math.PI;

	public Circle(double radius) {
		this.radius = radius;
	}

	// method to calculate Circumference
	public double getCircumference() {
		return PI * 2* radius;
	}

	// method to calculate Area
	public double getArea() {
		return PI * radius * radius;
	}

	private static String formatNumber(double x) {
		BigDecimal a = new BigDecimal(x);
		BigDecimal b = a.setScale(2, RoundingMode.HALF_UP);
		return b.toString();
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	public String getFormattedArea() {
		return formatNumber(getArea());
}
}
