import org.junit.Assert;
import org.junit.Test;
import ru.zavrazhin.ConteinerSolution;

public class ConteinerSolutionTest {
    @Test
    public void Example1() {
        ConteinerSolution solution = new ConteinerSolution();
        int result = solution.maxArea(new int []{1,1});
        Assert.assertEquals(1,result);

    }
    @Test
    public void Example2() {
        ConteinerSolution solution = new ConteinerSolution();
        int result = solution.maxArea(new int []{4,3,2,1,4});
        Assert.assertEquals(16,result);

    }
    @Test
    public void Example3() {
        ConteinerSolution solution = new ConteinerSolution();
        int result = solution.maxArea(new int []{1,2,1});
        Assert.assertEquals(2,result);

    }
    @Test
    public void Example4() {
        ConteinerSolution solution = new ConteinerSolution();
        int result = solution.maxArea(new int []{1,2,1,2,1,3,4,1,11});
        Assert.assertEquals(14,result);

    }
}

