package com.adc.da.main.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
@Configuration
public class ElasticSearchConfig {

	@Value(value = "${clusterName}")
	private String clusterName;

	@Value(value = "${clusterNodes}")
	private String clusterNodes;
//
//	@Bean(name = "esClient")
//	public TransportClient getESClient() {
//		// 设置集群名字
//		Settings settings = Settings.builder().put("cluster.name", this.clusterName).build();
//		TransportClient client = new PreBuiltTransportClient(settings);
//
//		try {
//			// 读取的ip列表是以逗号分隔的
//			for (String clusterNode : this.clusterNodes.split(",")) {
//				String ip = clusterNode.split(":")[0];
//				String port = clusterNode.split(":")[1];
////				((TransportClient) client).addTransportAddress(
////						new InetSocketTransportAddress(InetAddress.getByName(ip), Integer.parseInt(port)));
//				client.addTransportAddresses(new TransportAddress(InetAddress.getByName(ip), Integer.parseInt(port)));
//			}
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
//		return client;
//	}
}