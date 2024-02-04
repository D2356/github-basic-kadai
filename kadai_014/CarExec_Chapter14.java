package kadai_014;


public class CarExec_Chapter14 {

	private int gear = 1;
	private int speed = 10;
	private int afterSpeed = 0;


	public void gearChange(int afterGear) {

		System.out.println("ギア１から" + afterGear + "に切り替えました。");
		if (afterGear  < 6) {
		afterSpeed = afterGear * 10;
		System.out.println("速度は時速" + afterSpeed + "kmです。");

		}




	}
}

