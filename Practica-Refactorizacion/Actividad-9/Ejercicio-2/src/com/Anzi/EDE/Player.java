package com.Anzi.EDE;

public class Player {

	int x, y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public void moverDerecha(){
		x=+1;
	}
	public void moverIzquierda(){
		x=-1;
	}
	public void moverArriba(){
		y=-1;
	}
	public void moverAbajo(){
		y=+1;
	}
	
}
