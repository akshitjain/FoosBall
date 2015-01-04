package playground;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlayGround extends JPanel{
	private static final long serialVersionUID = 1L;
	private int xpos = 512;
	private int ypos = 342;
	private int yPlayer1pos = 342;
	private int yPlayer2pos = 342;
	private int player1Direction;// 1 for down and 0 for up
	private int player2Direction;// 1 for down and 0 for up
	private int playerSize = 30; //Set Player Size Here
	private int goalPost1 = 227;
	private int goalPost2 = 451;
	private int scorePlayer1 = 0;
	private int scorePlayer2 = 0;
	boolean winingTeam;
	private int teamTwoPlayers[][] = {{10,-20},{120,80},{120,-120},{420,180},{420,-95},
			{420,-220},{420,55},{720,180},{720,-95},{720,-220},{720,55}};
	private int teamOnePlayers[][] = {{974,-20},{884,80},{884,-120},{564,180},{564,-95},
			{564,-220},{564,55},{264,180},{264,-95},{264,-220},{264,55}};
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		Image ground = Toolkit.getDefaultToolkit().getImage("Images/ground.jpg");
		Image ball = Toolkit.getDefaultToolkit().getImage("Images/ball.gif");
		Image player1 = Toolkit.getDefaultToolkit().getImage("Images/player1.jpg");
		Image player2 = Toolkit.getDefaultToolkit().getImage("Images/player2.jpg");
		g.drawImage(ground, 0, 0, this);
		g.drawImage(ball, getXpos() - 8, getYpos() - 8, 15, 15, this);
		//g.drawLine(10, 0, 10, 683);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRoundRect(14, 0, 4, 683, 2,2 );	//goal cpu
		g.fillRoundRect(14, 0, 4, 683, 2, 2);
		g.drawRoundRect(124, 0, 4, 683, 2,2 );	//defender
		g.fillRoundRect(124, 0, 4, 683, 2, 2);
		g.drawRoundRect(424, 0, 4, 683, 2,2 );	//midfielder
		g.fillRoundRect(424, 0, 4, 683, 2, 2);
		g.drawRoundRect(724, 0, 4, 683, 2,2 );
		g.fillRoundRect(724, 0, 4, 683, 2, 2);
		g.drawRoundRect(996, 0, 4, 683, 2,2 );	//striker
		g.fillRoundRect(996, 0, 4, 683, 2, 2);
		g.drawRoundRect(1024 -120 - 40+22, 0, 4, 683, 2,2 );
		g.fillRoundRect(1024 -120 - 40+22, 0, 4, 683, 2, 2);
		g.drawRoundRect(1024 -420- 40+22, 0, 4, 683, 2,2 );
		g.fillRoundRect(1024 -420- 40+22, 0, 4, 683, 2, 2);
		g.drawRoundRect(1024 -720- 40+22, 0, 4, 683, 2,2 );
		g.fillRoundRect(1024 -720- 40+22, 0, 4, 683, 2, 2);
		
		
		g.drawImage(player2, teamTwoPlayers[0][0], getyPlayer2pos()+teamTwoPlayers[0][1],playerSize,playerSize, this);//GoalKeeper
		g.drawImage(player2, teamTwoPlayers[1][0], getyPlayer2pos()+teamTwoPlayers[1][1],playerSize,playerSize, this);//Defender
		g.drawImage(player2, teamTwoPlayers[2][0], getyPlayer2pos()+teamTwoPlayers[2][1],playerSize,playerSize, this);//Defender
		g.drawImage(player2, teamTwoPlayers[3][0], getyPlayer2pos()+teamTwoPlayers[3][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player2, teamTwoPlayers[4][0], getyPlayer2pos()+teamTwoPlayers[4][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player2, teamTwoPlayers[5][0], getyPlayer2pos()+teamTwoPlayers[5][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player2, teamTwoPlayers[6][0], getyPlayer2pos()+teamTwoPlayers[6][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player2, teamTwoPlayers[7][0], getyPlayer2pos()+teamTwoPlayers[7][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player2, teamTwoPlayers[8][0], getyPlayer2pos()+teamTwoPlayers[8][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player2, teamTwoPlayers[9][0], getyPlayer2pos()+teamTwoPlayers[9][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player2, teamTwoPlayers[10][0],getyPlayer2pos()+teamTwoPlayers[10][1],playerSize,playerSize, this);//Attacker
		

		g.drawImage(player1, teamOnePlayers[0][0],  getyPlayer1pos() + teamOnePlayers[0][1],playerSize,playerSize, this);//GoalKeeper
		g.drawImage(player1, teamOnePlayers[1][0], getyPlayer1pos() + teamOnePlayers[1][1],playerSize,playerSize, this);//Defender
		g.drawImage(player1, teamOnePlayers[2][0], getyPlayer1pos()+ teamOnePlayers[2][1],playerSize,playerSize, this);//Defender
		g.drawImage(player1, teamOnePlayers[3][0], getyPlayer1pos()+ teamOnePlayers[3][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player1, teamOnePlayers[4][0], getyPlayer1pos()+ teamOnePlayers[4][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player1, teamOnePlayers[5][0] ,getyPlayer1pos()+ teamOnePlayers[5][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player1, teamOnePlayers[6][0], getyPlayer1pos()+ teamOnePlayers[6][1],playerSize,playerSize, this);//MidFielder
		g.drawImage(player1, teamOnePlayers[7][0], getyPlayer1pos()+ teamOnePlayers[7][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player1, teamOnePlayers[8][0], getyPlayer1pos()+ teamOnePlayers[8][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player1, teamOnePlayers[9][0], getyPlayer1pos()+ teamOnePlayers[9][1],playerSize,playerSize, this);//Attacker
		g.drawImage(player1, teamOnePlayers[10][0],getyPlayer1pos()+ teamOnePlayers[10][1],playerSize,playerSize, this);//Attacker
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.setColor(Color.white);
		g.drawString(String.format("%s                  %s", getScorePlayer2(),getScorePlayer1()),362, 50);
	}
	public int getXpos() {
		return xpos;
	}
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	public int[][] getTeamOnePlayers() {
		return teamOnePlayers;
	}
	public int[][] getTeamTwoPlayers() {
		return teamTwoPlayers;
	}
	
	public int getyPlayer1pos() {
		return yPlayer1pos;
	}
	public void setyPlayer1pos(int yPlayer1pos) {
		this.yPlayer1pos = yPlayer1pos;
	}
	
	public int getyPlayer2pos() {
		return yPlayer2pos;
	}
	public void setyPlayer2pos(int yPlayer2pos) {
		this.yPlayer2pos = yPlayer2pos;
	}
	public int getPlayer1Direction() {
		return player1Direction;
	}
	public void setPlayer1Direction(int player1Direction) {
		this.player1Direction = player1Direction;
	}
	public int getPlayer2Direction() {
		return player2Direction;
	}
	public void setPlayer2Direction(int player2Direction) {
		this.player2Direction = player2Direction;
	}
	public int getGoalPost1() {
		return goalPost1;
	}
	public void setGoalPost1(int goalPost1) {
		this.goalPost1 = goalPost1;
	}
	public int getGoalPost2() {
		return goalPost2;
	}
	public void setGoalPost2(int goalPost2) {
		this.goalPost2 = goalPost2;
	}
	public int getScorePlayer1() {
		return scorePlayer1;
	}
	public void setScorePlayer1(int scorePlayer1) {
		this.scorePlayer1 = scorePlayer1;
	}
	public int getScorePlayer2() {
		return scorePlayer2;
	}
	public void setScorePlayer2(int scorePlayer2) {
		this.scorePlayer2 = scorePlayer2;
	}
	public boolean getwinningTeam(){
		return this.winingTeam;
	}
	public void setwinningTeam(boolean result){
		this.winingTeam=result;
	}
	
}
