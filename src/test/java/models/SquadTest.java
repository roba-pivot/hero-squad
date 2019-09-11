
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
        Squad squad = new Squad("DeadPool",5,"Fighters");
        assertTrue(squad instanceof Squad);

    }

}