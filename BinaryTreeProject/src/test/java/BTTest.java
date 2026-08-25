import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration(
        url = "https://rmit.spiraservice.net/",
        login = "S4173128",
        rssToken = "{A5A2297A-2438-4C13-8C36-FCBE1C6C082C}",
        projectId = 1253,
        releaseId = 7,
        testSetId = 1
)

class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void isEmpty(){

    }

    @Test
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
    }

    @Test
    public void countMultiNodesTreeTest() {
    }

    @Test
    void inorderEmptyTree() {
    }

    @Test
    @SpiraTestCase(testCaseId=46649)
    public void testAdd()
    {
        double result = 3 + 3;
        assertTrue (result == 6);
    }

    @Test
    public void testCountNodes() {
        BT bt1 = new BT();

        bt1.insert(1);
        bt1.insert(2);
        bt1.insert(3);
        bt1.insert(4);
        bt1.insert(5);

        assertTrue(bt1.countNodes() == 5);
    }

}

