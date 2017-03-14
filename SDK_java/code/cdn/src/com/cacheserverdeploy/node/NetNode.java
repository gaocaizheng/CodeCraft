package com.cacheserverdeploy.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by chaolun on 2017/3/11.
 * 该类设为网络节点
 */
public class NetNode{
    public String Id;//该网络节点编号
    public List<String>  list = new ArrayList<String>();
    public Map<String,String> map = new HashMap<String,String>();
    ConsumerNode consumerNode;//如果与消费者相连则创建消费者实例，因为网络节点随时可能与消费者相连
    boolean isDeployFlag = false;//初始认为没部署服务器
    /*
    * 部署服务器的方法
    * */
    void deploymentServer(){
        isDeployFlag = true;//部署服务器后设为true
    }
    
    
    
}
