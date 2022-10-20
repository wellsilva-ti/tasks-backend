package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2032, 01, 01);
/* 		DateUtils.isEqualOrFutureDate(date); */
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
/*		System.out.println(DateUtils.isEqualOrFutureDate(date));*/
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2012, 01, 01);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deveRetornarTrueParaDataAtual() {
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
}
