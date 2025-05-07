package com.sample.mybatis.ajax;

public class BasketMember {
	private int num;
	private String name;
	private String nick;
	
	public BasketMember() {	}
	public BasketMember(int num, String name, String nick) {
		this.num=num;
		this.name=name;
		this.nick=nick;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "BasketMember [num=" + num + ", name=" + name +
				",nick=" + nick + "]";
	}
}
