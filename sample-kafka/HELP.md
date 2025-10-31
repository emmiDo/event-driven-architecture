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

Producer console:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic order_events`

`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic order_events --producer-property acks=all`

Auto create topic:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic auto_events`

Produce data with key and value:
`.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic auto_events --property parse.key=true --property key.separator=:`

### Reference Documentation
For further reference, please consider the following sections:

### Maven Parent overrides


