package com.cacheserverdeploy.linkpath;

import java.util.HashMap;
import java.util.Map;

import com.cacheserverdeploy.node.NetNode;
import com.cacheserverdeploy.node.ConsumerNode;

/**
 * 链路类，将文件中的若干行数据读入链路对象
 */
public class LInkPath {

    //成员变量
    private NetNode startNetNode;//起始网络节点
    private NetNode endNetNode;//终止节点
    private Map bandWidth_rent = new HashMap();//该链路上下行总带宽和租金

    public LInkPath() {
    }

    public LInkPath(NetNode startNetNode, NetNode endNetNode, Map bandWidth_rent) {
        this.startNetNode = startNetNode;
        this.endNetNode = endNetNode;
        this.bandWidth_rent = bandWidth_rent;
    }
    //该链路剩余带宽
    public int surplusBandWidth(ConsumerNode consumerNode){
        /*
        * 需要实现
        * */
        return 0;
    }
    //该链路已占用带宽
    public int currentBandWidth(ConsumerNode consumerNode){
        /*
        * 需要实现
        * */
        return 0;
    }


    public NetNode getEndNetNode() {
        return endNetNode;
    }

    public void setEndNetNode(NetNode endNetNode) {
        this.endNetNode = endNetNode;
    }

    public NetNode getStartNetNode() {
        return startNetNode;
    }

    public void setStartNetNode(NetNode startNetNode) {
        this.startNetNode = startNetNode;
    }

    public Map getbandWidth_rent() {
        return bandWidth_rent;
    }

    public void setbandWidth_rent(Map bandWidth_rent) {
        this.bandWidth_rent = bandWidth_rent;
    }
}
