package template;

public class AICar extends Car{

	@Override
	public void drive() {
		
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("스스로 멈춥니다.");
		
	}

	@Override
	public void washCar() {
		System.out.println("====차를 이빠이 꺠끗하게 청소합니다.");
	}
	
	

}
