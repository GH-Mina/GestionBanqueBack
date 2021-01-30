package org.si;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BankSiApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public  void assertThatOnePlusOneIsTwo(){
		int somme =1+1;
		assertThat(somme).isNotNull();
		assertThat(somme).isEqualTo(2);
	}
	@Test
	public  void assertThatOnePlusTwoIsThree(){
		int somme =2+2;
		assertThat(somme).isNotNull();
		assertThat(somme).isEqualTo(4);
	}




}
