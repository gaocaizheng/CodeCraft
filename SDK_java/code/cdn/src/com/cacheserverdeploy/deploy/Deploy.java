package com.cacheserverdeploy.deploy;

import com.cacheserverdeploy.node.NetNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cacheserverdeploy.node.ConsumerNode;
public class Deploy
{
	public List<NetNode> NetNodeList = new ArrayList<NetNode>();
	public List<ConsumerNode> ConsumerNodeList = new ArrayList<ConsumerNode>();	
    /**
     * 你需要完成的入口
     * <功能详细描述>
     * @param graphContent 用例信息文件
     * @return [参数说明] 输出结果信息
     * @see [类、类#方法、类#成员]
     */
    public  String[] deployServer(String[] graphContent)
    {

 
    	
        return new String[]{"17","\r\n","0 8 0 20"};
    }
    public void NetNodeInit(String[] graphContent){

    	String  temp  =  "";
    	boolean flag = true ;
    	NetNode name =  new NetNode() ;
    	String nodes0 = graphContent[0];//
    	String[] node0 = nodes0.split(" ");
    	String networkNode = node0[0];//网络节点
    	String networkLink = node0[1];//网络链路
    	String consumeNode = node0[2];//消费节点	
    	String serverCost = graphContent[2];//服务器成本
    	
    	for(int i = 4 ; i <graphContent.length;i++){
    		String nodes = graphContent[i];
    	     List<String>  list1 = new ArrayList<String>();
    	   Map<String,String> map1 = new HashMap<String,String>();
    		if(flag){
    			if(!graphContent[i].equals("")){
    				String[] node = nodes.split(" ");
                	if (!node[0].equals(temp)){
                		 name  = new NetNode();
                		
                	}
                	name .Id =node[0];
                	list1.add(node[1]);
            		name.list = list1;
            		map1.put(node[0]+"与"+node[1]+"连接的带宽",(node[2]));
            		map1.put(node[0]+"与"+node[1]+"连接的成本",(node[3]));
            	  name.map = map1;
            		 NetNodeList.add(name);
        		}
    			else{
    				flag = false ;
    			}
    		}
    		
    		else{
    			String[] node = nodes.split(" ");
    			ConsumerNode consumer = new ConsumerNode(node[0],node[1],node[2]);
    			ConsumerNodeList.add(consumer);
    			
    			
    		}
    		
    	}
 
   }

}
