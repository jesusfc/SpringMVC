package com.test.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import org.junit.Assert;
import org.junit.Test;

public class StringTest {


  private static final CharSequence PREFIX = "[";
  private static final CharSequence SUFFIX = "]";

  @Test
  public void whenAddingElements_thenJoinedElements() {
    StringJoiner joiner = new StringJoiner(",", PREFIX, SUFFIX);
    joiner.add("Red")
        .add("Green")
        .add("Blue");

    assertEquals(joiner.toString(), "[Red,Green,Blue]");
  }

  @Test
  public void whenAddingListElements_thenJoinedListElements() {
    List<String> rgbList = new ArrayList<>();
    rgbList.add("Red");
    rgbList.add("Green");
    rgbList.add("Blue");

    StringJoiner rgbJoiner = new StringJoiner(",", PREFIX, SUFFIX);

    for (String color : rgbList) {
      rgbJoiner.add(color);
    }

    assertEquals(rgbJoiner.toString(), "[Red,Green,Blue]");
   }
}