package com.bolo.annotation;

import org.hibernate.validator.util.annotationfactory.AnnotationDescriptor;
import org.hibernate.validator.util.annotationfactory.AnnotationFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bolo.annotation.impl.WordsValidator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:service-context.xml")
public class WordsValidatorTest {

	@Test
	public void testWords(){
		AnnotationDescriptor<Words> descriptor = new AnnotationDescriptor<Words>(Words.class);
		Words words = AnnotationFactory.create(descriptor);
		WordsValidator wordsValidator = new WordsValidator();
		wordsValidator.initialize(words);
		Assert.assertTrue(wordsValidator.isValid(null, null));
		Assert.assertTrue(wordsValidator.isValid("", null));
		Assert.assertTrue(wordsValidator.isValid("  ", null));
		Assert.assertFalse(wordsValidator.isValid("  菠萝大象    ", null));
		Assert.assertTrue(wordsValidator.isValid("大象", null));
		Assert.assertTrue(wordsValidator.isValid("   大象  ", null));
	}
}
