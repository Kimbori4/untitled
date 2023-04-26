import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import maum.brain.tts.v2.NgTtsServiceGrpc;
import maum.brain.tts.v2.TtsMediaResponse;
import maum.brain.tts.v2.TtsRequest;
import maum.common.LangV2;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class NgTtsServiceClient {
    private final NgTtsServiceGrpc.NgTtsServiceBlockingStub ngTtsServiceBlockingStub;

    public NgTtsServiceClient(Channel channel){
        ngTtsServiceBlockingStub = NgTtsServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws Exception {
        //TtsRequest ttsRequest = new TtsRequest();
        LangV2.Lang lang = LangV2.Lang.ko_KR;
        int rate = 8000;
        String text = "tts 연동합니다.";
        int speaker = 1;

        ManagedChannel channel = ManagedChannelBuilder
                //.forTarget("125.132.250.242:50051")
                //.forAddress("125.132.250.242", 50051)
                .forAddress("125.132.250.204", 50051)
                .usePlaintext()
                .build();

        try{
            NgTtsServiceClient client = new NgTtsServiceClient(channel);
            client.ttsService(text);
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

    public void ttsService(String text){
        final TtsRequest request = TtsRequest.newBuilder()
                .setLang(LangV2.Lang.ko_KR)
                .setSampleRate(8000)
                .setText(text)
                .setSpeaker(0)
                .build();

        Iterator<TtsMediaResponse> response;

        try{
            response = ngTtsServiceBlockingStub.speakWav(request);

            InetAddress ip = InetAddress.getLocalHost();
            // String ip = req.getRemoteAddr();

            System.out.println("ip:"+ip.getHostAddress());
            System.out.println("ip:"+ip.getHostName());

            Iterator<TtsMediaResponse> res2 = null;
            //System.out.println("1:"+res2.hasNext());
            System.out.println("###############");
            System.out.println(response);
            while(response.hasNext()){
                System.out.println("1");
            }

            /*while( response.hasNext() )
            {
                TtsMediaResponse res = response.next();
                System.out.println("response_1 : " + res);
                System.out.println("response_2 : " + res.toByteString());
                System.out.println("response_3 : " + res.toString());
            }
*/
            System.out.println("###############");
        }catch(Exception e){
            e.printStackTrace();

            return;
        }
    }
}
