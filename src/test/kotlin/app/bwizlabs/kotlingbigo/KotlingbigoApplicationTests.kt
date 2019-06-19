package app.bwizlabs.kotlingbigo

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlingbigoApplicationTests {

    var MathExample myMathExample

    @BeforeEach
    fun initEach(){
        myMathExample = MathExample()
    }

    @Test
    fun contextLoads() {
    }

    @Test
    fun addTest(){

        assertEquals(2, myMathExample.addNums(1,1))

    }

}
