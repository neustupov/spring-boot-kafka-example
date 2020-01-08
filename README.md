# spring-boot-kafka-example

1. Download Kafka - https://www.apache.org/dyn/closer.cgi?path=/kafka/2.4.0/kafka_2.12-2.4.0.tgz
2. Start Zookeeper server - $ bin/zookeeper-server-start.sh config/zookeeper.properties
3. Start Kafka - $ bin/kafka-server-start.sh config/server.properties
4. Create kafka topic - $ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example
5. Start kafka console consumer - $ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
