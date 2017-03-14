package com.cacheserverdeploy.node;

/**
 * Created by chaolun on 2017/3/11.
 */
public class ConsumerNode{
  
	public String Id;//该消费节点id
    public String linkNOde;//与消费者相连的网络节点
    public String needBandwidth;//该消费节点所需总带宽

    public ConsumerNode() {}

    public ConsumerNode(String cId,String linkNOde, String needBandwidth) {
        this.Id=cId;
        this.linkNOde = linkNOde;
        this.needBandwidth = needBandwidth;
    }

    /*
    * 生成相应属性的set和get方法
    * */
    public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getLinkNOde() {
		return linkNOde;
	}

	public void setLinkNOde(String linkNOde) {
		this.linkNOde = linkNOde;
	}

	public String getNeedBandwidth() {
		return needBandwidth;
	}

	public void setNeedBandwidth(String needBandwidth) {
		this.needBandwidth = needBandwidth;
	}



}
