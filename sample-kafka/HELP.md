# Start Kafka (for Kafka 4.1.0, ZooKeeper is not needed)
1. Change log directory path (only once): log.dirs from config/server.properties
2. Generate cluster uuid (only once): `.\bin\windows\kafka-storage.bat random-uuid` (eg: ZjJ6A509SsdasdaZaY7FAS-Q)
3. Format log directory (only once): `.\bin\windows\kafka-storage.bat format --standalone -t ZjJ6A509SsdasdaZaY7FAS-Q -c config\server.properties`
4. Start kafka server: `.\bin\windows\kafka-server-start.bat config\server.properties`

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

### Maven Parent overrides


