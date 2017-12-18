public class JavaTypes {
	
	public static void main(String[] args) {
		
		// 숫자형 타입
		// 여기서 쓰이는 등호는 '같다'의 의미가 아니라
		// '대입한다'라는 의미로 생각하면 됨.
		// int는 정수형 숫자만 넣을수 있다.

		
		int intValue = 0;
		int num01 = 10;
		int num02 = 010; //8진수의 8을 표기 앞에 0이 8진수라는 뜻
		int num03 = 0x10; // 16진수 16을 표기 0x가 16진수라는 뜻
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		float floatVal = 3.14f;
		double doubleVal = 256.12;
		
		
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		
		
		//문자형 타입 (String은 클래스)

		String stringValue = "안녕하세요.";
		String bye = "안녕히 가세요.";
		char A = 'A';
		
		
		
		System.out.println(stringValue);
		System.out.println(bye);
		System.out.println(A);
		
		//부울
		
		boolean booltrue = true;
		boolean boolfalse = false;
		
		System.out.println(booltrue);
		System.out.println(boolfalse);
		
		
		boolean result = 1 == 2;
		boolean B = 1 != 2;
		System.out.println(result);
		System.out.println(B);
		
		boolean number = 10 == 11;
		boolean type = "삽살개" == "삽살개";
		boolean name = "누렁이" == "해피";
		
		if (number && type && name) {
			
		}
		
		//형변환
		
		byte byteRes = (byte)128;
		//int형을 강제로 byte 타입으로 변경.
		//127다음 숫자는 최소값으로 돌아감. 순환해..127-> -128 -> -127
		System.out.println(byteRes);
		
		short shortRes = (short)32768; // int -> short 형변환  
		System.out.println(shortRes);
		
		float es1 = 12.34f;
		int intes01 = (int)es1; //float -> int 형변환
		System.out.println(intes01);
		
		int charnum = 'A'; // char - > int 형변환
		System.out.println(charnum);
		
	}

}