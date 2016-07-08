import com.github.dhirabayashi.kotlin.study2.Base
import com.github.dhirabayashi.kotlin.study2.Derived
import org.junit.Test
import org.assertj.core.api.Assertions.*

class InheritanceSampleTest {
    @Test
    fun test_base() {
        val base = Base()
        assertThat(base.v()).isEqualTo("super class")
        assertThat(base.f()).isEqualTo("function")
    }

    @Test
    fun test_derived() {
        val d = Derived()
        assertThat(d.v()).isEqualTo("sub class")
        assertThat(d.f()).isEqualTo("function")
    }
}