package com.filetool.main;

import com.cacheserverdeploy.deploy.Deploy;
import com.filetool.util.FileUtil;
import com.filetool.util.LogUtil;

/**
 * 
 * 工具入口
 * 
 * @version  [版本号, 2017-1-9]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Main
{
    public static void main(String[] args)
    {

        String graphFilePath ="/home/gao/my-work/华为CodeCraft/输入数据case/case_example/case0.txt";
        String resultFilePath = "/home/gao/result.txt";
        LogUtil.printLog("Begin");

        // 读取输入文件
        String[] graphContent = FileUtil.read(graphFilePath, null);
        
        
        Deploy deploy = new Deploy();
        
        // 网络节点和消费节点初始化
        deploy.NetNodeInit(graphContent);
        
        //网络节点调试
        for(int i =0 ; i <deploy.NetNodeList.size();i++ )
        {
        	 System.out.println("网络节点编号  "+deploy.NetNodeList.get(i).Id);
        	 for(int j = 0 ;j <deploy.NetNodeList.get(i).list.size();j++){
        		 System.out.println("与编号"+deploy.NetNodeList.get(i).Id+"相连的节点   "+deploy.NetNodeList.get(i).list.get(j)+"   ");
        		 for(int z = 0 ;z <deploy.NetNodeList.get(i).map.size();z++){
        			 System.out.println(deploy.NetNodeList.get(i).Id+"与"+deploy.NetNodeList.get(i).list.get(j)+"连接的带宽"+": "+deploy.NetNodeList.get(i).map.get(deploy.NetNodeList.get(i).Id+"与"+deploy.NetNodeList.get(i).list.get(j)+"连接的带宽"));
        			 System.out.println(deploy.NetNodeList.get(i).Id+"与"+deploy.NetNodeList.get(i).list.get(j)+"连接的成本"+": "+deploy.NetNodeList.get(i).map.get(deploy.NetNodeList.get(i).Id+"与"+deploy.NetNodeList.get(i).list.get(j)+"连接的成本"));
            	 }
        	 }
        	 
        	
        }
        //消费节点调试
        for(int i =0 ; i <deploy.ConsumerNodeList.size();i++ ){
        	 System.out.println("消费节点 编号"+deploy.ConsumerNodeList.get(i).Id);
        	 System.out.println(" 消费节点"+deploy.ConsumerNodeList.get(i).Id+"连接的网络节点"+deploy.ConsumerNodeList.get(i).linkNOde+"需要带宽"+deploy.ConsumerNodeList.get(i).needBandwidth);
        	
        }
       
        // 功能实现入口
        String[] resultContents = deploy.deployServer(graphContent);

        // 写入输出文件
        if (hasResults(resultContents))
        {
            FileUtil.write(resultFilePath, resultContents, false);
        }
        else
        {
            FileUtil.write(resultFilePath, new String[] { "NA" }, false);
        }
        LogUtil.printLog("End");
    }
    
    private static boolean hasResults(String[] resultContents)
    {
        if(resultContents==null)
        {
            return false;
        }
        for (String contents : resultContents)
        {
            if (contents != null && !contents.trim().isEmpty())
            {
                return true;
            }
        }
        return false;
    }

}
