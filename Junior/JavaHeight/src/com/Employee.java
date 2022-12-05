package com;

public class Employee {
	public static void main(String[] args) {
		CompanyPrinter printer1=CompanyPrinter.getInstant();
		System.out.println("员工1使用打印机："+printer1);
		CompanyPrinter printer2=CompanyPrinter.getInstant();
		System.out.println("员工2使用打印机："+printer2);
		CompanyPrinter printer3=CompanyPrinter.getInstant();
		System.out.println("员工3使用打印机："+printer3);
	}
}
