import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

class tests {
	StringReader input = new StringReader(" a := 3");
	Reader reader = new BufferedReader(input);
	Language lang= null;
	@Test
	void test() {
		if(lang == null) {
			new Language(reader);
		}
		else {
			lang.ReInit(reader);
		}
		assertDoesNotThrow(()-> lang.START());
	}
	@Test
	void test2() {
		input = new StringReader("if tt then a:=4 else b := 3");
		reader =new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test3() {
		input = new StringReader("a := 3 ; a := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test4() {
		input = new StringReader("if( 123 == 123 ) then while(123==124) do b := 9 else c := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	
	@Test
	void test5() {
		input = new StringReader("while !(123 == 124) do e := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test6() {
		input = new StringReader("if((12-4)==(4+4)) then a:=5 else b := 9");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test7() {
		input = new StringReader("if( tt ^ ff ) then while(123==124) do b := 9 else c := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test8() {
		input = new StringReader("if tt then while !tt do b := 9 else c := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	@Test
	void test9() {
		input = new StringReader("if( ((123+245)+123)==((123-12)+124) ) then while(123==124) do e := 9 else c := 5");
		reader= new BufferedReader(input);
		lang.ReInit(reader);
		assertDoesNotThrow(()-> lang.START() );
	}
	
	
}
