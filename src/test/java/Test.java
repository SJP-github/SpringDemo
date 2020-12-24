import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.concurrent.CompletableFuture;

public class Test {

    @org.junit.Test
    public void test01() {
        CompletableFuture<Void> completableFuture =CompletableFuture.runAsync(()->{
            System.out.println("begin");
            try {
                CloseableHttpClient client = HttpClients.createDefault();
                HttpGet httpGet = new HttpGet();
                System.out.println("before =============================");
                //client.execute(httpGet);
                System.out.println("after ==============================");
            } catch (Exception e) {
                System.out.println("输出异常信息"+e.toString());
            }
            System.out.println("==>");
        });
        if (completableFuture.isCompletedExceptionally()) {
            System.out.println("exception");
        }
        if (completableFuture.isDone()) {
            System.out.println("is done");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
