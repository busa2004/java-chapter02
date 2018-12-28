package chapter02;

public class TV {
	private boolean power;
	private int channel; // 0~50
	private int volume; // 0~50

	public TV(int channel, int volume, boolean power) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {

		if (power) {
			
			if(channel > 50) {
				this.channel = 0;
			}else if(channel < 0 ) {
				this.channel = 50;
			}else {
				this.channel = channel;
			}

		}
	}

	public void channel(boolean up) {
		if(up) {
			channel(this.channel+1);
		}else {
			channel(this.channel-1);
		}
	}
	
	////////////////////////
	
	
	public void volume(int volume) {

		if (power) {
			
			if(volume > 50) {
				this.volume = 0;
			}else if(volume < 0 ) {
				this.volume = 50;
			}else {
				this.volume = volume;
			}

		}
	}

	public void volume(boolean up) {
		if(up) {
			volume(this.volume+1);
		}else {
			volume(this.volume-1);
		}
	}

	public void status() {
		System.out.println("TV[power=" + power + ", channel=" + channel + ", volume=" + volume + "]");
	}

}
