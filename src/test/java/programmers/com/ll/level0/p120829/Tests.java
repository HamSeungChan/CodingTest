package programmers.com.ll.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.com.ll.level0.p120829.Solution;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("70을 넣으면 1이나온다")
    void T1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91을 넣으면 3이나온다")
    void T2(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("90을 넣으면 2가나온다")
    void T3(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("180을 넣으면 4가나온다")
    void T4(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
