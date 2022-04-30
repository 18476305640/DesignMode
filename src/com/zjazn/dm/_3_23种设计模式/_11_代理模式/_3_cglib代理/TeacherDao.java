package com.zjazn.dm._3_23种设计模式._11_代理模式._3_cglib代理;

public class TeacherDao {

	public String teach() {
		System.out.println(" 教师正在授课... ");
		return "hello";
	}
}
