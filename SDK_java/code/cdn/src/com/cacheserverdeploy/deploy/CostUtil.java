package com.cacheserverdeploy.deploy;

public class CostUtil {
	/**
	 * 服务器费用
	 * @param serverNum   服务器的数量
	 * @param everyServerCost  每个服务器的成本
	 * @return
	 */
	public static double getServerCost(int serverNum,int everyServerCost){
		return serverNum*everyServerCost;  
	}
	
	/**
	 * 每条链路的费用
	 * @param erveryCost  每GB的租用成本
	 * @param consumeBandwidth  需要多少带宽GB
	 * @return
	 */
	public static double getRentCharge(int erveryCost,int consumeBandwidth){
		return erveryCost*consumeBandwidth;
	}

	/**
	 * 总成本费用
	 * @param serverCost  服务器成本
	 * @param rentCharge  租用成本
	 * @return
	 */
	public static double getTotalCost(int serverCost,int rentCharge) {
		return serverCost+rentCharge;
	}
}
