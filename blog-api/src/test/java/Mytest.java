import org.junit.jupiter.api.Test;
public  class Mytest{
    @Test
    public void testShallowClone() throws Exception{
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}