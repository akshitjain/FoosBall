package players;

import playground.PlayGround;

public abstract class Player {
	
	private int time;
	private int speed;
	private int signx;
	private int signy;
	protected PlayGround playGround;
	String lastcontact;
	
	
	public Player(PlayGround playGround,int time,int speed,int signx,int signy) {
		this.playGround = playGround;
		this.setSignx(signx);
		this.setSigny(signy);
		this.setSpeed(speed);
		this.setTime(time);
	}
	
	abstract void moveDown();
	abstract void stopMoveDown();
	abstract void moveUp();
	abstract void stopMoveUp();
	
	public int getSignx() {
		return signx;
	}
	public int getSigny() {
		return signy;
	}
	public int getSpeed() {
		return speed;
	}
	public int getTime() {
		return time;
	}
	public PlayGround getPlayGround() {
		return playGround;
	}
	
	public void setSignx(int signx) {
		this.signx = signx;
	}
	public void setSigny(int signy) {
		this.signy = signy;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public void setLastcontact(String team){
		this.lastcontact=team;
	}
	
	public String getLastcontact(){
		return this.lastcontact;
	}
	
	
	
	
}
