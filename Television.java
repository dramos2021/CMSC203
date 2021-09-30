package lab4_CMSC203;

public class Television {
	
		String MANUFACTURER;
		final int SCREEN_SIZE;
		boolean powerOn;
		int channel;
		int volume;
		
		Television(String brand, int size){
			MANUFACTURER = brand;
			SCREEN_SIZE = size;
			powerOn = false;
			channel = 2;
			volume = 20;
		}
		
		
		
		
		public void setChannel(int ch) {
			channel = ch;
		}
		public int getChannel() {
			return channel;
		}
		public void power() {
			powerOn = !powerOn;
		}	
		public void increaseVolume() {
			volume++;			
		}
		public void decreaseVolume() {
			volume--;			
		}
		public int getVolume() {
			return volume;
		}
		public String getManufacturer() {
			return MANUFACTURER;
		}
		public int getScreenSize() {
			return SCREEN_SIZE;
		}
		
		
		
}
