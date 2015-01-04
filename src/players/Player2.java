package players;

import java.util.Timer;
import java.util.TimerTask;

import playground.PlayGround;

public class Player2 extends Player {

	public PlayGround playGround;
	Timer timer1;
	Timer timer2;

	public Player2(PlayGround playGround) {
		super(playGround, 5, 1, 1, 1);
	}

	@Override
	public void moveDown() {
		timer1 = new Timer();
		timer1.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (getPlayGround().getyPlayer2pos() < 450) {
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + getSigny()
							* (getSpeed()));

				} else {
					this.cancel();
				}
				getPlayGround().repaint();
			}
		}, 0, getTime());
	}

	@Override
	public void stopMoveDown() {
		timer1.cancel();
	}

	@Override
	public void moveUp() {
		timer2 = new Timer();
		timer2.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (getPlayGround().getyPlayer2pos() > 230) {
					getPlayGround().setyPlayer2pos(getPlayGround().getyPlayer2pos() + (-1) * getSigny()
							* (getSpeed()));
				} else {
					this.cancel();
				}

				getPlayGround().repaint();
			}
		}, 0, getTime());
	}

	@Override
	public void stopMoveUp() {
		timer2.cancel();
	}
}
