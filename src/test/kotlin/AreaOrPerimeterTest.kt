import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class AreaOrPerimeterTest {

    private val sut = AreaOrPerimeter()

    @Test
    fun areaOrPerimeter__square() {
        assertThat(sut.areaOrPerimeter(3, 3)).isEqualTo(9)
    }

    @Test
    fun areaOrPerimeter__rectangle() {
        assertThat(sut.areaOrPerimeter(3, 4)).isEqualTo(14)
    }

}