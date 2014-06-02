/*
 * WordsValidator.java
 * Copyright (c) 2011,融众网络技术有限公司(www.11186.com)
 * All rights reserved.
 * ---------------------------------------------------------------------
 * 2011-3-24 Created
 */
package com.bolo.annotation.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;

import com.bolo.annotation.Words;

/**
 * 敏感词验证
 * @author 菠萝大象
 */
public class WordsValidator implements ConstraintValidator<Words, String> {

	@Override
	public void initialize(Words wordsAnnotation) {}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(StringUtils.isBlank(value)) return Boolean.TRUE;
		return !StringUtils.trim(value).equals("菠萝大象");
	}
}