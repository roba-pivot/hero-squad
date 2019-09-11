package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void checkForCorrectInstantiationOfHeroClass_true() throws Exception {
        Hero hero = setUpNewHero();
        assertTrue(hero instanceof Hero);
    }
    public Hero setUpNewHero(){
        return new Hero("Hulk", 67, "Transformation", "Hunger",1);
    }
}
