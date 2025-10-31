# Start Kafka (for Kafka 4.1.0, ZooKeeper is not needed)
1. Change log directory path (only once): log.dirs from config/server.properties
2. Generate cluster uuid (only once): `.\bin\windows\kafka-storage.bat random-uuid` (eg: ZjJ6A509SsdasdaZaY7FAS-Q)
3. Format log directory (only once): `.\bin\windows\kafka-storage.bat format --standalone -t ZjJ6A509SsdasdaZaY7FAS-Q -c config\server.properties`
4. Start kafka server: `.\bin\windows\kafka-server-start.bat config\server.properties`

# Kafka topics
Create topic:
`.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic order_events`

`.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic payment_events`

List topics:
`.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092`

Describe a topic:
`.\bin\windows\kafka-topics.bat --topic order_events --describe --bootstrap-server localhost:9092`

## Producer side

Producer console:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic order_events`

`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic order_events --producer-property acks=all`

Auto create topic:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic auto_events`

Produce data with key and value:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic auto_events --property parse.key=true --property key.separator=:`

Round robin partition:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --producer-property partitioner.class=org.apache.kafka.clients.producer.RoundRobinPartitioner --topic auto_events`

## Consumer side:
Read messages (instant messages):
`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic auto_events`

Consume from the beginning:
`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic auto_events --from-beginning`

Consume more info of messages from the beginning:
`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic auto_events --property print.timestamp=true --property print.key=true --property print.value=true --from-beginning`

### Reference Documentation
For further reference, please consider the following sections:

### Maven Parent overrides


