package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void status() {
		System.out.println(
				"power : " + (power ? "on" : "off") + "\t" + "channel : " + channel + "\t" + "volume : " + volume);
	}

	public void power(boolean power) {
		this.power = power;
	}

	public void channel(int channel) {
		if (channel < 1) {
			channel = 255;
		}
		if (channel > 255) {
			channel = 1;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		int ch = up ? channel + 1 : channel - 1;
		channel(ch);
		// channel(up ? channel + 1 : channel - 1);
	}

	public void volume(int volume) {
		// 파워가 꺼져 있으면 볼륨 조절 X
		if (!power) {// if( power == false)
			return;
		}
		if (volume > 100) {
			volume = 100;
		}
		if (volume < 0) {
			volume = 0;
		}
		this.volume = volume;
	}

	public void volume(boolean up) {
		int vol = up ? volume + 1 : volume - 1;
		volume(vol);
		// volume(up ? volume + 1 : volume - 1);
	}
}
