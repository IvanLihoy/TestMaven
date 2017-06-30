import MyCode.Code;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by hillel on 30.06.17.
 */
public class Tests {

    @Parameters({"input"})
    @Test
    public static void Test1(String test){
        System.out.println(test);
        Assert.assertFalse(Code.isNumberBetween(test),"Bad input" + test);
    }



    @Parameters({"input"})
    @Test
    public static void Test2(String test1){
        System.out.println(test1);
        Assert.assertTrue(Code.isNumberBetween(test1));
    }












//    @Test
//    public static void Test3(){
//        Code.isNumberBetween("1999");
//    }
//    @Test
//    public static void Test4(){
//        Code.isNumberBetween("1001");
//    }
//    @Test
//    public static void Test5(){
//        Code.isNumberBetween("2000.10");
//    }
//    @Test
//    public static void Test6(){
//        Code.isNumberBetween("2000,22");
//    }
//    @Test
//    public static void Test7(){
//        Code.isNumberBetween("9999,3000,3300");
//    }
//    @Test
//    public static void Test8(){
//        Code.isNumberBetween("7000,1");
 //   }
}
