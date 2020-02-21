package com.telefone.demo.repository;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.telefone.demo.models.ControleTelefone;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TelefoneRepositoryTest {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Test
	public void testaBuscaTelefone() {
		List<ControleTelefone> telefone = telefoneRepository.findAll();
		assertThat(telefone.size(), equalTo(1));
	}
}
