import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author ylfeng
 * @date 2022年01月22日 11:55
 */
public class TestStringJoiner {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s ;
        IntStream.range(1,10).forEach(i->{
            sb.append(i+"");
            if( i < 10){
                sb.append(",");
            }
        });
        System.out.println(sb);



        StringJoiner sj = new StringJoiner(",");
        IntStream.range(1,10).forEach(i->sj.add(i+"  "));
        System.out.println(sj);
    }
}
