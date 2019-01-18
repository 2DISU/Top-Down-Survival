package Utilities;

public class gameTime {
	private long startT=0;
	private long stopT=0;
	
	public void start()
	{
		startT = System.nanoTime();
	}
	public void stop()
	{
		stopT = System.nanoTime();
	}
	public long getTime()
	{
		return ((stopT-startT)/1000000000);
	}
}
