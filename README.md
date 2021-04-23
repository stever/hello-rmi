# Simple RMI Example

## Reference

* [StackOverflow - java.rmi.ConnectException: Connection refused to host: 127.0.1.1](https://stackoverflow.com/questions/15685686/java-rmi-connectexception-connection-refused-to-host-127-0-1-1)
* [Java RMI and Object Serialization FAQ](https://docs.oracle.com/javase/7/docs/technotes/guides/rmi/faq.html)

## Compile

```bash
javac *.java
```

## Start Server

```bash
rmiregistry &
java ServerOperation
```

## Run Client

```bash
java ClientOperation
```
