package test.main4;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/*
 *   가나다라1234     =>    abcdABCD
 *   
 *    1가2나3다5라              =>    AaBbCcDd
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//비밀번호라고 가정
		String pwd="abcd1234";
		CharSequence pwd2="abcd1234";
		//비밀번호를 인코딩할 객체 생성
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		for(int i=0; i<10; i++) {
			//비밀번호를 암호화한 문자열 얻어내기 
			String result=encoder.encode(pwd);
			//수행 할때 마다 다른 문자열이 나온다.
			System.out.println(result);
		}
	
	}
}





