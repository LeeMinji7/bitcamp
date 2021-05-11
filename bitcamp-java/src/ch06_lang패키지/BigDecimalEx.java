package ch06_lang패키지;
import java.math.*;
import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;

class BigDecimalEx {
	public static void main(String[] args) throws Exception {
		BigDecimal bd1 = new BigDecimal("123.456"); 
		BigDecimal bd2 = new BigDecimal("1.0"); 

		System.out.print("bd1="+bd1);
		System.out.print(",\tvalue="+bd1.unscaledValue()); // . 지우기
		System.out.print(",\tscale="+bd1.scale());			// 소숫점 이하 몇자리 수 인지
		System.out.print(",\tprecision="+bd1.precision());  // 가수부 갯수
		System.out.println();

		System.out.print("bd2="+bd2);
		System.out.print(",\tvalue="+bd2.unscaledValue());
		System.out.print(",\tscale="+bd2.scale());		 
		System.out.print(",\tprecision="+bd2.precision());
		System.out.println();

		
		BigDecimal bd3 = bd1.multiply(bd2); // bd1 * bd2
		System.out.print("bd3="+bd3);
		System.out.print(",\tvalue="+bd3.unscaledValue());
		System.out.print(",\tscale="+bd3.scale());		 
		System.out.print(",\tprecision="+bd3.precision());
		System.out.println();

		System.out.println(bd1.divide(bd2, 2, HALF_UP)); // 123.46 // bd1/bd2 후 소숫점 이하 2번째 자리에서 반올림
		System.out.println(bd1.setScale(2, HALF_UP));    // 123.46 // 소숫점 이하 2번째 자리에서 반올림
		System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP))); // 소숫점 이하 2번째 자리에서 반올림한 후 부동소수점으로 만들기
	}
}
