package com.test.constant;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import com.constant.ViewConstants;
import com.test.util.TestBuilder;

public class ViewConstantsTest {

	@Test
	public void checkWellFormattedClass() throws NoSuchMethodException, InvocationTargetException,
			InstantiationException, IllegalAccessException {
		TestBuilder.assertUtilityClassWellDefined(ViewConstants.class);
	}

}
