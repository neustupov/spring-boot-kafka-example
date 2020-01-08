# spring-boot-kafka-example

1. ### Download Kafka 

https://www.apache.org/dyn/closer.cgi?path=/kafka/2.4.0/kafka_2.12-2.4.0.tgz

2. ### Start Zookeeper server

#### $ bin/zookeeper-server-start.sh config/zookeeper.properties 
or if you have Couldnot find or load main class QuorumPeerMain Exception
#### $ bin/windows/zookeeper-server-start.bat config/zookeeper.properties

3. ### Start Kafka 

#### $ bin/kafka-server-start.sh config/server.properties 
or 
#### $ bin/windows/kafka-server-start.bat config/server.properties

4. ### Create kafka topic  

#### $ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example
or
#### $ bin/windows/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example

5. ### Start kafka console consumer  

#### $ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
or
#### $ bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
