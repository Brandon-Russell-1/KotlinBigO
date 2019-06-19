package app.bwizlabs.kotlingbigo


import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner




@RunWith(SpringRunner::class)
@SpringBootTest
class KotlingbigoApplicationTests {

    private var myMathExample = MathExample()


    @BeforeEach
    fun initEach() {
        myMathExample = MathExample()
    }


    @Test
    fun contextLoads() {
    }

    @Test
    fun addTest(){

        Assertions.assertEquals(2, myMathExample.addNums(1,1))

    }

}
