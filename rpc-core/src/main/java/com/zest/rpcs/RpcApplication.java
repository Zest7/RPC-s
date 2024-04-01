package com.zest.rpcs;

import com.zest.rpcs.config.RegistryConfig;
import com.zest.rpcs.config.RpcConfig;
import com.zest.rpcs.utils.ConfigUtils;
import lombok.extern.slf4j.Slf4j;

import java.rmi.registry.Registry;

/**
 * @author Zest7
 * @Email tanzhangshun@163.com
 * @github https://github.com/Zest7
 * @date 2024/4/1 23:09
 * @Description: TODO
 */


@Slf4j
public class RpcApplication {
    private static volatile RpcConfig rpcConfig;
    /**
     * 框架初始化，支持传入自定义配置
     *
     * @param newRpcConfig
     */
    public static void init(RpcConfig newRpcConfig) {
        rpcConfig = newRpcConfig;
        log.info("rpc init, config = {}", newRpcConfig.toString());
    }
    /**
     * 初始化
     */
    public static void init() {
        RpcConfig newRpcConfig;
        try {
            newRpcConfig = ConfigUtils.loadConfig(RpcConfig.class,
                    "rpc");
        } catch (Exception e) {
            // 配置加载失败，使用默认值
            newRpcConfig = new RpcConfig();
        }
        init(newRpcConfig);
    }
    /**
     * 获取配置
     *
     * @return
     */
    public static RpcConfig getRpcConfig() {
        if (rpcConfig == null) {
            synchronized (RpcApplication.class) {
                if (rpcConfig == null) {
                    init();
                }
            }
        }
        return rpcConfig;
    }
}
