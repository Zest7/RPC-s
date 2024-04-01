import com.zest.rpcs.config.RpcConfig;
import com.zest.rpcs.utils.ConfigUtils;

/**
 * @author Zest7
 * @Email tanzhangshun@163.com
 * @github https://github.com/Zest7
 * @date 2024/4/1 21:15
 * @Description: TODO
 */


public class configtest {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc.getServerHost());
    }
}
