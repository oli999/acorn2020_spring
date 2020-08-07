package test.mypac;

public class MyWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("다른 방법으로 공격해요");
	}
	
}
