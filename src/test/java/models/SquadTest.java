
package models;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void squadObjectInstantiatesCorrectly_true()throws Exception{
        Squad newSquad = setupNewSquad();
        assertTrue(newSquad instanceof Squad);

    }
    @Test
    public void squadInstantiateWithName_DeadPool() throws Exception {
        Squad squad = setupNewSquad();
        assertEquals("DeadPool", squad.getName());
    }
    @Test
    public void squadInstantiateWithSize_5() throws Exception {
        Squad squad = setupNewSquad();
        assertEquals(5, squad.getSize());
    }

    @Test
    public void squadInstantiateWithCause_Fighters() throws Exception {
        Squad squad = setupNewSquad();
        assertEquals("Fighters", squad.getCause());
    }

    public Squad setupNewSquad(){
        return new Squad("DeadPool",5,"Fighters");
    }

}
