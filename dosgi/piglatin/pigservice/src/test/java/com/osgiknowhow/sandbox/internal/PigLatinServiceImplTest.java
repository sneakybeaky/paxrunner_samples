package com.osgiknowhow.sandbox.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.osgiknowhow.sandbox.PigLatinService;

public class PigLatinServiceImplTest {
   private PigLatinService pigLatinService;
   
   @Before
   public void setup() {
      pigLatinService = new PigLatinServiceImpl();
   }
   
   @Test
   public void shouldTranslateASingleWordThatStartsWithUppercaseLetter() {
      assertEquals("og-DAY", pigLatinService.translate("Dog"));
   }
   
   @Test
   public void shouldTranslateASingleWordThatStartsWithLowercaseLetter() {
      assertEquals("og-dAY", pigLatinService.translate("dog"));
   }
   
   @Test
   public void shoulTranslateMultipleWords() {
      assertEquals("ogs-DAY ate-hAY ats-cAY", pigLatinService.translate("Dogs hate cats"));
   }   
}
