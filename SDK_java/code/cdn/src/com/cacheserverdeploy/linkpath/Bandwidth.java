package com.cacheserverdeploy.linkpath;

public class Bandwidth {
	
	/**
	 * 链路带宽是否满足
	 * @param totalBandwidth   总的链路带宽
	 * @param inUse   在使用之中的带宽
	 * @param currentNeed  目前需要的带宽
	 * @return
	 */
	public static int nodeLinkNeed(int totalBandwidth,int inUse,int currentNeed) {
		return totalBandwidth > inUse+currentNeed ? 1 : 0;
	}
	
	/**
	 * 消费节点的带宽需求
	 * @param consumeNode  消费节点
	 * @param graphContent 数据采集数组
	 * @return
	 */
	public static int consumeNodeNeed(int consumeNode,String[] graphContent) {
		String consumeNodeNeed=""; //返回的带宽需求
		int len = graphContent.length;
		for (int i = len-1; i >= 0; i--) {
			String consumeNodeBandwidth = graphContent[i];//每组消费节点,所连接的网络节点和消费带宽需求
			String[] consumeNodeLink = consumeNodeBandwidth.split(" "); //分割每组消费节点
			if (consumeNodeLink[0].equals(consumeNode)) { 
				consumeNodeNeed = consumeNodeLink[2];
				break;
			}
			
		}
		return  Integer.valueOf(consumeNodeNeed);
	}
}
