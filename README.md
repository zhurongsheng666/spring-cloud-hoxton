# 1 环境准备分支  base- -release-v1.0
  (1) provider-payment,端口：9000                                     
  (2) customer-order,端口:8000                        
# 2 Eureka分支  eureka-environment-release-v1.0
  (1) eureka-server端口：7000                                                 
  (2) eureka-server-slave端口：7001                       
  (3) provider-payment-slave 9001                 
# 3 Zookeeper分支 zookeeper-environment-release-v1.0
  (1) zk-provider端口:7002                                     
  (2) zk-customer端口:8001     
# 4 Consul-enviroment-release-v1.0
  (1) consul-provider端口：7003           
  (2) consul-customer端口：8002          
# 5 Ribbon-enviroment-release-v1.0

# 6 OpenFegin-enviroment-release-v1.0
  (1) customer-fegin端口: 8003                
  
# 7 Hystrix-enviroment-release-v1.0  
  (1) provider-hystrix端口: 7004                       
  (2) customer-hystrix端口: 8004                      
  (3) hystrix-dashboard-web端口：9001                          
  
# 8 Gateway-enviroment-release-v1.0  
  (1) gateway-cloud端口: 9002                                    