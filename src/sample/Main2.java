package sample;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer devNum = Integer.getInteger(args[1]);
		Device device = Main2.getDevice(devNum);
		switch(Integer.getInteger(args[0])){
		case 1:
			device.play();
			break;
		case 2:
			device.stop();
			break;
		case 3:
			device.fastForword();
			break;
		case 4:
			device.rewind();
			break;
		}

	}
	
	public static Device getDevice(Integer num){
		Device dev = null;
		switch(num){
		case 0:
			dev = new CD();
			break;
		case 1:
			dev = new Record();
			break;
		case 2:
			dev = new Casette();
			break;
		case 3:
			dev = new BluRay();
			break;
		}
		return dev;
	}

}
