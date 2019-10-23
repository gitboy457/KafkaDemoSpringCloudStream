# KafkaDemo

Download kafka From 
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.3.0/kafka_2.12-2.3.0.tgz
always download bin file 

# to start Zookeeper-server fire this command at  F:\soft\kafka_2.12-2.3.0\bin\windows
zookeeper-server-start.bat ../../config/zookeeper.properties 

# to start kafka fire this command at  F:\soft\kafka_2.12-2.3.0\bin\windows
kafka-server-start.bat ../../config/server.properties 

# to create Topic in kafka fire command at  F:\soft\kafka_2.12-2.3.0\bin\windows
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic Hello-Kafka



after starting zookeper and kafka start our Spring boot application 
which contain consumer and producer for perticuler topic


# note always match kafka and spring boot version should compatible 
