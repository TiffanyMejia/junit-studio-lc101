package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void correctlyBracketedString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void hasBracketsAtFrontOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void codeInLaunchCodeIsBracketed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }


    //Negative Tests


    @Test
    public void backwardsPairReturnsFalse() {
       assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode["));
    }

   @Test
   public void hasBracketsInIncorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
   }

    @Test
    public void emptyStringMissingCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringMissingCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
}
