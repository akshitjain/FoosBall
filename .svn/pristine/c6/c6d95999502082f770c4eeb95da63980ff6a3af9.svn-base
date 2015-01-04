
package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JFrame;

import players.CpuPlayer;
import players.Player1;
import playground.PlayGround;
import ball.Ball;

public class SinglePlayer{
	Timer timerCpu;
	public int keypress;
	
	JFrame frame = new JFrame("FoosBallGame");

	
	public void gameMain(int error) {
		final PlayGround pg= new PlayGround();
		Ball ball = new Ball(pg);
		final Player1 player1=new Player1(pg);
		final CpuPlayer cpu =new CpuPlayer(pg,ball,error);
		frame.add(pg);
		frame.setSize(1024, 683);
		if(keypress==0){
			pg.setXpos(974);
			pg.setYpos(322);
			ball.move();
		}else{
			pg.setXpos(10);
			pg.setYpos(342-15);
			ball.move();
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_UP){
					player1.stopMoveUp();
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN){
					player1.stopMoveDown();
				}	
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_UP){
					pg.setPlayer1Direction(0);
					player1.moveUp();
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN){
					pg.setPlayer1Direction(1);
					player1.moveDown();
				}	
			}
		});
		
		cpu.moveUp();
		
	
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
