package com.test.constant;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import com.constant.ParameterConstants;
import com.test.util.TestBuilder;

public class ParameterConstantsTest {

	@Test
	public void checkWellFormattedClass() throws NoSuchMethodException, InvocationTargetException,
			InstantiationException, IllegalAccessException {
		TestBuilder.assertUtilityClassWellDefined(ParameterConstants.class);
	}

}
