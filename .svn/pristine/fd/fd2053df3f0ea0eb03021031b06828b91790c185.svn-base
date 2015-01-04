package players;
import java.util.Timer;
import java.util.TimerTask;
import ball.Ball;
import playground.PlayGround;
public class CpuPlayer extends Player {
	

	public Ball ball;
	public PlayGround playGround;
	Timer timer1;
	Timer timer2;
	int error;
	
	public CpuPlayer(PlayGround playGround,Ball ball,int error) {
		super(playGround, 5, 1, 1, 1);
		this.ball=ball;
		this.error=error;
	}

	@Override
	public void moveUp() {
		timer2 = new Timer();
		timer2.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
			if(getPlayGround().getXpos()<124 && ball.getsignx()==-1){ //124  //goal above
				if((getPlayGround().getyPlayer2pos()-20+error)>(getPlayGround().getYpos())){
				getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);	
				getPlayGround().setPlayer2Direction(0);
				}
				else if((getPlayGround().getyPlayer2pos()-20+error)<getPlayGround().getYpos()){	//goal below
						getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
						getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>14) && (getPlayGround().getXpos()<124) && ball.getsignx()==1 
					&& getPlayGround().getYpos()<342){ 	//286	//defender above)
				if((getPlayGround().getyPlayer2pos()-120+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-120+error)<(getPlayGround().getYpos())){   //defender below 286
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(0);
				}
			}else if((getPlayGround().getXpos()>14) && (getPlayGround().getXpos()<124) && ball.getsignx()==1
					&& getPlayGround().getYpos()>342){ 	//286	//defender above)
				if((getPlayGround().getyPlayer2pos()+80+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(1);
				}else if((getPlayGround().getyPlayer2pos()+80+error)<(getPlayGround().getYpos())){   //defender below 286
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(0);
				}
			}
			else if(getPlayGround().getXpos()>124 && getPlayGround().getXpos()<424 && ball.getsignx()==-1 
					&& getPlayGround().getYpos()<342){
				if((getPlayGround().getyPlayer2pos()-120+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-120+error)<(getPlayGround().getYpos())){   //defender below 286
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>124) && (getPlayGround().getXpos()<424) && ball.getsignx()==-1
					&& getPlayGround().getYpos()>342){ 	//286	//defender above)
				if((getPlayGround().getyPlayer2pos()+80+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()+80+error)<(getPlayGround().getYpos())){   //defender below 286
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>124) && (getPlayGround().getXpos()<424 && ball.getsignx()==1 
					&& getPlayGround().getYpos()<342)){
				if((getPlayGround().getyPlayer2pos()-220+error)>(getPlayGround().getYpos())){//586//midfielder top above
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-220+error)<(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>124) && (getPlayGround().getXpos()<424 && ball.getsignx()==1 
					&& getPlayGround().getYpos()>342)){
				if((getPlayGround().getyPlayer2pos()+180+error)>(getPlayGround().getYpos())){//586//midfielder top above
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()+180+error)<(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>424) && (getPlayGround().getXpos()<724) && (ball.getsignx()==-1) 
					&& getPlayGround().getYpos()<342){
				if((getPlayGround().getyPlayer2pos()-220+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);//midfielder top below
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-220+error) < getPlayGround().getYpos()){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>424) && (getPlayGround().getXpos()<724) && (ball.getsignx()==-1)
					&& getPlayGround().getYpos()>342){
				if((getPlayGround().getyPlayer2pos()+180+error)>(getPlayGround().getYpos())){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);//midfielder top below
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()+180+error) < getPlayGround().getYpos()){
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>424) && (getPlayGround().getXpos()<724 && ball.getsignx()==1) 
					&& getPlayGround().getYpos()<342){
				if((getPlayGround().getyPlayer2pos()-220+error)>(getPlayGround().getYpos())){//attacker top top//886
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-220+error)<(getPlayGround().getYpos())) {
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>424) && (getPlayGround().getXpos()<724 && ball.getsignx()==1) 
					&& getPlayGround().getYpos()>342){
				if((getPlayGround().getyPlayer2pos()+180+error)>(getPlayGround().getYpos())){//attacker top top//886
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()+180+error)<(getPlayGround().getYpos())) {
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>724) && (getPlayGround().getXpos()<1000) && ball.getsignx()==-1 
					&& getPlayGround().getYpos()<342){
				if((getPlayGround().getyPlayer2pos()-220+error)>(getPlayGround().getYpos())){//attacker top below
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()-220+error)<(getPlayGround().getYpos())){//attacker top below
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}else if((getPlayGround().getXpos()>724) && (getPlayGround().getXpos()<1000) && ball.getsignx()==-1
					&& getPlayGround().getYpos()>342){
				if((getPlayGround().getyPlayer2pos()+180+error)>(getPlayGround().getYpos())){//attacker top below
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + -1);
					getPlayGround().setPlayer2Direction(0);
				}else if((getPlayGround().getyPlayer2pos()+180+error)<(getPlayGround().getYpos())){//attacker top below
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + 1);
					getPlayGround().setPlayer2Direction(1);
				}
			}
				getPlayGround().repaint();
			}
		}, 0, getTime());
	}

	@Override
	public void stopMoveUp() {
		timer2.cancel();
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		//not reqd.
		}
	@Override
	void stopMoveDown() {
		// TODO Auto-generated method stub
		//not reqd
	}
}