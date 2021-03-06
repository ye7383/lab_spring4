package local.dl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sonata herCar = new Sonata();
		ApplicationContext context =
				new ClassPathXmlApplicationContext("local\\di\\sonataBean.xml");
		Sonata myCar = null;
		myCar = (Sonata)context.getBean("myCar");
		System.out.println(myCar.toString());
		System.out.println("myCar의 속도는"+myCar.getSpeed()+"입니다.");
		Sonata himCar = null;
		himCar = (Sonata)context.getBean("himCar");
		System.out.println(himCar.toString());
		System.out.println("himCar의 속도는"+himCar.getSpeed()+"입니다.");
		Sonata yourCar = null;
		himCar = (Sonata)context.getBean("yourCar");
		System.out.println(yourCar.toString());
		System.out.println("yourCar의 속도는"+yourCar.getSpeed()+"입니다.");

	}

}
