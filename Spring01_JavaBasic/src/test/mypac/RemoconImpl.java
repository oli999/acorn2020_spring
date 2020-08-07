package test.mypac;

public class RemoconImpl implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
	}

}
