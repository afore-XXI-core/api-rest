package com.aga.springboot.backend.apirest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aforexxicore.springboot.backend.apirest.controllers.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBackendApirestApplicationTests {

	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() {
		// no sirvio de nada el assertThat
		assertThat(controller).isNotNull();
		// la opción -Dmaven.test.skip=true en los parametros se salta el test y termina la compilación		
	}

}

