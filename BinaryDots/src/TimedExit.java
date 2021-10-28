//code found https://stackoverflow.com/questions/15747277/how-to-make-java-program-exit-after-a-couple-of-seconds
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class TimedExit {
	static Timer timer = new Timer();
	static TimerTask exitApp = new TimerTask()
	{
		public void run() {
			System.exit(0);
		}
	};
	
	public static void timedExit() {
		timer.schedule(exitApp, new Date(System.currentTimeMillis()+5*1000));
	}
}
