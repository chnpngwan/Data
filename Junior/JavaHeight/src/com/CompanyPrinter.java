package com;

public class CompanyPrinter {
	private CompanyPrinter(){
		
	}
	private static class PrinerHolder{
		private static CompanyPrinter printer=new CompanyPrinter();
	}
	public static CompanyPrinter getInstant(){
		return PrinerHolder.printer;
	}
}
