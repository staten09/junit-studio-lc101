package test;

import org.junit.Test;

import static org.junit.Assert.*;

import main.BalancedBrackets;

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
    public void doesNotHaveCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsContainBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsDONOTContactBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void noSquareBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void hasClosingBracketFirst(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyHasClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void twoOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }


    @Test
    public void addTwoNumbers(){
        assertEquals(5,BalancedBrackets.sum(1,4));
    }

    @Test
    public void noOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void stringContainsBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test
    public void inputContainsA(){
        assertTrue(BalancedBrackets.containsA("Blake"));
    }
}
